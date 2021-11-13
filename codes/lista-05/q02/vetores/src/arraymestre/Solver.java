package arraymestre;

import java.util.ArrayList;
import java.util.Scanner;

public class Solver{

    public static void main(String[] args) {
        ArrayList<Integer> vet = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            String line = scan.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            String cmd = ui[0];

            if(line.equals("end")) {
                break;
            } else if(cmd.equals("show")) {
                System.out.print("[ ");
                for(Integer value : vet)
                    System.out.print(value + " ");
                System.out.print("]\n");

            } else if(cmd.equals("rshow")) {
                System.out.print("[ ");
                for (int cont = (vet.size() - 1); cont >= 0; cont--){
                    System.out.print(vet.get(cont) + " ");
                }
                System.out.print("]\n");

            } else if(cmd.equals("add")) {
                for(int i = 1; i < ui.length; i++)
                    vet.add(Integer.parseInt(ui[i]));

            } else if(cmd.equals("find")) {
                String indexsPositions = "[ ";
                for(int cont = 1; cont < ui.length; cont++){
                    indexsPositions += vet.indexOf(Integer.parseInt(ui[cont])) + " ";
                }
                System.out.println(indexsPositions + "]");

            } else if(cmd.equals("get")) {
                ArrayListVerificator.getItemByIndex(Integer.parseInt(ui[1]), vet);

            } else if(cmd.equals("set")) {
                ArrayListVerificator.setItemByIndex(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), vet);

            } else if(cmd.equals("ins")) {
                ArrayListVerificator.insertElementByIndex(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), vet);

            } else if(cmd.equals("rmi")) {
               ArrayListVerificator.removeItemByIndex(Integer.parseInt(ui[1]), vet);

            } else if(cmd.equals("rma")) {
                ArrayListVerificator.removeAllElements(Integer.parseInt(ui[1]), vet);
            } else {
                System.out.print("fail: command not found\n");
            }
        }
        scan.close();
    }
}