package cadastro.accounts;

public abstract class Account {
    protected int id;
    protected float balance;
    protected String clientId;
    protected String type; //CC or CP

    public Account(int id, String clientId){
        this.id = id;
        this.clientId = clientId;
    }


    @Override
    public String toString(){
        return "";
    }

    //abstract method
    public abstract void monthlyUpdate();

    //saque
    public void withdraw(float value){

    }
    //deposito
    public void deposit(float value){

    }

    //transferencia para outra conta
    public void transfer(Account other, float value){

    }

    //GETS and SETS
    int getId(){
        return this.id;
    }

    float getBalance(){
        return this.balance;
    }

    String getClientId(){
        return this.clientId;
    }

    String getType(){
        return this.type;
    }
}
