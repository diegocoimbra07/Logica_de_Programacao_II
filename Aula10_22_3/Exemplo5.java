package Aula10_22_3;

public class Exemplo5 {
    public static String invertido (String nome){
        String invertida="";
        
        for (int i = nome.length()-1; i >= 0; i--) {
            invertida = invertida + nome.charAt(i);
           
        }
        
        return invertida;
    }
    public static void main(String[] args) {
        
        System.out.println(invertido("Diego"));
        
    }
}
