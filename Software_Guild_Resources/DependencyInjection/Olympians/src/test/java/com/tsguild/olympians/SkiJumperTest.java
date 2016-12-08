/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.olympians;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahill
 */
public class SkiJumperTest {
    
    public SkiJumperTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of competeInEvent method, of class SkiJumper.
     */
    @Test
    public void testCompeteInEvent() {
        SkiJumper skiJumpingAthlete = new SkiJumper();
        assertEquals("SkiJump", skiJumpingAthlete.competeInEvent());   
    }
    
}
