import java.util.Scanner;

//6 - Faça um programa que receba o código de um produto 
//e seu valor. Baseado na tabela de aumento abaixo, o 
//seu programa deverá dizer qual é o novo preço do produto.
//código                  percentutal de aumento %
//1                       15
//3                       20
//4                       35
//8                       40


public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        double valor;
        System.out.println("Digite o codigo do produto: ");
        codigo = input.nextInt();
        System.out.println("Digite o valor do produto: ");
        valor = input.nextDouble();
        if(codigo == 1){
            valor = valor * 1.15;
        }else if(codigo == 3){
            valor = valor * 1.20;
        }else if(codigo == 4){
            valor = valor * 1.35;
        }else if(codigo == 8){
            valor = valor * 1.40;
        }
        System.out.println("Novo valor do produto: " + valor);
    }
}
