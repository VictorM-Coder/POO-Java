import java.util.Scanner;
/*
Imprima todos os números ímpares na ordem em que foram inseridos na primeira linha,
e imprima todos os pares na segunda linha de forma análoga.
 */
public class Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanhoVetor = input.nextInt();
        int[] vetor =new int[tamanhoVetor];

        for (int cont = 0; cont < tamanhoVetor;cont++){
            vetor[cont] = input.nextInt();
        }

        System.out.print("[ ");
        for (int cont = 0; cont < tamanhoVetor;cont++){
            if(vetor[cont]%2!=0){
                System.out.print(vetor[cont] + " ");
            }
        }
        System.out.printf("]\n");

        System.out.print("[ ");
        for (int cont = 0; cont < tamanhoVetor;cont++){
            if(vetor[cont]%2==0){
                System.out.print(vetor[cont] + " ");
            }
        }
        System.out.printf("]");
        input.close();
    }
}
