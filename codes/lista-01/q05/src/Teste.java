import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        for (int linha = 1; linha <= numero; linha++){
            for (int coluna = linha; coluna >=1; coluna--){
                System.out.printf("% d", numero);
            }
            System.out.println();
        }
        input.close();
    }
}
