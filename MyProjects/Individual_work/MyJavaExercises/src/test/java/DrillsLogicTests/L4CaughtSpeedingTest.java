/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L4CaughtSpeeding;
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
public class L4CaughtSpeedingTest {
    
    L4CaughtSpeeding testObj = new L4CaughtSpeeding();
    
    public L4CaughtSpeedingTest() {
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
    
     @Test
     public void whydYouEvenPullMeOver() {
     int speed = 30;
     boolean birthday = false;
     int result = testObj.caughtSpeeding(speed, birthday);
     Assert.assertEquals(0, result);
     } 
     
     @Test
     public void cuttingItClose() {
     int speed = 60;
     boolean birthday = false;
     int result = testObj.caughtSpeeding(speed, birthday);
     Assert.assertEquals(0, result);
     }
         
     @Test
     public void negative() {
     int speed = -7;
     boolean birthday = false;
     int result = testObj.caughtSpeeding(speed, birthday);
     Assert.assertEquals(0, result);
     }
         
     @Test
     public void superSpeeder() {
     int speed = 140;
     boolean birthday = true;
     int result = testObj.caughtSpeeding(speed, birthday);
     Assert.assertEquals(2, result);
     }
         
     @Test
     public void gettingOffEasy() {
     int speed = 64;
     boolean birthday = true;
     int result = testObj.caughtSpeeding(speed, birthday);
     Assert.assertEquals(1, result);
     }
}
