/*5 - Faça um programa que receba um número inteiro, calcule e imprima: 
- a raiz quadrada desse número;
- esse número elevado ao quadrado.  */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double raiz, quadrado;
        System.out.println("Digite um numero inteiro: ");
        num = input.nextInt();
        raiz = Math.sqrt(num);
        quadrado = Math.pow(num, 2);
        System.out.println("Raiz: " + raiz);
        System.out.println("Quadrado: " + quadrado);
    }
    
}
