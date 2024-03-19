package Aula6_8_3;
/* 2 - Faça um programa que mostre um menu com as 
seguintes opções:
-soma
-raiz quadrada 
-finalizar
O programa deve receber a opção desejada, receber os 
dados necessários para a operação de cada opção, realizar 
a operação e imprimir o resultado. Na opção finalizar o 
programa deverá encerrar-se. */

import java.util.Scanner;
public class Questao2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - Soma");
            System.out.println("2 - Raiz quadrada");
            System.out.println("3 - Finalizar");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
           
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = num1 + num2;
                System.out.println("A soma de " + num1 + " e " + num2 + " é " + resultado);
            } else if (opcao == 3) {
                System.out.println("Programa finalizado.");
                return;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
            }
        }

    
}

 