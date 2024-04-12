package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0, produto = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe 5 números: ");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                soma += num;
            } else {
                produto *= num;
            }
        }
        System.out.println("A soma dos números pares é: " + soma);
        System.out.println("O produto dos números ímpares é: " + produto);

        scanner.close();
    }
    
}
