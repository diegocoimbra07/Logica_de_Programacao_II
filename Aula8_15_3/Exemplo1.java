package Aula8_15_3;
class   Caculadora{
    /* A sintaxe de um método com retorno é da seguinte forma:
    [modificador de acesso, tipo de retorno, nome do método
    e argumentos. Ao final, se tiver retorno deve ser especificado
    o retorno com tipo igual ao definodo na assinatura do método]*/
    //-somar
    //-dividir
    //-multiplicar
    //mostrarResultado
    
    public static double somar (double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }
}

public class Exemplo1 {
    public static void main(String[] args){
        
        System.out.println( " a soma é " + Caculadora.somar (15 , 200) );
      
    }
    
}
