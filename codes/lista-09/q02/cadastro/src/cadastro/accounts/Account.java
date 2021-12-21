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
        return String.format("%d:%s:%f:%c", this.id, this.clientId, this.balance, this.type);
    }

    //abstract method
    public abstract void monthlyUpdate();

    /**
     * realiza o saque na conta
     * @param value valor que será sacado
     */
    public void withdraw(float value){
        if (isBalanceEnough(value)){
            this.balance -= value;
        }
    }

    /**
     * realiza o depósito na conta
     * @param value valor que será depositado
     */
    public void deposit(float value){
        this.balance += value;
    }

    /**
     * realiza a retirada de um valor em uma conta e o depósito em outra
     * @param other conta para qual o valor será transferido
     * @param value valor que será transferido
     */
    public void transfer(Account other, float value){
        if (this.isBalanceEnough(value)){
            this.withdraw(value);
            other.deposit(value);
        }
    }

    private boolean isBalanceEnough(float value){
        if (this.balance >= value){
            return true;
        }
        System.out.println("fail: saldo insuficiente");
        return false;
    }

    //GETS and SETS
    public int getId(){
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
