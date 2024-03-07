import java.util.Scanner;

//4 - Uma empresa decide dar um aumento de 30% aos funcionários 
//cujo salário é inferior a 850 reais. Escreva um programa 
//que receba o salário de um funcionário e imprima o valor 
//do salário reajustado ou uma mensagem caso o funcionário 
//não tenha direito ao aumento. 
public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        System.out.println("Digite o salario: ");
        salario = input.nextDouble();
        if(salario < 850){
            salario = salario * 1.3;
            System.out.println("Salario reajustado: " + salario);
        }else{
            System.out.println("Funcionario nao tem direito ao aumento");
        }
    }
    
}
