import java.util.Scanner;

//5 - Faça um programa que receba dois números e diga se o 
//primeiro é maior que o segundo, se são iguais ou se o 
//segundo é maior que o primeiro. 

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("O primeiro numero e maior que o segundo");
        }else if(num1 == num2){
            System.out.println("Os numeros sao iguais");
        }else{
            System.out.println("O segundo numero e maior que o primeiro");
        }
    }
    
}
