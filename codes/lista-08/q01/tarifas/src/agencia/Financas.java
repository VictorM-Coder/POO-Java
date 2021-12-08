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
        switch (label){
            case ABERTURA:
                this.saldo = value;
                break;

            case DEPOSITO:
                this.saldo += value;
                break;

            case SAQUE:
                this.saldo -= value;
                break;

            case TARIFA:
                this.saldo -= value;
                break;

            case EXTORNO:
                break;
        }

        this.extrato.add(new Operacao(this.nextId, label, value, this.saldo));
    }

    public int getSaldo(){
        return this.saldo;
    }

    List<Operacao> getExtrato(){
        return this.extrato;
    }

    public List<Operacao> getExtrato(int qtdOp){
        return this.extrato;
    }
}
