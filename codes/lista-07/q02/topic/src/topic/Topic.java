package topic;

import java.util.ArrayList;

public class Topic {
    private ArrayList<Pass> prioritySeats;
    private ArrayList<Pass> normalSeats;

    public Topic(int capacity, int qtdPriority){
        this.normalSeats = new ArrayList<>(capacity - qtdPriority);
        this.prioritySeats = new ArrayList<>(qtdPriority);

        this.initializeSeats(this.normalSeats, capacity - qtdPriority);
        this.initializeSeats(this.prioritySeats, qtdPriority);
    }

    public String toString(){
        String out = "[" + this.getLinePass(this.prioritySeats, '@') + " " + this.getLinePass(this.normalSeats, '=') + "]";

        return out;
    }

    //return the first free pos or -1
    private int findFirstFreePos(ArrayList<Pass> list){
        return list.indexOf(null);
    }

    //search in list using name and return position or return -1
    private int findByName(String name, ArrayList<Pass> list){
        for (int cont  = 0; cont < list.size(); cont++){
            Pass roundPass = list.get(cont);

            if (roundPass != null){
                if (roundPass.getName().equals(name)){
                    return cont;
                }
            }
        }

        return -1;
    }

    //use the findFirstFreePos to search a free position
    //if exists, insert the pass and return true
    //else return false
    private boolean insertOnList(Pass pass, ArrayList<Pass> list){
        int indexFree = this.findFirstFreePos(list);

        if (indexFree != -1){
            list.set(indexFree, pass);
            return true;
        }else {
            return false;
        }
    }

    //use the findByName method to locate pos in list, if found, remore the person
    //setting the pos location to null
    private boolean removeFromList(String name, ArrayList<Pass> list){
       int indexPos = this.findByName(name, list);

       if (indexPos != -1){
           list.set(indexPos, null);
           return true;
       }else{
           return false;
       }
    }

    //use findByName to test if the pass is already in the topic
    //use the insertOnList method to insert in the right list based in
    //the pass.isPriority result
    public boolean insert(Pass pass){
        boolean sucess = true;
        if ((this.findByName(pass.getName(), this.normalSeats) == -1) && (this.findByName(pass.getName(), this.prioritySeats) == -1)){
            if (pass.isPriority()){
                if (!this.insertOnList(pass, this.prioritySeats)){
                    if (!this.insertOnList(pass, this.normalSeats)){
                        System.out.println("fail: topic lotada");
                        sucess = false;
                    }
                }
            }else {
                if (!this.insertOnList(pass, this.normalSeats)){
                    if (!this.insertOnList(pass, this.prioritySeats)){
                        System.out.println("fail: topic lotada");
                        sucess = false;
                    }
                }
            }

        }else{
            System.out.println("fail: pass ja esta na topic");
            sucess = false;
        }

        return sucess;
    }

    //use the removeFromList method to try to remove from both lists
    public boolean remove(String name){
        if (!this.removeFromList(name, this.normalSeats)){
            if (!this.removeFromList(name, this.prioritySeats)){
                System.out.println("fail: pass nao esta na topic");
                return false;
            }
        }

        return true;
    }

    private String getLinePass(ArrayList<Pass> passes, char mark){
        String out = "";

        for (int cont = 0; cont < passes.size(); cont++){
            out += mark;
            if (passes.get(cont) != null){
                out += passes.get(cont);
            }
            if (cont != (passes.size() - 1)){
                out += " ";
            }
        }

        return out;
    }

    private void initializeSeats(ArrayList<Pass> passes, int size){
        for (int cont = 0; cont  < size; cont++){
            passes.add(null);
        }
    }
}
