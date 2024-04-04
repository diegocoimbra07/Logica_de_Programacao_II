package Aula12_Revisao;
import java.util.Scanner; //importação da classe Scanner

/*1) Entrar com dois números inteiros e imprimir a seguinte saída:
dividendo
divisor:
quociente:
resto */

public class Questao1 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        int dividendo, divisor, quociente, resto; //declaração das variáveis
        System.out.println("Digite o dividendo: "); //imprime a mensagem
        dividendo = input.nextInt(); //atribuição de valor à variável dividendo
        System.out.println("Digite o divisor: "); //imprime a mensagem 
        divisor = input.nextInt(); //atribuição de valor à variável divisor
        quociente = dividendo / divisor; //atribuição de valor à variável quociente 
        resto = dividendo % divisor; //atribuição de valor à variável resto

        System.out.println("Dividendo: " + dividendo); 
        System.out.println("Divisor: " + divisor); 
        System.out.println("Quociente: " + quociente); 
        System.out.println("Resto: " + resto); 
    }
}