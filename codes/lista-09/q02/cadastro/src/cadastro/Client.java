package cadastro;

import cadastro.accounts.Account;

import java.util.List;

public class Client {
    private String clientId;
    private List<Account> accounts;

    public Client(String clientId){
        this.clientId = clientId;
    }

    public String toString(){
        return "";
    }

    public void addAccount(Account account){

    }

    //GETS and SETS
    String getClientId(){
        return this.clientId;
    }

    void setClientId(String clientId){
        this.clientId = clientId;
    }

    List<Account> getAccounts(){
        return this.accounts;
    }
    void setAccounts(List<Account> accounts){
        this.accounts = accounts;
    }
}