package Aula6_8_3;
/*1 - Usando laço de repetição, faça um programa que 
receba um número inteiro, calcule e mostre a tabuada 
desse número.*/

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

