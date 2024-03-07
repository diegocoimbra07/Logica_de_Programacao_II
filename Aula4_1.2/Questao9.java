import java.util.Scanner;

//9 - Entrar com a sigla do estado de uma pessoa e imprimir 
//uma das mensagens: 
//-carioca
//-paulista 
//-mineiro
//-outros estados 

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String estado;
        System.out.println("Digite a sigla do estado: ");
        estado = input.nextLine();
        if(estado.equals("RJ")){
            System.out.println("Carioca");
        }else if(estado.equals("SP")){
            System.out.println("Paulista");
        }else if(estado.equals("MG")){
            System.out.println("Mineiro");
        }else{
            System.out.println("Outros estados");
        }
    }
    
}
