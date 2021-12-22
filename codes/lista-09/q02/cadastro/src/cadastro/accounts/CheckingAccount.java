package cadastro.accounts;

public class CheckingAccount extends Account {
    //inicializa conta.type com "CC"
    public CheckingAccount(int id, String idClient){
        super(id, idClient);
        this.type = "CC";
    }

    //retira 20 do saldo
    public void monthlyUpdate(){
        this.balance -= 20;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
