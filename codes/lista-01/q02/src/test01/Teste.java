package test01;

import java.util.Scanner;

/*
Vários competidores disputaram uma competição interessante. Eles tinham duas pedras para lançar.
Chamemos de pedra A e pedra B. Eles tinham que arremessar ambas as pedras a pelo menos 10 metros de distância.
Ganhava a competição, o competidor que arremessou as duas além da linha de 10 m o mais próximo possível uma da outra.
Se alguma das pedras tiver distância menor que 10 metros, o competidor estará desclassificado.
Faça um programa que retorne o número do vencedor do jogo. O primeiro jogador recebe o número 0.

Ganha a competição, o competidor que arremessar as duas além da linha de 10 m o mais próximo possível uma da outra;
e que tiver o arremesso (A ou B) mais próximo de 10m. Arremessos com distância menor que 10 metros do jogador são
ignorados e o jogador já está desclassificado.

Entrada:

O número N de competidores.

Distância das pedras A e B de cada competidor.

Saida:

O número do competidor vitorioso. O primeiro competidor tem número 0. Caso haja empate, mostre o de menor número.
Se ninguém ganhar o jogo, porque não conseguiram lançar as bolas além dos 10 metros, imprima "sem ganhador".*/
public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qntJogadores = input.nextInt();
        int[] diferencaDistancia = new int[qntJogadores];

        for(int cont = 0; cont < diferencaDistancia.length; cont++){
            int distanciaPedra1 = input.nextInt();
            int distanciaPedra2 = input.nextInt();

            if(distanciaPedra1>=10 && distanciaPedra2>=10){
                diferencaDistancia[cont] = Math.abs(distanciaPedra2 - distanciaPedra1);
            }else {
                diferencaDistancia[cont] = -1;
            }

        }

        int menorDiferenca =99999, posicaoJogadorVencedor = -1;

        for(int cont = 0; cont < diferencaDistancia.length; cont++){
            if(menorDiferenca > diferencaDistancia[cont] && diferencaDistancia[cont] != -1){
                menorDiferenca = diferencaDistancia[cont];
                posicaoJogadorVencedor = cont;
            }
        }
        if (posicaoJogadorVencedor == -1){
            System.out.println("sem ganhador");
        }else{
            System.out.println(posicaoJogadorVencedor);
        }

        input.close();
    }
}
