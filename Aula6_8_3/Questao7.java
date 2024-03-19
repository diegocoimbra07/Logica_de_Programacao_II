package Aula6_8_3;
/*7 - Em uma eleição presidencial, existem quatro candidatos. 
Os votos são informados através de código. Os códigos 
utilizados são:
1,2,3,4 -> votos para os respectivos candidatos; 
5 -> voto em branco;
outros -> voto.nulo.
Escreva um programa que calcule e imprima:
-total de votos para cada candidato;
-total de votos nulos;
-total de votos em branco;
-porcentagem de votos nulos sobre o total de votos;
-porcentagem de votos em branco sobre o total de votos.
Para finalizar o conjunto de votos, tem-se o voto com valo zero */

import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
       

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o código do candidato: " + "Digite 1 para o candidato 1 " + 
                                                                "Digite 2 para o candidato 2 " + 
                                                                "Digite 3 para o candidato 3 " + 
                                                                "Digite 4 para o candidato 4 " + 
                                                                "Digite 5 para votar em branco " + 
                                                                "Digite 0 para finalizar ");
            
            int codigo = entrada.nextInt();


            while (codigo != 0){
                System.out.println("Digite o código do candidato: " + "Digite 1 para o candidato 1 " + 
                                                                "Digite 2 para o candidato 2 " + 
                                                                "Digite 3 para o candidato 3 " + 
                                                                "Digite 4 para o candidato 4 " + 
                                                                "Digite 5 para votar em branco " + 
                                                                "Digite 0 para finalizar ");
            codigo = entrada.nextInt();

            }
        }
}