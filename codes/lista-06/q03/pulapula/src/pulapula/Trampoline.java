package pulapula;

import java.util.LinkedList;

public class Trampoline{
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;

    public Trampoline(){
        waiting = new LinkedList<>();
        playing = new LinkedList<>();
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

    //remove and return the Kid with this name or null
    private Kid removeKid(String name, LinkedList<Kid> list){
        for (int cont = 0; cont < list.size(); cont++){
            if (list.get(cont).getName().equals(name)){
                return list.remove(cont);
            }
        }

        return null;
    }

    private String inverseList(LinkedList<Kid> list){
        String inverseList = "";

        for (int cont = (list.size() - 1); cont >= 0; cont--){
            inverseList += list.get(cont) + " ";
        }

        return inverseList;
    }
}