package Aula10_22_3;

public class Exemplo2 {

    public static void main(String[] args) {
        String nome = "Diego Coimbra";
        System.out.println("String : " + nome);

        String substring = nome.substring(5);
        System.out.println("String depois do 4º index: " + "[" + substring + "]");

        substring = nome.substring(1, 6);
        System.out.println("Substring (1,6): " + "[" + substring + "]");
    }
}
