import java.util.Scanner;

/*
Leia um vetor(array) de tamanho n (quantidade de dominós) , e diga se ele está ordenado de forma crescente.
 */
public class Teste {
    static boolean isOrdered(int[] vetor){
        for(int cont = 1; cont < vetor.length; cont++){
            if (vetor[cont-1] > vetor[cont]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanhoVet = input.nextInt();

        int[] vetor = new int[tamanhoVet];

        for (int cont = 0; cont < tamanhoVet;cont++){
            vetor[cont] = input.nextInt();
        }

        if (isOrdered(vetor)){
            System.out.println("ok");
        }else{
            System.out.println("precisa ajustar");
        }
        input.close();
    }
}
