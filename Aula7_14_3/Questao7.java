/*7 - Faça um programa que calcule e imprima a área de um quadrado. 
area = ladoˆ2 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado, area;
        System.out.println("Digite o lado do quadrado: ");
        lado = input.nextDouble();
        area = Math.pow(lado, 2);
        System.out.println("Area: " + area);
    }
    
}
