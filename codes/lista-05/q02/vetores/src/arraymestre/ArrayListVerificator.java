package arraymestre;

import java.util.ArrayList;
/*
* o principal objetivo desta classe é realizar os testes de verificação antes de realizar os métodos
* OBS.:Eu optei,por fins de organização, em criar uma classe separada para implementar as funções usadas na solver.
 *então as declarei aqui com o modificador estático.
 */
public class ArrayListVerificator {
    public static void removeItemByIndex(int index, ArrayList<Integer> vet){
        if (checkInterval(index, vet)){
            vet.remove(index);
        }else{
            System.out.println("fail");
        }
    }

    public static void getItemByIndex(int index, ArrayList<Integer> vet){
        if (checkInterval(index, vet)){
            System.out.println(vet.get(index));
        }
    }

    public static void setItemByIndex(int index, int element, ArrayList<Integer> vet){
        if (checkInterval(index, vet)){
            vet.set(index, element);
        }
    }

    public static void removeAllElements(int value, ArrayList<Integer> vet){
        for (int cont = 0; cont < vet.size(); cont++){
            if (value ==  vet.get(cont)){
                vet.remove(cont);
                cont--;
            }
        }
    }

    public static void insertElementByIndex(int index, int element, ArrayList<Integer> vet){
        if (index >= 0){
            if (index >= vet.size()){
                vet.add(element);
            }else{
                vet.add(index, element);
            }
        }
    }

    private static boolean checkInterval(int index, ArrayList<Integer> vet){
        if (index >= 0 && index < vet.size()){
            return true;
        }else {
            return false;
        }
    }

}
