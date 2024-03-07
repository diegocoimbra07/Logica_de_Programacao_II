import java.util.Scanner;

//7 - Faça um programa que receba o preço de um produto e o 
//seu código de origem e imprima a sua procedência. 
//A procedência obedece a seguinte tabela: 
//Código de origem    Procedência
//1                   Sul
//2                   Norte
//3                   Leste
//4                   Oeste
//5                   Nordeste
//6                   Sudeste
//7                   Centro-oeste
//8                   Nordeste

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        double valor;
        System.out.println("Digite um numero de 1 a 8: ");
        codigo = input.nextInt();
      
        if(codigo == 1){
            System.out.println("Sul");
        }else if(codigo == 2){
            System.out.println("Norte");
        }else if(codigo == 3){
            System.out.println("Leste");
        }else if(codigo == 4){
            System.out.println("Oeste");
        }else if(codigo == 5){
            System.out.println("Nordeste");
        }else if(codigo == 6){
            System.out.println("Sudeste");
        }else if(codigo == 7){
            System.out.println("Centro-oeste");
        }else if(codigo == 8){
            System.out.println("Nordeste");
        }
    }
    
}
