package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome [] = new String[20];
        double salario [] = new double[20];
        double novoSalario [] = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o nome: ");
            nome[i] = scanner.nextLine();
            System.out.println("Informe o salário: ");
            salario[i] = scanner.nextDouble();
            scanner.nextLine();
            novoSalario[i] = salario[i] + (salario[i] * 0.08);
        }
        System.out.println("Nome    \t  Novo Salário");
        for (int i = 0; i < 20; i++) {
            System.out.println(nome[i] + "    \t    " + novoSalario[i]);
        } 
        scanner.close();       
    }
    
}
