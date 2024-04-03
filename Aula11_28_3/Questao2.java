/*Questão 2 - Usando vetores, faça um programa que peça 5 valores inteiros  e armazene em um vetor A. 
Depois peça mais 5 valores inteiros e armazene em segundo vetor B. 
Armazene a soma de A + B em um vetor C e mostre essa soma no final. */

package Aula11_28_3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        int A[] = new int[5]; //declaração do vetor A
        int B[] = new int[5]; //declaração do vetor B
        int C[] = new int[5]; //declaração do vetor C

        for (int i = 0; i < 5; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o " + (i + 1) + "º valor de A: "); //imprime a mensagem
            A[i] = input.nextInt(); //atribuição de valor ao vetor A
        }

        for (int i = 0; i < 5; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o " + (i + 1) + "º valor de B: "); //imprime a mensagem
            B[i] = input.nextInt(); //atribuição de valor ao vetor B
        }

        for (int i = 0; i < 5; i++) { //laço de repetição para mostrar os valores
            C[i] = A[i] + B[i]; //atribuição de valor ao vetor C
            System.out.println("A soma de A[" + i + "] + B[" + i + "] = " + C[i]); //imprime a mensagem
        }
    }
    
}
