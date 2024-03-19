package Aula8_15_3;

class Calculadora {
    
    /* A sintaxe de um método com retorno é da seguinte forma:
    [modificador de acesso, tipo de retorno, nome do método
    e argumentos. Ao final, se tiver retorno deve ser especificado
    o retorno com tipo igual ao definodo na assinatura do método]*/       
    public static double somar (double num1,  double num2){
      double resultado = num1 / num2;   
     return resultado;
    }
    
    public static String dividir (double num1,  double num2){
     String resultado;
        if(num2==0){
          resultado = "Impossível dividir por zero";
      } else {
             resultado = String.valueOf(num1 / num2); 
        }        
     return resultado;
    }
                 
}
public class Exemplo4 {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 2;
        System.out.println(" Soma dos número é: "+
                Calculadora.somar(num1,num2));
        
        System.out.println(" Soma dos número é: "+
                Calculadora.dividir(5,0));
    }
   
}