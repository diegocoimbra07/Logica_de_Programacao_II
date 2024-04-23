package Aula14_12_4;

/*1 - Criar uma classe Conta;
    a) declarar os seguintes atributos nessa classe: numero, cliente, saldo e limite. 

2 - Criar uma classe TestarConta;
   a) criar o método principal;
   b) instanciar 2 objetos do tipo Conta;
   c) modificar os valores dos atributos de cada objeto;
   d) mostrar os valores dos atributos de cada objeto; */

public class TestarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNumero(123456);
        conta1.setCliente("Diego");
        conta1.setSaldo(1000);
        conta1.setLimite(500);

        Conta conta2 = new Conta();
        conta2.setNumero(1234567);
        conta2.setCliente("Ana");
        conta2.setSaldo(2000);
        conta2.setLimite(1000);

        System.out.println("Conta 1: Número: " + conta1.getNumero() + ", Cliente: " + conta1.getCliente() + ", Saldo: " + conta1.getSaldo() + ", Limite: " + conta1.getLimite());
        System.out.println("Conta 2: Número: " + conta2.getNumero() + ", Cliente: " + conta2.getCliente() + ", Saldo: " + conta2.getSaldo() + ", Limite: " + conta2.getLimite());
    }
    
}
