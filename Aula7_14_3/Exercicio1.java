import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
    double numero = 3.7;
   
   int numeroArredondadoParaInteiro = (int) Math.round(numero);
   float numeroArredondadoParaBaixo = (float) Math.floor(numero);

    
    System.out.println(numero+ " Arredondado para inteiro superior "
        + numeroArredondadoParaInteiro);
    
    System.out.println(numero+ " Arredondado para baixo "
        + numeroArredondadoParaBaixo);
    
 int value = -10;
System.out.println(Math.abs(value));  // Saída: 10   
}
}
