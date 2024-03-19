package Aula8_15_3;

import java.util.Scanner;

class CalcularMedia{
    public static double media(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) /3; // calcula e retorna a média

    }
}

public class Questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // entrada

    System.out.println("Digite a primeira nota: "); //pedir nota ao usuário
    double nota1 = scanner.nextDouble(); // lê a nota digitada

    System.out.println("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();

    System.out.println("Digita a terceira nota: ");
    double nota3 = scanner.nextDouble();

    double media = CalcularMedia.media(nota1, nota2, nota3); //armazena o resultado na variável media

    System.out.println("A média é: " + media); //imprime
    }
    
}
