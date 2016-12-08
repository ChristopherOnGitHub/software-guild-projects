/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L2CanHazTable;
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
public class L2CanHazTableTest {
    
    L2CanHazTable testObj = new L2CanHazTable();
    
    public L2CanHazTableTest() {
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
     public void wayToRuinItDude() {
     int yourStyle = 1;
     int dateStyle = 9;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(0, result);
     }
     
          @Test
     public void maaaaaybe() {
     int yourStyle = 6;
     int dateStyle = 5;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(1, result);
     }
     
          @Test
     public void lookinGood() {
     int yourStyle = 10;
     int dateStyle = 9;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(2, result);
     }
     
          @Test
     public void showingHerUp() {
     int yourStyle = 9;
     int dateStyle = 6;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(2, result);
     }
     
          @Test
     public void superFly() {
     int yourStyle = 11;
     int dateStyle = 9;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(2, result);
     }
     
          @Test
     public void showingMeUp() {
     int yourStyle = 4;
     int dateStyle = 9;
     int result = testObj.canHazTable(yourStyle, dateStyle);
     Assert.assertEquals(2, result);
     }
}
