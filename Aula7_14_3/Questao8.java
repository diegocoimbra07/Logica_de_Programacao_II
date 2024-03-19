/*8 - Faça um programa que calcule e imprima a área de um círculo. 
área = π * raio² */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, area;
        System.out.println("Digite o raio do circulo: ");
        raio = input.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area: " + area);
    }
    
}
