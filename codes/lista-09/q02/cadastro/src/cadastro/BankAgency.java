package cadastro;

import cadastro.accounts.Account;
import cadastro.accounts.AccountException;
import cadastro.accounts.CheckingAccount;
import cadastro.accounts.SavingsAccount;

import java.util.*;

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
        return "Clients:\n" +
                this.clientsToString() +
                "Accounts:\n" +
                this.accountsToString();
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

    /**
     *
     * @param id
     * @return a conta pertencente ao id
     * @throws AccountException
     */
    private Account getAccount(int id) throws AccountException{
        if (this.accounts.containsKey(id)){
            return this.accounts.get(id);
        }else{
            throw new AccountException("fail: conta nao encontrada");
        }
    }

    private void registerClient(String clientId){
        Client client = new Client(clientId);

        Account checkingAccount = new CheckingAccount(this.nextAccountId, clientId);
        client.addAccount(checkingAccount);
        this.addAccount(checkingAccount);

        Account savingAccount = new SavingsAccount(this.nextAccountId, clientId);
        client.addAccount(savingAccount);
        this.addAccount(savingAccount);

        this.clients.put(clientId, client);
    }

    private void addAccount(Account account){
        this.accounts.put(this.nextAccountId, account);
        this.nextAccountId++;
    }

    private String clientsToString(){
        String out = "";

        List<Client> clients = new ArrayList<>(this.clients.values());

        Collections.sort(clients);

        for (Client client: clients){
            out += client + "\n";
        }

        return out;
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