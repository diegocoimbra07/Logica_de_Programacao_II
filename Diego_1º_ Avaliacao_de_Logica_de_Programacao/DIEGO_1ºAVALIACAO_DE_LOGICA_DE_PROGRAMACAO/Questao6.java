package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[100];
        int soma = 0;
        int iguais30 = 0, maiorMedia = 0, iguaisMedia = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println("Informe um número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = soma / 100;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == 30) {
                iguais30++;
            }
            if (numeros[i] > media) {
                maiorMedia++;
            }
            if (numeros[i] == media) {
                iguaisMedia++;
            }
        }
        System.out.println("Quantidade de números iguais a 30: " + iguais30);
        System.out.println("Quantidade de números maiores que a média: " + maiorMedia);
        System.out.println("Quantidade de números iguais a média: " + iguaisMedia);

        scanner.close();
}
}