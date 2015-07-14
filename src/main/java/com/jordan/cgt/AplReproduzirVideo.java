/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cgt;

import com.jordan.cdp.*;

/**
 *
 * @author Jordan-Not
 */
public class AplReproduzirVideo {

    private ReprodutorTemplate reprodutor;

    public void executar(Video video) {
        switch (video.getFormato()) {
            case AVI:
                reprodutor = new ReprodutorAVI();
                break;
            case MP3:
                reprodutor = new ReprodutorMP3();
                break;
            case MP4:
                reprodutor = new ReprodutorMP4();
                break;
        }

        reprodutor.reproduzirVideo(video);
    }

}
