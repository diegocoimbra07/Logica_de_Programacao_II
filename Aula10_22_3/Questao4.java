/*4 - Faça um programa que conte o número de 1’s que aparecem em um 
string. Exemplo: “0011001”-> 3 */



public class Questao4 {
    public static void main(String[] args) {
        String palavra = "0011001";
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == '1') {
                contador++;
            }
        }
        System.out.println("Número de 1's na palavra: " + contador);
    }
    
}
