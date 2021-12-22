package cadastro.accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, String idClient){
        super(id, idClient);
        this.type = "CP";
    }

    //aumenta saldo em 1%
    public void monthlyUpdate(){
        this.balance *= 1.01;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}