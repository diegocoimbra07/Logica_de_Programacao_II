/* 4 - Faça um programa que receba dois números e imprima o menor dos dois */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println("O menor numero é: " + num1);
        } else {
            System.out.println("O menor numero é: " + num2);
        }
    }
    
}
