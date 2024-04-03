package Aula11_28_3;

import java.util.Scanner; //importa a classe Scanner

public class Exemplo2 { //declaração da classe
    public static void main(String[] args) {//declaração do método principal
        float nota [] = new float [3]; //declaração do vetor nota
        String nome [] = new String [3]; //declaração do vetor nome
        Scanner entrada1 = new Scanner (System.in); //cria um objeto Scanner chamado entrada1
        Scanner entrada2 = new Scanner (System.in); //  cria um objeto Scanner chamado entrada2
        
            for (int i = 0; i < nota.length; i++) { //laço de repetição para preencher os vetores
            System.out.println("Entre com a nota"); //imprime a mensagem
            nota[i] = entrada1.nextFloat(); //armazena o valor digitado no vetor nota
            System.out.println("Entre com o nome"); // imprime a mensagem
            nome[i] = entrada2.nextLine(); //armazena o valor digitado no vetor nome      
        }
        
        for (int i = 0; i < nota.length; i++) { //  laço de repetição para imprimir os vetores
          System.out.println("Nota de " + nome[i]+ " = " + nota[i]); //imprime a mensagem 
        }
        entrada1.close(); //fecha o objeto entrada1
        entrada2.close(); //fecha o objeto entrada2
    }
   
}
