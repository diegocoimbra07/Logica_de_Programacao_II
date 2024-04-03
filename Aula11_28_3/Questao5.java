/*5 - Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. 
Para isso forneceu o sexo do entrevistado e sua resposta (sim ou não). 
Sabendo que foram entrevistadas 10 pessoas, faça um programa que calcule e imprima:
• o número de pessoas que responderam sim;
• o número de pessoas que responderam não;
• o número de mulheres que responderam sim;
• a porcentagem de homens que responderam não entre todos os
homens analisados. */
package Aula11_28_3; //declaração do pacote

import java.util.Scanner; //importação da classe Scanner

public class Questao5 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        Scanner input = new Scanner(System.in); //declaração do objeto input
        int sim = 0, nao = 0, mulheresSim = 0, homens = 0, homensNao = 0; //declaração das variáveis
        String sexo, resposta; //declaração das variáveis
        
        for (int i = 0; i < 10; i++) { //laço de repetição para pedir os valores ao usuário
            System.out.println("Digite o sexo do entrevistado (M/F): "); //imprime a mensagem
            sexo = input.nextLine(); //atribuição de valor à variável
            System.out.println("Digite a resposta do entrevistado (sim/não): "); //imprime a mensagem
            resposta = input.nextLine(); //atribuição de valor à variável
            
            if (resposta.equalsIgnoreCase("sim")) { //condição para verificar a resposta
                sim++; //incremento da variável
            } else { 
                nao++; //incremento da variável
            }
            
            if (sexo.equalsIgnoreCase("f") && resposta.equalsIgnoreCase("sim")) { //condição para verificar a resposta
                mulheresSim++; //incremento da variável
            }
            
            if (sexo.equalsIgnoreCase("m")) { //condição para verificar o sexo
                homens++; //incremento da variável
                if (resposta.equalsIgnoreCase("não")) { //condição para verificar a resposta
                    homensNao++; //incremento da variável
                }
            }
        }
        
        System.out.println("O número de pessoas que responderam sim é: " + sim); //imprime a mensagem
        System.out.println("O número de pessoas que responderam não é: " + nao); 
        System.out.println("O número de mulheres que responderam sim é: " + mulheresSim);
        System.out.println("A porcentagem de homens que responderam não entre todos os homens analisados é: " + (homensNao * 100) / homens + "%");
    }
    
}
