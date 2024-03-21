/*2 - Faça um programa que receba a medida de um ângulo em graus, 
calcule e imprima o seno e o cosseno desse ângulo.  */

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angulo, seno, cosseno;
        System.out.println("Digite o angulo: ");
        angulo = input.nextDouble();
        seno = Math.sin(Math.toRadians(angulo));
        cosseno = Math.cos(Math.toRadians(angulo));
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
    }
    
}
