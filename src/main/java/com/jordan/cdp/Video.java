/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan-Not
 */
public class Video {
    private FormatoVideo formato;
    private int duracao;
    private String nome;

    public Video(FormatoVideo formato, int duracao, String nome) {
        this.formato = formato;
        this.duracao = duracao;
        this.nome = nome;
    }

    public FormatoVideo getFormato() {
        return formato;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }  
    
}
