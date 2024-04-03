/*Questão 3 - Usando vetores, faça um programa que peça o nome de 5 alunos de uma turma armazenando-os em um vetor de String. 
Ao final os nomes devem ser mostrado ao usuário. */

package Aula11_28_3; //declaração do pacote

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        String nomes[] = new String[5]; //declaração do vetor nomes
        
        for (int i = 0; i < 5; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o nome do " + (i + 1) + "º aluno: "); //imprime a mensagem
            nomes[i] = input.nextLine(); //atribuição de valor ao vetor nomes
        }
        
        for (int i = 0; i < 5; i++) { //laço de repetição para mostrar os valores
            System.out.println("O nome do " + (i + 1) + "º aluno é: " + nomes[i]); //imprime a mensagem
        }
    }
    
}
