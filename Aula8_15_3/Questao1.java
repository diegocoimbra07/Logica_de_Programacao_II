package Aula8_15_3;

import java.util.Scanner; // Importa a classe Scanner

class Dobro{ // Classe chamada dobro
    public static int dobrar (int num){ // Declara um método estático que aceita um parâmetro inteiro e retorna um inteiro.
        
        return num * 2; // retornar o dobro
    }
}

public class Questao1 {
    public static void main(String[] args){
        
        Scanner scanner  = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("Digite o primeiro número: "); // mensagem pedindo o número
        int num1 = scanner.nextInt(); // lê o número

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Resultado na tela
        System.out.println("O dobro do primeiro número é " + Dobro.dobrar(num1));
        System.out.println("O dobro do segundo número é: " + Dobro.dobrar(num2));
        System.out.println("O dobro do terceiro número é: " + Dobro.dobrar(num3));
        
        scanner.close();
    } 
    
}
