/*6 - Elabore um programa que gere mostre na tela um jogo da 
Megasena com 6 dezenas que podem ter os seus valores de 1 a 60. 
Exemplode saída:23–6–45–20–14–56  */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dezena1, dezena2, dezena3, dezena4, dezena5, dezena6;
        dezena1 = (int) (Math.random() * 60 + 1);
        dezena2 = (int) (Math.random() * 60 + 1);
        dezena3 = (int) (Math.random() * 60 + 1);
        dezena4 = (int) (Math.random() * 60 + 1);
        dezena5 = (int) (Math.random() * 60 + 1);
        dezena6 = (int) (Math.random() * 60 + 1);
        System.out.println(dezena1 + " - " + dezena2 + " - " + dezena3 + " - " + dezena4 + " - " + dezena5 + " - " + dezena6);
    }
}
