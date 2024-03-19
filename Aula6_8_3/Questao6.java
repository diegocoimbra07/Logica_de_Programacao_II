package Aula6_8_3;
/* 6 - Escreva um programa que receba um conjunto de valores 
inteiros e positivos, calcule e imprima o maior e o menor 
valor do conjunto. 
Para encerrar a entrada de dados, deve ser digitado o valor 
zero. Para valores negativos, deve ser enviada uma mensagem. 
Esses valores (zero e negativos) não entrarão nos cálculos. */

public class Questao6 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num, maior = 0, menor = 0;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        if (num > 0) {
            maior = num;
            menor = num;
        } else {
            System.out.println("Valor inválido");
        }
        while (num != 0) {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            if (num > 0) {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
    
}
