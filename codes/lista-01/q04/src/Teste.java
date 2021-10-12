import java.util.Scanner;

/*
Faça uma função chamada primo que recebe um inteiro positivo n e retorna true (verdadeiro) se n é primo,
ou false (falso) caso contrário. Um número inteiro é primo quando é divisível apenas por 1 e por ele mesmo.

Uma estratégia simples para testar se um número n é primo consiste em procurar um divisor de n do número 2
até o número n−1. Se algum valor nesta faixa é divisor do n, então n não é primo. Caso contrário, n é primo.

Note que a função pode retornar true assim que encontrar um divisor de n entre 2 e n−1.
Ou seja, não é necessário retornar apenas no final da função.

Na função main, leia dois inteiros positivos A e B, com A≤B, e imprima todos os primos de A até B.
Portanto, use a função primo dentro da função main.
 */
public class Teste {
    static boolean primo(int numero){
        boolean ePrimo;
        for(int cont = 2; cont < numero; cont++){
            if (numero%cont==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroA = input.nextInt();
        int numeroB = input.nextInt();

        for (int cont = numeroA; cont <=numeroB; cont++){
            if (primo(cont)){
                System.out.println(cont);
            }
        }
        input.close();
    }
}
