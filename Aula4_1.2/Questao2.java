import java.util.Scanner;

// 2 - Faça um programa que receba um número, 
//verifique se este número é par ou ímpar 
//e imprima a mensagem. Para verificar se um número é par, 
//use a operação resto da divisão por 2, se der zero, o número é par. 
public class Questao2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = input.nextInt();
        if(numero % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }

    }
    
}
