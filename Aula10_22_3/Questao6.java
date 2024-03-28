/*6 - Faça um programa que receba duas frases distintas e imprima de 
maneira invertida, trocando as letras `as` por *. */


public class Questao6 {
    public static void main(String[] args) {
        String frase1 = "Aula de Java";
        String frase2 = "Aula de Java script";
        String frase1Invertida = new StringBuilder(frase1).reverse().toString();
        String frase2Invertida = new StringBuilder(frase2).reverse().toString();
        frase1Invertida = frase1Invertida.replace("a", "*");
        frase1Invertida = frase1Invertida.replace("A", "*");
        frase1Invertida = frase1Invertida.replace("s", "*");
        frase1Invertida = frase1Invertida.replace("S", "*");
        frase2Invertida = frase2Invertida.replace("a", "*");
        frase2Invertida = frase2Invertida.replace("A", "*");
        frase2Invertida = frase2Invertida.replace("s", "*");
        frase2Invertida = frase2Invertida.replace("S", "*");
        System.out.println("Frase 1 invertida: " + frase1Invertida);
        System.out.println("Frase 2 invertida: " + frase2Invertida);
    }
    
}
