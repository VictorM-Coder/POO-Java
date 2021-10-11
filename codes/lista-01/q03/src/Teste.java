
import java.util.Scanner;
/*
Número de Euler:
E=1 + 1/1! + 1/2! + 1/3! + ⋯ + 1/N!
Faça uma função que retorna o fatorial de um número inteiro positivo n passado como parâmetro,
ou seja, retorna 1 * 2 * 3 * ... * (n-1) * n.
Chame esta função de `fatorial`.
O valor retornado, e a variável que armazena o fatorial, devem ser do tipo double,
pois esta função cresce muito rápido. Uma variável do tipo int só é capaz de armazenar até 12!.

Em seguida, crie uma função chamada `euler` que recebe um inteiro N e retorna o valor da série
 */

public class Teste {
    static double fatorial(double numeroParaFatorial){
        if (numeroParaFatorial == 0){
            return 1;
        }else{
            return numeroParaFatorial * fatorial(numeroParaFatorial-1);
        }

    }

    static double euler(double numeroParaEuler){
        double saida = 1;
        for (int cont = 1; cont <= numeroParaEuler; cont++){
            saida+= 1/fatorial(cont);
        }

        return saida;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int numeroEntrada = input.nextInt();
        System.out.printf("%.6f", euler(numeroEntrada));
        input.close();

    }
}
