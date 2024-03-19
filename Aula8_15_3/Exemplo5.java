package Aula8_15_3;

class Calculadora{
    public static void somar (double num1, double num2){

        double resultado = num1 + num2;
        System.out.println("A soma é " + resultado);
    }
}

public class Exemplo5 {
    public static void main(String[] agrs){
        Calculadora.somar(2,2);
    }
    
}
