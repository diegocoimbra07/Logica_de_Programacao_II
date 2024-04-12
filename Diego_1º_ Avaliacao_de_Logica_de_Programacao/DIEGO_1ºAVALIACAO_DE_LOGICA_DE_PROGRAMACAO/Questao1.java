package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, media;
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("informe o segundo número: ");
        num2 = scanner.nextDouble();
        media = (num1 + num2) / 2;
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}