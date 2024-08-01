/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_1_8;

/**
 *
 * @author 37551335803
 */
public class Livro {
    String titulo;
    String autor;
    int paginas;
            
    //Construtor com um parâmentro
    public Livro (String titulo) {
        this.titulo = titulo;
    }
    
    //Construtor com dois parâmentros
    public Livro (String titulo, String autor){
        //Chama o primeiro contrutor
        this(titulo);
        this.autor = autor;
    }
    
    //Construtor com três parâmetros
    public Livro (String titulo, String autor, int paginas) {
        //Chama o segundo construtor
        this (titulo, autor);
        this.paginas = paginas;
    }
}
