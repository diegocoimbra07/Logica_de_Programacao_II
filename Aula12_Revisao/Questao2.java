package Aula12_Revisao;

import java.util.Scanner;

//2) Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3, num4, media;
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextFloat();
        System.out.println("Digite o terceiro número: ");
        num3 = input.nextFloat();
        System.out.println("Digite o quarto número: ");
        num4 = input.nextFloat();
        media = (num1 + 2 * num2 + 3 * num3 + 4 * num4) / 10;
        System.out.println("A média ponderada é: " + media);
    }
    
}
