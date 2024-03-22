package Aula10_22_3;

public class Exemplo4 {
    public static String tornaCaixaAlta(String nome){
       
       String nomeCaixaAlta = nome.toUpperCase();
       
       String nome2 = nome.replace(nome.charAt(0), nomeCaixaAlta.charAt(0));
        
        return nome2;
    }
    
    public static String tornaCaixaBaixa(String nome){      
        return nome.toLowerCase();
    }
    
    public static void main(String[] args) {
        String nome = "diego";
        String nome2 = "COIMBRA";
        System.out.println("Nome em caixa alta " +tornaCaixaAlta (nome) ); 
        System.out.println("Nome em caixa baixa " +tornaCaixaBaixa (nome2) ); 
    }
}
