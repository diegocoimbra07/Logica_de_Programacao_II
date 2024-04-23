package Aula12_Revisao;
import java.util.Scanner;

/*7) Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores do que 225. */
public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numero = input.nextInt();
            
            if (numero * numero < 225) {
                soma += numero;
            }
        }
        
        System.out.println("A soma dos números cujos quadrados são menores do que 225 é: " + soma);
    }
}