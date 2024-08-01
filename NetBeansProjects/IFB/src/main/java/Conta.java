/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 37551335803
 */
public class Conta {
    double saldo;
    String numero;

   public void depositar (double valor){
       this.saldo = this.saldo+ valor;

    }

    public void sacar (double valor){
        if (valor> this.saldo){
            System.out.println("Saldo insuficiente.");
        } else {
                this.saldo = this.saldo - valor;
            }
    }
    public double getSaldo(){
        return this.numero;

    }
    public public String toString (){
        String saida = "";
        saida = "Número: = " + this.numero +
                "Saldo: = " + getSaldo();

        return saida;
        }
    }
  
