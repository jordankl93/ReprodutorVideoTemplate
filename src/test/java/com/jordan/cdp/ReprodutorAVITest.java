/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class ReprodutorAVITest {
    private ReprodutorTemplate reproduzir;
    
    @Before
    public void before() {
        reproduzir = new ReprodutorAVI();
    }

    /**
     * Test of executar method, of class AplReproduzirVideo.
     */
    @Test
    public void testExecutarFail() {
        System.out.println("executar");
        Video video = new Video(FormatoVideo.MP3, 5000, "TutorialPassarPOO2");
        
        Assert.assertFalse(reproduzir.carregaVideo(video.getFormato()));
    }
    
    @Test
    public void testExecutar() {
        System.out.println("executar");
        Video video = new Video(FormatoVideo.AVI, 5000, "TutorialPassarPOO2");
        
        Assert.assertTrue(reproduzir.carregaVideo(video.getFormato()));
    }
    
}
