package agenda;

import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact("", null);
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("init")) { //name
                contact = new Contact(ui[1], null);
            } else if(ui[0].equals("add")) {  //id fone
                contact.addFone(new Fone(ui[1], ui[2]));
            } else if(ui[0].equals("rm")) {   //index
                contact.rmFone(Integer.parseInt(ui[1]));
            } else if(ui[0].equals("show")) {
                System.out.println(contact);
            } else {
                System.out.println("fail: invalid command");
            }
        }
        scanner.close();
    }
}