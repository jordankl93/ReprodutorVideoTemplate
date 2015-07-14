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
public class ReprodutorMP4 extends ReprodutorTemplate{

    @Override
    public boolean carregaVideo(FormatoVideo formato) {
        return FormatoVideo.MP4 == formato;
    }
    
}
