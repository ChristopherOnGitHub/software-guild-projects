/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c5ParrotTrouble;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class c5ParrotTroubleTest {

    c5ParrotTrouble testObj = new c5ParrotTrouble();

    public c5ParrotTroubleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void simpleFalse() {
        int hour = 1;
        boolean isTalking = false;
        boolean result = testObj.parrotTrouble(isTalking, hour);
        Assert.assertFalse(result);
    }

    @Test
    public void simpleTrue() {
        int hour = 1;
        boolean isTalking = true;
        boolean result = testObj.parrotTrouble(isTalking, hour);
        Assert.assertTrue(result);
    }
    
    @Test
    public void lateTrue(){
        int hour = 22;
        boolean isTalking = true;
        boolean result = testObj.parrotTrouble(isTalking, hour);
        Assert.assertTrue(result);
    }
}
