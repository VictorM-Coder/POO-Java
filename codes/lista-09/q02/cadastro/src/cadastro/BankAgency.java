package cadastro;

import cadastro.accounts.Account;
import cadastro.accounts.AccountException;
import cadastro.accounts.CheckingAccount;
import cadastro.accounts.SavingsAccount;

import java.util.HashMap;
import java.util.Map;

public class BankAgency {
    private Map<String, Client> clients;
    private Map<Integer, Account> accounts;
    private int nextAccountId = 0;

    public BankAgency(){
        this.clients = new HashMap<String, Client>();
        this.accounts = new HashMap<Integer, Account>();
    }

    @Override
    public String toString(){
        return "";
    }

    //se o cliente não existir
    //cria o cliente
    //cria uma conta poupança e uma conta corrent para o cliente
    //adiciona essas contas no vetor de contas e no vetor do cliente
    //adiciona o cliente no mapa de clientes
    public void addClient(String clientId){
        if (!this.clients.containsKey(clientId)){
            this.registerClient(clientId);
        }
    }

    //obtem o cliente e invoca as ações
    public void withdraw(int idConta, float value){
        this.accounts.get(idConta).withdraw(value);
    }

    public void deposit(int idConta, float value){
        this.accounts.get(idConta).deposit(value);
    }

    public void transfer(int contaDe, int contaPara, float value){
        this.accounts.get(contaDe).transfer(this.accounts.get(contaPara), value);
    }

    public void monthlyUpdate(){
        for (int cont  = 0; cont < this.nextAccountId; cont++){
            this.accounts.get(cont).monthlyUpdate();
        }
    }

    //obtém conta ou lança excessão
    private Account getAccount(int id){
        Account account;

        try{
            account = this.accounts.get(id);
            return account;
        }catch (RuntimeException e){
            throw new AccountException("fail: conta nao encontrada");
        }
    }

    private void registerClient(String clientId){
        Client client = new Client(clientId);
        Account savingAccount = new SavingsAccount(this.nextAccountId, clientId);
        Account checkingAccount = new CheckingAccount(this.nextAccountId, clientId);

        client.addAccount(savingAccount);
        client.addAccount(checkingAccount);

        this.addAccount(savingAccount);
        this.addAccount(checkingAccount);

        this.clients.put(clientId, client);
    }

    private void addAccount(Account account){
        this.accounts.put(this.nextAccountId, account);
        this.nextAccountId++;
    }

    private String clientsToString(){
        String out = "";

        return "";
    }

    private String accountsToString(){
        String out = "";

        for (int cont = 0; cont < this.nextAccountId; cont++){
            out += this.accounts.get(cont);

            if (cont != (this.nextAccountId - 1)){
                out += "\n";
            }
        }
        return out;
    }
}