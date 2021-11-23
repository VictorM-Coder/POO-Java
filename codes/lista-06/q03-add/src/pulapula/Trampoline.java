package pulapula;

import java.util.LinkedList;

public class Trampoline{
    public static final double TICKET_PRICE = 2;
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;
    private int maxAge;
    private double caixa;

    public Trampoline(){
        waiting = new LinkedList<>();
        playing = new LinkedList<>();
    }

    public Trampoline(int maxAge){
        this();
        this.maxAge = maxAge;
    }

    public String toString(){
        return "=> " + this.inverseList(this.waiting) + "=> [ " + this.inverseList(this.playing) + "]";
    }

    //insere na lista de espera
    public void arrive(Kid kid){
        this.waiting.add(kid);
    }

    //remove da lista de espera e insere na lista playing
    public void in(){
        this.playing.add(this.waiting.remove(0));
    }

    //remove de playing para wainting
    public void out(){
        this.playing.get(0).incrementBill();
        this.incrementSaldo();

        this.waiting.add(this.playing.remove(0));
    }

    //remove do parquinho
    public Kid remove(String name){
        Kid kidReturn = this.removeKid(name, this.waiting);

        if (kidReturn == null){
            kidReturn =  this.removeKid(name, this.playing);
        }

        return kidReturn;
    }

    //retira todas as criancas do pula pula e da fila
    public void fechar(){
        this.playing.clear();
        this.waiting.clear();
    }

    public double getSaldo(String name){
        Kid kidReturn = waiting.get(this.searchIndexKidByName(name, this.waiting));

        if (kidReturn == null){
            kidReturn =  this.playing.get(this.searchIndexKidByName(name, this.playing));
        }

        return kidReturn.getBill();
    }

    public double getCaixa() {
        return caixa;
    }

    //remove and return the Kid with this name or null
    private Kid removeKid(String name, LinkedList<Kid> list){
        return list.remove(this.searchIndexKidByName(name, list));
    }

    private int searchIndexKidByName(String name, LinkedList<Kid> list){
        for (int cont = 0; cont < list.size(); cont++){
            if (list.get(cont).getName().equals(name)){
                return cont;
            }
        }

        return -1;
    }

    private String inverseList(LinkedList<Kid> list){
        String inverseList = "";

        for (int cont = (list.size() - 1); cont >= 0; cont--){
            inverseList += list.get(cont) + " ";
        }

        return inverseList;
    }

    private void incrementSaldo(){
        this.caixa += TICKET_PRICE;
    }
}