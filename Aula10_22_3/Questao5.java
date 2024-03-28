/*5 - Faca um programa que receba uma palavra e calcule quantas vogais 
(a, e, i, o, u) possui essa palavra. Entre com um caractere 
(vogal ou consoante) e substitua todas as vogais da palavra dada por 
esse caractere. */

import java.util.Scanner; //importar a classe Scanner

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // entrada do úsuario

        System.out.println("Digita uma palavra: "); //solicitar entrada do usuário
        String palavra = scanner.nextLine(); // variável palavra recebe a entrada do usuário
        scanner.close(); // fechar o scanner
        
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vogais na palavra: " + contador);
    
    }
    
}
