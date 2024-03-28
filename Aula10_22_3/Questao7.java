package Aula10_22_3;

/*7 - Faça um programa que, a partir de uma string digitada pelo usuário, imprima:  
a) O número de caracteres da string.  
b) A string com todas suas letras em maiúsculo.  
c) O número de vogais da string.  
d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).  
e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).  
f) O número de dígitos (0 a 9) da string.  
g) Se a string é um palíndromo ou não */

import java.util.Scanner; //importar a classe Scanner
public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // entrada do úsuario

        System.out.println("Digita uma palavra: "); //solicitar entrada do usuário
        String palavra = scanner.nextLine(); // variável palavra recebe a entrada do usuário
        scanner.close(); // fechar o scanner
        
        // O número de caracteres da string.
        System.out.println("Número de caracteres da string: " + palavra.length());
        
        // A string com todas suas letras em maiúsculo.
        System.out.println("String com todas suas letras em maiúsculo: " + palavra.toUpperCase());
        
        // O número de vogais da string.
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vogais da string: " + contador);
        
        // Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
        if (palavra.toLowerCase().startsWith("uni")) {
            System.out.println("A string digitada começa com 'UNI'");
        } else {
            System.out.println("A string digitada não começa com 'UNI'");
        }
        
        // Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
        if (palavra.toLowerCase().endsWith("rio")) {
            System.out.println("A string digitada termina com 'RIO'");
        } else {
            System.out.println("A string digitada não termina com 'RIO'");
        }
        
        // O número de dígitos (0 a 9) da string.
        contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isDigit(palavra.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de dígitos (0 a 9) da string: " + contador);
        
        // Se a string é um palíndromo ou não
    
}
}