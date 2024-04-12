package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
    
}
