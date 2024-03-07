import java.util.Scanner;

//8 - Faça um programa que receba a altura (H) e o sexo de 
//uma pessoa, calcule e imprima o seu peso ideal, utilizando
//as seguintes fórmulas: 
//- para homens: (72.7 * H) - 58
//- para mulheres: (62.1 * H) - 44.7 

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, pesoIdeal;
        char sexo;
        System.out.println("Digite a altura: ");
        altura = input.nextDouble();
        System.out.println("Digite o sexo (M ou F): ");
        sexo = input.next().charAt(0);
        if(sexo == 'M'){
            pesoIdeal = (72.7 * altura) - 58;
        }else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.println("Peso ideal: " + pesoIdeal);
    }

    
}
