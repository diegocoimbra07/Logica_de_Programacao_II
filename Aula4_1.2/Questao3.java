import java.util.Scanner;

//3 - Faça um programa que receba quatro notas de um aluno, calcule e 
//imprima a média aritmética das notas e a mensagem de aprovado para 
//média superior ou igual a 7.0 ou a mensagem de reprovado para média inferior a 7.0. 
public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = input.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    
}
