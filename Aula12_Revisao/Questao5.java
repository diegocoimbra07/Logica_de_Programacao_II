package Aula12_Revisao;
import java.util.Scanner;

/*5) Entrar comum número e informar se ele é divisível por 10, por 5, por 2 ou se não é
divisível por nenhum destes. */
public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        
        if (numero % 10 == 0) {
            System.out.println("O número é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println("O número é divisível por 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é divisível por 2.");
        } else {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }
    }
}
