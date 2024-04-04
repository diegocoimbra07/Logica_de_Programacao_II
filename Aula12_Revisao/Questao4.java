package Aula12_Revisao;
import java.util.Scanner;

/*4) Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da locadora.
Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel. 
Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas por mês.
Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano. */
public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fitas, aluguel;
        double faturamentoAnual, multaMes, multaAnual, fitasEstragadas, fitasCompradas, fitasFinal;
        System.out.println("Digite a quantidade de fitas que a locadora possui: ");
        fitas = input.nextInt();
        System.out.println("Digite o valor do aluguel: ");
        aluguel = input.nextInt();
        faturamentoAnual = (fitas / 3) * aluguel * 12;
        multaMes = (fitas / 3) * 0.1 * aluguel / 10;
        multaAnual = multaMes * 12;
        fitasEstragadas = fitas * 0.02;
        fitasCompradas = fitasEstragadas / 10;
        fitasFinal = fitas + fitasCompradas;
        System.out.println("O faturamento anual da locadora é: " + faturamentoAnual);
        System.out.println("O valor ganho com multas por mês é: " + multaMes);
        System.out.println("A quantidade de fitas que a locadora terá no final do ano é: " + fitasFinal);
    }
    
}
