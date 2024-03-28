/*8 -Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  
uma variável inteira), imprima cada um dos seus dígitos por extenso.  
Exemplo:  
Entre o número: 4571  
Resultado: quatro, cinco, sete, um*/


public class Questao8 {
    public static void main(String[] args) {
        int numero = 1313;
        String numeroPorExtenso = "";
        String numeroString = Integer.toString(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            switch (numeroString.charAt(i)) {
                case '0':
                    numeroPorExtenso += "zero";
                    break;
                case '1':
                    numeroPorExtenso += "um";
                    break;
                case '2':
                    numeroPorExtenso += "dois";
                    break;
                case '3':
                    numeroPorExtenso += "três";
                    break;
                case '4':
                    numeroPorExtenso += "quatro";
                    break;
                case '5':
                    numeroPorExtenso += "cinco";
                    break;
                case '6':
                    numeroPorExtenso += "seis";
                    break;
                case '7':
                    numeroPorExtenso += "sete";
                    break;
                case '8':
                    numeroPorExtenso += "oito";
                    break;
                case '9':
                    numeroPorExtenso += "nove";
                    break;
            }
            if (i < numeroString.length() - 1) {
                numeroPorExtenso += ", ";
            }
        }
        System.out.println("Resultado: " + numeroPorExtenso);
    }
    
}
