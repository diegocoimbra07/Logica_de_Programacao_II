package Aula11_28_3; 

public class Exemplo1 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        
        float nota[] = new float [3]; //declaração do vetor nota
        String nome[] = new String[3]; // declaração do vetor nome

        nota[0] = 7; //atribuição de valor ao vetor nota
        nome[0] = "Pedro"; //atribuição de valor ao vetor nome

        nota[1] = 5;
        nome[1] = "Maria";

        nota[2] = 7;
        nome[2] = "José";

        System.out.println("Nota de " + nome[0] + " = " + nota[0]); //imprime a mensagem
        System.out.println("Nota de " + nome[1] + " = " + nota[1]);
        System.out.println("Nota de " + nome[02] + " = " + nota[2]);

    }
    
}
