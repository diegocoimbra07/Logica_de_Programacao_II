package Aula9_21_3;

public class Exemplo5 {

    public static void main(String[] args) {
        String nomeCurso = "Curso Java Web";
        //É A DIFERENÇA DO 1º E 2º PARÂMETRO DO MÉTODO getChars
        //SE DIMINUIR OS 2 O RESULTADO TEM QUE SER O MESMO INICIADO NO ARRAY
        char[] numIndice = new char[8];

        nomeCurso.getChars(0, 8, numIndice, 0);
        System.out.print("Valores Copiados \n");

        for (char caracter : numIndice) {
            System.out.print("[" + caracter + "]");
        }
        System.out.println();
        for (int i = 0; i < numIndice.length; i++) {
            System.out.println(numIndice[i]);
        }

        System.out.println("\n\n Abaixo Índice demonstrativo dos valores copiados\n");

        int[] b = {0, 1, 2, 3, 4, 5, 6};
        for (int i = 0; i < b.length; i++) {
            System.out.print("[" + b[i] + "]");
        }
    }
}
