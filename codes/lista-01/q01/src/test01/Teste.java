package test01;
/*Faça um programa que receba cinco valores inteiros e encontre o menor deles*/

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tamanho = new int[5];

        for (int cont = 0; cont < tamanho.length; cont++){
            tamanho[cont] = input.nextInt();
        }

        int menor = tamanho[0];
        for(int tam: tamanho){
            if(menor > tam){
                menor = tam;
            }
        }

        System.out.println(menor);

        input.close();
    }
}
