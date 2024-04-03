/*Questão 6 - Elabore um programa que crie um vetor com 5 Strings para guardar os nomes de pessoas. 
O vetor deve ser preenchido pelo usuário e ao final deve ser feita uma consulta com um novo nome para saber se ele está ou não cadastrado. */

package Aula11_28_3;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        String nomes[] = new String[5]; //declaração do vetor nomes
        String nomeConsulta; //declaração da variável nomeConsulta
        boolean cadastrado = false; //declaração da variável cadastrado
        
        for (int i = 0; i < 5; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa: "); //imprime a mensagem
            nomes[i] = input.nextLine(); //atribuição de valor ao vetor nomes
        }
        
        System.out.println("Digite o nome que deseja consultar: "); //imprime a mensagem
        nomeConsulta = input.nextLine(); //atribuição de valor à variável nomeConsulta
        
        for (int i = 0; i < 5; i++) { //laço de repetição para verificar se o nome está cadastrado
            if (nomes[i].equals(nomeConsulta)) { //condição para verificar se o nome está cadastrado
                cadastrado = true; //atribuição de valor à variável cadastrado
                break; //quebra do laço
            }
        }
        
        if (cadastrado) { //condição para verificar se o nome está cadastrado
            System.out.println("O nome " + nomeConsulta + " está cadastrado."); //imprime a mensagem
        } else { //condição para verificar se o nome não está cadastrado
            System.out.println("O nome " + nomeConsulta + " não está cadastrado."); //imprime a mensagem
        }
    }
    
}
