

import java.util.Scanner;

public class Exemplo4 {
    static Scanner entrada = new Scanner(System.in);
    
    static int codProduto;
    static String procedencia;

    public static void main(String[] args) {
        System.out.println("Digite o código do produto: ");
        codProduto = entrada.nextInt();
        
        switch (codProduto) {
            case 1: procedencia = "Sul"; 
            break;
            case 2: procedencia = "Norte";
            break;
            case 3: procedencia = "Leste";
            break;
            case 4: procedencia = "Oeste";
            break;
            case 5: procedencia = "Nordeste";
            break;
            case 6: procedencia = "Sudeste";
            break;
            case 7: procedencia = "Centro-Oeste";
            break;
            
            default: procedencia = "Inexistente";
        }
        System.out.println("Procedência: " + procedencia);
    }
}
