import java.util.Locale;
import java.util.Scanner;
/*
Pedro e João foram no Silvio Santos. O programa era aquele que o Silvio mostrava um produto do mercantil
e a pessoa que chegasse mais próximo do preço real ganhava.

João e Pedro são concorrentes. O objetivo do seu programa é informar quem ganhou a disputa.

O primeiro jogador informa o preço e o segundo jogador informa maior ou menor.
Quem vencer mais disputas ganha o jogo. Se o valor do produto for igual ao chute, ganha o primeiro concorrente.

Se ambos vencerem a mesma quantidade então acontece o empate.

Se ambos tiverem igualmente próximos do preço então nenhum dos dois ganha a disputa.

Entrada:

linha 1: a quantidade de produtos (1 a 50)
linha 2: o valor dos produtos (0.01 até 1000.0)
linha 3: os chutes do Primeiro (float)
linha 4: as escolhas do segundo (m para menor, M para maior)

 */
public class Teste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int acertosJogador1 = 0, acertosJogador2 = 0;
        int qntProdutos = input.nextInt();
        float[] valorProdutos = new float[qntProdutos];
        float[] chutes = new float[qntProdutos];
        char[] escolhas = new char[qntProdutos];

        for(int cont =0; cont < qntProdutos;cont++){
            valorProdutos[cont] = input.nextFloat();
        }
        for(int cont =0; cont < qntProdutos;cont++){
            chutes[cont] = input.nextFloat();
        }
        for(int cont =0; cont < qntProdutos;cont++){
            escolhas[cont] = input.next().charAt(0);
        }

        for (int cont = 0;cont < qntProdutos;cont++){
            if (chutes[cont] == valorProdutos[cont]){
                acertosJogador1++;
            }else {
                if((escolhas[cont] == 'M' && chutes[cont] < valorProdutos[cont] || escolhas[cont] == 'm' && chutes[cont] > valorProdutos[cont])){
                    acertosJogador2++;
                }else{
                    acertosJogador1++;
                }
            }

        }

        if (acertosJogador1 > acertosJogador2){
            System.out.println("primeiro");

        }else if (acertosJogador1 == acertosJogador2){
            System.out.println("empate");
        }else{
            System.out.println("segundo");
        }


        input.close();
    }
}
