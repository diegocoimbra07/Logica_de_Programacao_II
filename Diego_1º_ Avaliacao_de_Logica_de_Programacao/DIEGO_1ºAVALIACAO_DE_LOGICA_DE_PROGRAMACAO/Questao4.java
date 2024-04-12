package DIEGO_1ºAVALIACAO_DE_LOGICA_DE_PROGRAMACAO;

public class Questao4 {
    public static void main(String[] args) {
        double polegadas, centimetros;
        System.out.println("Polegadas \t Centímetros");
        for (polegadas = 1; polegadas <= 20; polegadas++) {
            centimetros = polegadas * 2.54;
            System.out.println(polegadas + "     \t   " + centimetros);
        }
    }
    
}
