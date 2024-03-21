/*4 - Criar um programa que calcule o fatorial de um número, 
usando um método que receba um valor e retorne o fatorial desse valor. */

package Aula8_15_3;

import java.util.Scanner; // Importa a classe Scanner

class fatorial { //cria a classe fatorial
    public static int fat(int num){ 
        int fat = 1;
        for (int i = 1; i <= num; i++){
            fat *= i;
        }
        return fat;
    }
}

public class Questao4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: "); //pedir número ao usuário
        int num = scanner.nextInt(); // lê o número digitado

        System.out.println("O fatorial de " + num + " é: " + fatorial.fat(num)); // retorna o fatorial do número digitado
    }
    
}
