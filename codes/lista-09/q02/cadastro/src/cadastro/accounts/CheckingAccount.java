package cadastro.accounts;

public class CheckingAccount extends Account {
    //inicializa conta.type com "CC"
    public CheckingAccount(int id, String idClient){
        super(id, idClient);
    }
    //retira 20 do saldo
    public void monthlyUpdate(){

    }
}
