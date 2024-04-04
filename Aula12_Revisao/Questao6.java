package Aula12_Revisao;
import java.util.Scanner;

/*6) Entrar com um nome, idade e sexo de 20 pessoas. Imprimir o nome se a pessoa for
do sexo masculino e tiver mais de 21 anos. */
public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        char sexo;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nome = input.nextLine();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = input.nextInt();
            System.out.println("Digite o sexo da pessoa " + (i + 1) + ": ");
            sexo = input.next().charAt(0);
            
            if (sexo == 'M' && idade > 21) {
                System.out.println(nome);
            }
        }
    }
    
}
