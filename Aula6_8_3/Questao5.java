package Aula6_8_3;
/*5 - Escreva um programa que receba a idade de 15 pessoas, 
calcule e imprima:
 - a quantidade de pessoas em cada faixa etária;
- a porcentagem de cada faixa etária em relação ao total de 
pessoas.
As faixas etárias são:
-15 anos
-16 -| 30anos
-31 -| 45anos
-46 -| 60anos
>= 61 anos */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] faixas = new int[5];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (idade <= 15) faixas[0]++;
            else if (idade <= 30) faixas[1]++;
            else if (idade <= 45) faixas[2]++;
            else if (idade <= 60) faixas[3]++;
            else faixas[4]++;
        }

        String[] labels = {"<= 15 anos", "16 - 30 anos", "31 - 45 anos", "46 - 60 anos", ">= 61 anos"};
        for (int i = 0; i < faixas.length; i++) {
            double percentual = (faixas[i] / 15.0) * 100;
            System.out.println(labels[i] + ": " + faixas[i] + " pessoas (" + percentual + "%)");
        }

    }
}