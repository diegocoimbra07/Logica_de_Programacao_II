package Aula11_28_3;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        float nota [] = new float [3];
        String nome [] = new String [3];
        Scanner entrada1 = new Scanner (System.in);
        Scanner entrada2 = new Scanner (System.in);
        
            for (int i = 0; i < nota.length; i++) {
            System.out.println("Entre com a nota");
            nota[i] = entrada1.nextFloat();
            System.out.println("Entre com o nome");
            nome[i] = entrada2.nextLine();        
        }
        
        for (int i = 0; i < nota.length; i++) {
          System.out.println("Nota de " + nome[i]+ " = " + nota[i]);   
        }
        entrada1.close();
        entrada2.close();
    }
   
}
