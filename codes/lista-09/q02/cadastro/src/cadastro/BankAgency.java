package cadastro;

import cadastro.accounts.Account;

import java.util.Map;

public class BankAgency {
    private Map<String, Client> clients;
    private Map<Integer, Account> accounts;
    private int nextAccountId = 0;

    public BankAgency(){

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

    }

    //obtem o cliente e invoca as ações
    public void withdraw(int idConta, float value){

    }

    public void deposit(int idConta, float value){

    }

    public void transfer(int contaDe, int contaPara, float value){

    }

    public void monthlyUpdate(){

    }

    //obtém conta ou lança excessão
    private Account getAccount(int id){
        return null;
    }
}