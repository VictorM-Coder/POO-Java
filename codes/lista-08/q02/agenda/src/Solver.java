import agenda1.Agenda;
import agenda1.Contact;
import agenda1.Fone;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solver {
    //cria um contato a partir do vetor de entrada tal como
    //add joao oi:123 tim:432 claro:09123
    static Contact parseContact(String[] ui) {
        return new Contact(ui[1], Arrays.asList(ui).stream()
                .skip(2).map(token -> new Fone(token.split(":")[0], token.split(":")[1]))
                .collect(Collectors.toList()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("init")) {
                agenda = new Agenda();
            } else if(ui[0].equals("add")) { //name label:fone label:fone label:fone
                agenda.addContact(Solver.parseContact(ui));
            } else if(ui[0].equals("rm")) { //name
                agenda.rmContact(ui[1]);;
            } else if(ui[0].equals("rmFone")) { //name index
                agenda.findContact(ui[1]).rmFone(Integer.parseInt(ui[2]));
            } else if(ui[0].equals("show")) {
                System.out.println(agenda);
            } else if(ui[0].equals("search")) {
                System.out.println(agenda.search(ui[1]).stream().map(c -> "" + c).collect(Collectors.joining("\n")));
            } else {
                System.out.println("fail: invalid command");
            }
        }
        scanner.close();
    }
}
