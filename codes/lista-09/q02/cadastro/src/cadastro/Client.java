package cadastro;

import cadastro.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Client implements Comparable{
    private String clientId;
    private List<Account> accounts;

    public Client(String clientId){
        this.clientId = clientId;
        this.accounts = new ArrayList<Account>();
    }

    public String toString(){
        return "- " + this.clientId + this.accountsIdToString();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    private String accountsIdToString(){
        String out = "[";
        for (int cont = 0; cont < this.accounts.size(); cont++){
            out += this.accounts.get(cont).getId();

            out += (cont < (this.accounts.size() - 1))? ",": "";
        }

        return out + "]";
    }

    @Override
    public int compareTo(Object o) {
        return this.accounts.get(0).getId() - ((Client) o).accounts.get(0).getId();
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