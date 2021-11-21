package pulapula;

import java.util.LinkedList;

public class Trampoline{
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;

    public Trampoline(){

    }

    public String toString(){
        return "";
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
        return null;
    }

    //remove and return the Kid with this name or null
    private Kid remove_kid(String name, LinkedList<Kid> list){
        return null;
    }
}