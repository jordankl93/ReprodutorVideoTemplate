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
public class ReprodutorAVI extends ReprodutorTemplate{

    @Override
    public boolean carregaVideo(FormatoVideo formato) {
        return FormatoVideo.AVI == formato;
    }
    
}
