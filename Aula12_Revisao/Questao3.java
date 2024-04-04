package Aula12_Revisao;

import java.util.Scanner;

/*3) Entrar com um nome e imprimir:
todo nome:
primeiro caractere:
ultimo caractere:
do primeiro ate o terceiro:
quarto caractere:
todos menos o primeiro:
os dois últimos: */
public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        char primeiro, ultimo, quarto;
        String doPrimeiroAteOTerceiro, todosMenosOPrimeiro, osDoisUltimos;
        
        System.out.println("Digite um nome: ");
        nome = input.nextLine();
        
        primeiro = nome.charAt(0);
        ultimo = nome.charAt(nome.length() - 1);
        quarto = nome.charAt(3);
        doPrimeiroAteOTerceiro = nome.substring(0, 3);
        todosMenosOPrimeiro = nome.substring(1);
        osDoisUltimos = nome.substring(nome.length() - 2);
        
        System.out.println("Todo nome: " + nome);
        System.out.println("Primeiro caractere: " + primeiro);
        System.out.println("Último caractere: " + ultimo);
        System.out.println("Do primeiro até o terceiro: " + doPrimeiroAteOTerceiro);
        System.out.println("Quarto caractere: " + quarto);
        System.out.println("Todos menos o primeiro: " + todosMenosOPrimeiro);
        System.out.println("Os dois últimos: " + osDoisUltimos);
    }
    
}
