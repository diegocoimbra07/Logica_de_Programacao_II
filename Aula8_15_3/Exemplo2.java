package Aula8_15_3;

class   Caculadora{
    //-somar
    //-dividir
    //-multiplicar
    //mostrarResultado
    public static double dividir (double num1, double num2){
        double resultado = num1 / num2;
        return resultado;
    }
}

public class Exemplo2 {
    public static void main(String[] args){
        
        System.out.println( " A divisão é " + Caculadora.dividir (25 , 5));
      
    }
    
}