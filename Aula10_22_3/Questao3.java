/*3 - Faça um programa que receba uma palavra e a 
imprima de trás para-frente */

package Aula10_22_3;

import java.util.Scanner; //importar a classe Scanner

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // entrada do úsuario

        System.out.println("Digita uma palavra: "); //solicitar entrada do usuário
        String palavra = scanner.nextLine(); // variável palavra recebe a entrada do usuário
        scanner.close(); // fechar o scanner
        
        String palavraInvertida = new StringBuilder(palavra).reverse().toString(); // variável palavraInvertida recebe a palavra invertida

        System.out.println("Palavra de trás para frente é: " + palavraInvertida); //imprimir a palavra invertida
    }    
}
