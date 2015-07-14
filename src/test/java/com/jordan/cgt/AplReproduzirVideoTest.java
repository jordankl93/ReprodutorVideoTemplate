/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cgt;

import com.jordan.cdp.FormatoVideo;
import com.jordan.cdp.Video;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jordan-Not
 */
public class AplReproduzirVideoTest {
    private AplReproduzirVideo reproduzir;
    
    @Before
    public void before() {
        reproduzir = new AplReproduzirVideo();
    }

    /**
     * Test of executar method, of class AplReproduzirVideo.
     */
    @Test
    public void testExecutar() {
        System.out.println("executar");
        Video video = new Video(FormatoVideo.AVI, 5000, "TutorialPassarPOO2");
        AplReproduzirVideo instance = new AplReproduzirVideo();
        instance.executar(video);
    }
    
}
