package lapiseiragrafites;

import java.util.Scanner;

public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lapiseira lapiseira = new Lapiseira(0.5f);

        while(true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("help")) {
                System.out.println("init _calibre; add _calibre _dureza _tamanho; remove; pull; write _folhas");
            } else if(ui[0].equals("init")) { //calibre
                lapiseira = new Lapiseira(Float.parseFloat(ui[1]));
            } else if(ui[0].equals("add")) {//calibre dureza tamanho
                float calibre = Float.parseFloat(ui[1]);
                String dureza  = ui[2];
                int tamanho = Integer.parseInt(ui[3]);
                lapiseira.inserir(new Grafite(calibre, dureza, tamanho));
            } else if(ui[0].equals("remove")) {
                lapiseira.remover();
            } else if(ui[0].equals("show")) {
                System.out.println(lapiseira);
            } else if (ui[0].equals("write")) {
                lapiseira.escrever();
            } else if (ui[0].equals("pull")) {
                lapiseira.puxar();
            }  else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}

