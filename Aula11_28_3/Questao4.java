/*Questão 4 - Criar uma programa que receba um vetor de números inteiros de 10 posições. 
O programa deve inverter a ordem dos elementos do vetor de modo que o 1º vire o último e o 2º vire o penúltimo e assim sucessivamente.*/
package Aula11_28_3; //declaração do pacote

import java.util.Scanner; //importação da classe Scanner

public class Questao4 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        int valores[] = new int[10]; //declaração do vetor valores
        int valoresInvertidos[] = new int[10]; //declaração do vetor valoresInvertidos
        
        for (int i = 0; i < 10; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o " + (i + 1) + "º valor: "); //imprime a mensagem
            valores[i] = input.nextInt(); //atribuição de valor ao vetor valores
        }
        
        for (int i = 0; i < 10; i++) { //laço de repetição para inverter os valores
            valoresInvertidos[i] = valores[9 - i]; //atribuição de valor ao vetor valoresInvertidos
        }
        
        for (int i = 0; i < 10; i++) { //laço de repetição para mostrar os valores
            System.out.println("O " + (i + 1) + "º valor é: " + valoresInvertidos[i]); //imprime a mensagem
        }
    }
    
}
