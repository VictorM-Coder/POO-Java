import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int tamBase = 2*numero-1;
        for (int coluna = 1; coluna <= numero; coluna++){
            int espacos = (tamBase - 2*coluna +1)/2;
            for (int cont = 1; cont <= espacos; cont++){
                System.out.print(" ");
            }
            for (int linha = 1; linha <=coluna; linha++){
                System.out.printf(" %d", numero);
            }
            System.out.println();
        }
        input.close();
    }
}
