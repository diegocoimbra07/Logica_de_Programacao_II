package Aula10_22_3;

/*8 -Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  
uma variável inteira), imprima cada um dos seus dígitos por extenso.  
Exemplo:  
Entre o número: 4571  
Resultado: quatro, cinco, sete, um*/

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o número:");
        int numero = scanner.nextInt();
        String[] digitosPorExtenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String numeroPorExtenso = "";
        scanner.close();
        
        while (numero > 0) {
            int digito = numero % 10;
            numeroPorExtenso = digitosPorExtenso[digito] + (numeroPorExtenso.isEmpty() ? "" : ", " + numeroPorExtenso);
            numero /= 10;
        }

        System.out.println("Resultado: " + numeroPorExtenso);
    }
}
