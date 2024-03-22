package Aula10_22_3;

public class Exemplo6 {
    public static void main(String[] args) {
        String nomes []= {"José Silva", "Mario Souza","Maria Silva"};
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].startsWith("Mari")){
                System.out.println(nomes[i]);
            }
        }
    }
}
