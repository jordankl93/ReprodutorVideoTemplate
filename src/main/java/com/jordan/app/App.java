/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.app;

import com.jordan.cdp.FormatoVideo;
import com.jordan.cdp.Video;
import com.jordan.cgt.AplReproduzirVideo;

/**
 *
 * @author Jordan-Not
 */
public class App {
    
    public static void main(String[] args){
        Video video = new Video(FormatoVideo.MP4, 5000, "PoeiraEmAltoMar");
        AplReproduzirVideo reproduzir = new AplReproduzirVideo();
        
        reproduzir.executar(video);        
    }
    
}
