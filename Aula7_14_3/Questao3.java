/*3 - Faça um programa que receba dois números, calcule e imprima um elevado ao outro.*/

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, expoente, resultado;
        System.out.println("Digite a base: ");
        base = input.nextDouble();
        System.out.println("Digite o expoente: ");
        expoente = input.nextDouble();
        resultado = Math.pow(base, expoente);
        System.out.println("Resultado: " + resultado);
    }
    
}
