import java.util.Scanner;

//1 - Faça um programa que receba a idade de uma pessoa
// e imprima mensagem de maioridade ou não. 
public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
