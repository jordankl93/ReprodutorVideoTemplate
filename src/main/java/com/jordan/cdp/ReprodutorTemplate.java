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
public abstract class ReprodutorTemplate {

    public abstract boolean carregaVideo(FormatoVideo formato);

    public void reproduzirVideo(Video video) {

        try {
            if (carregaVideo(video.getFormato())) {
                System.out.println("Video: " + video.getNome() + "." + video.getFormato().toString().toLowerCase());
                System.out.println("Tempo duracao: " + video.getDuracao());
                System.out.println("Executando ...");
                Thread.sleep((long) video.getDuracao());
                System.out.println("Fim de video!");
            } else {
                System.out.println("Formato inválido");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
