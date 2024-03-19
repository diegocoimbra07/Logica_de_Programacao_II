package Aula6_8_3;
/*3 - Tem-se um conjunto de dados contendo a altura e o 
sexo (M ou F) de 15 pessoas. Faça um programa que calcule e 
escreva:
- a maior e a menor altura do grupo;
- a média de altura das mulheres;
-o número de homens. */


import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double altura, maiorAltura = 0, menorAltura = 0, mediaAlturaMulheres = 0;
        int numHomens = 0, numMulheres = 0;
        String sexo;
        for(int i = 0; i < 3; i++){
            System.out.println("Digite a altura: ");
            altura = input.nextDouble();
            System.out.println("Digite o sexo (M ou F): ");
            sexo = input.next();
            if(i == 0){
                maiorAltura = altura;
                menorAltura = altura;
            }else{
                if(altura > maiorAltura){
                    maiorAltura = altura;
                }
                if(altura < menorAltura){
                    menorAltura = altura;
                }
            }
            if(sexo.equals("F")){
                mediaAlturaMulheres += altura;
                numMulheres++;
            }else{
                numHomens++;
            }
        }
    }
       
}
