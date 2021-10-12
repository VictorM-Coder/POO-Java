import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanhoVetor = input.nextInt();
        int[] vetor = new int[tamanhoVetor];

        for(int cont = 0;cont < tamanhoVetor;cont++){
            vetor[cont] = input.nextInt();
        }


        int totDif = tamanhoVetor;
        for (int cont = 0;cont <tamanhoVetor;cont++){
            int iguaisRod = 1;
            for (int cont1 = cont+1 ;cont1 < tamanhoVetor;cont1++){
                if(vetor[cont] == vetor[cont1]){
                    System.out.println(totDif);
                    totDif--;
                }
            }

        }
        System.out.println(totDif);
        input.close();
    }
}
