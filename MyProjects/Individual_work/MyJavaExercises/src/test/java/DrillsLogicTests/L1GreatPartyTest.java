/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L1GreatParty;
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
public class L1GreatPartyTest {
    
    L1GreatParty testObj = new L1GreatParty();
    
    public L1GreatPartyTest() {
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
     public void simpleTrue() {
     int cigars = 50;
     boolean isWeekend = false;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertTrue(result);
     }
         //
     @Test
     public void isWeekendTrue() {
     int cigars = 50;
     boolean isWeekend = true;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertTrue(result);
     }
         //
     @Test
     public void negativeCigars() {
     int cigars = -50;
     boolean isWeekend = false;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertFalse(result);
     }
         //
     @Test
     public void insaneCigars() {
     int cigars = 123456;
     boolean isWeekend = true;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertTrue(result);
     }
         //
     @Test
     public void exactly60() {
     int cigars = 60;
     boolean isWeekend = false;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertTrue(result);
     }
         //
     @Test
     public void cuttingItClose() {
     int cigars = 40;
     boolean isWeekend = true;
     boolean result = testObj.greatParty(cigars, isWeekend);
     Assert.assertTrue(result);
     }
}
