package Aula14_12_4;
/*1 - Criar uma classe Conta;
    a) declarar os seguintes atributos nessa classe: numero, cliente, saldo e limite. 

2 - Criar uma classe TestarConta;
   a) criar o método principal;
   b) instanciar 2 objetos do tipo Conta;
   c) modificar os valores dos atributos de cada objeto;
   d) mostrar os valores dos atributos de cada objeto; */

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
