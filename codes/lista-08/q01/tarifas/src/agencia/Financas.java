package agencia;

import java.util.ArrayList;
import java.util.List;

public class Financas {
    //O id da próxima operação dessa conta
    private int nextId;
    //A lista de operações realizadas
    private List<Operacao> extrato;
    private int saldo;

    public Financas(){
        this.saldo = 0;
        this.extrato = new ArrayList<Operacao>();
        this.nextId = 0;
    }

    public String toString(){
        return "saldo:" + this.saldo;
    }

    //Adiciona value ao saldo
    //Crie operação e adiciona ao vetor de operações
    //Incrementa o nextId
    public void addOperacao(Label label, int value){
        value = Math.abs(value);

        switch (label){
            case ABERTURA: case DEPOSITO: case EXTORNO:
                this.saldo += value;
                break;

            case SAQUE: case TARIFA:
                this.saldo -= value;
                value *= -1;
                break;
        }

        this.extrato.add(new Operacao(this.nextId, label, value, this.saldo));
        this.nextId++;
    }

    public List<Operacao> getExtrato(int qtdOp){
        List<Operacao> lastValuesList = new ArrayList<Operacao>(qtdOp);

        for (int cont = this.nextId - qtdOp; cont < this.nextId; cont++){
            lastValuesList.add(this.extrato.get(cont));
        }

        return lastValuesList;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int getNextId(){
        return this.nextId;
    }

    List<Operacao> getExtrato(){
        return this.extrato;
    }

}
