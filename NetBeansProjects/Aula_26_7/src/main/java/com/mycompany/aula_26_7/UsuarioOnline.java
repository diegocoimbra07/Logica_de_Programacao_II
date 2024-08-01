/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_26_7;

/**
 *
 * @author 37551335803
 */
public class UsuarioOnline {
    int totalUsuarioOnline;
    String local;
    String horadeAcesso;
    
    void setLocal (String local) {
        this.local = local;
    }
    
    void setHoraDeAcesso (String horaDeAcesso) {
        this.horadeAcesso = horadeAcesso;
    }
    
    void setTotalUsuarioOnline (int totalUsuarioOnline){
        this.totalUsuarioOnline = totalUsuarioOnline;
    }
    
    int totalUsuarioOnline() {
        return this. totalUsuarioOnline;
    }
    
    void exibirInformacao(){
        String saida = "";
        saida = "Local: " + this.local +
                ", Hora de acesso: " + this.horadeAcesso +
                ", total de usuários online: " + totalUsuarioOnline();
        
        System.out.println("saída");
    }
    
}
