import java.util.Scanner;
/*
Faça um programa para calcular a quantidade de números diferentes inseridos, dado um vetor
e seu tamanho como entrada.
 */

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanhoVetor = input.nextInt();
        int[] vetor = new int[tamanhoVetor];

        for(int cont = 0;cont < tamanhoVetor;cont++){
            vetor[cont] = input.nextInt();
        }

        for(int cont = 0; cont < tamanhoVetor; cont++){
            for (int cont1 = cont+1; cont1 < tamanhoVetor; cont1++){
                if (vetor[cont] > vetor[cont1]){
                    int aux = vetor[cont1];
                    vetor[cont1] = vetor[cont];
                    vetor[cont] = aux;
                }
            }
        }

        int totDif = tamanhoVetor;

        for (int c1 = 0; c1 < tamanhoVetor; c1++){
            for (int c2 = c1+1; c2 < tamanhoVetor;c2++){
                if (vetor[c1] == vetor[c2]){
                    totDif--;
                    c1 = c2;
                }
            }
        }

        System.out.println(totDif);
        input.close();
    }
}
