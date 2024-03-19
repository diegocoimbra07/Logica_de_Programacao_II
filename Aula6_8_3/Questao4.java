package Aula6_8_3;
//4 - Escreva um programa que receba a idade de 10 pessoas, 
//calcule e imprima a quantidade de pessoas maiores de idade 
//(idade >= 18 anos). 

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int maiorIdade = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = input.nextInt();
            if (idade >= 18) {
                maiorIdade++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade é: " + maiorIdade);
    }
}
