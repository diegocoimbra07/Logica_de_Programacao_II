/*1 -  Faça um programa que receba o ano de nascimento de uma 
pessoa e o ano atual (ambos com 4 dígitos). Calcule e imprima:
- a idade dessa pessoa;
- essa idade convertida em semanas */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoNascimento, anoAtual, idade, idadeSemanas;
        System.out.println("Digite o ano de nascimento: "); 
        anoNascimento = input.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = input.nextInt();
        idade = anoAtual - anoNascimento;
        idadeSemanas = idade * 52;
        System.out.println("Idade: " + idade);
        System.out.println("Idade em semanas: " + idadeSemanas);
    }
    
}
