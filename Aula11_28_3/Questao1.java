/*Questão 1 - Usando vetores, faça um programa que peça 5 valores inteiros ao usuário e mostre esses valores ao final. */

package Aula11_28_3;

import java.util.Scanner;


public class Questao1 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        int valores[] = new int[5]; //declaração do vetor valores
        
        for (int i = 0; i < 5; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o " + (i + 1) + "º valor: "); //imprime a mensagem
            valores[i] = input.nextInt(); //atribuição de valor ao vetor valores
        }
        
        for (int i = 0; i < 5; i++) { //laço de repetição para mostrar os valores
            System.out.println("O " + (i + 1) + "º valor é: " + valores[i]); //imprime a mensagem
        }
    }
    
}
