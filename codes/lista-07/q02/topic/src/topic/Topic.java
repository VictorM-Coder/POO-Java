package topic;

import java.util.ArrayList;

public class Topic {
    private ArrayList<Pass> prioritySeats;
    private ArrayList<Pass> normalSeats;

    public Topic(int capacity, int qtdPriority){

    }

    public String toString(){
        return "";
    }

    //return the first free pos or -1
    private int findFirstFreePos(ArrayList<Pass> list){
        return -1;
    }

    //search in list using name and return position or return -1
    private int findByName(String name, ArrayList<Pass> list){
        return -1;
    }

    //use the findFirstFreePos to search a free position
    //if exists, insert the pass and return true
    //else return false
    private boolean insertOnList(Pass pass, ArrayList<Pass> list){
        return false;
    }

    //use the findByName method to locate pos in list, if found, remore the person
    //setting the pos location to null
    private boolean removeFromList(String name, ArrayList<Pass> list){
        return false;
    }

    //use findByName to test if the pass is already in the topic
    //use the insertOnList method to insert in the right list based in
    //the pass.isPriority result
    public boolean insert(Pass pass){
        return false;
    }

    //use the removeFromList method to try to remove from both lists
    public boolean remove(String name){
        return false;
    }
}
