/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class L2FrontTimesTest {
    
    L2FrontTimes testObj = new L2FrontTimes();
    
    public L2FrontTimesTest() {
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
     public void simpleTest() {
     String str = "Chug";
     int rpt = 3;
     String expect = "ChuChuChu";
     String result = testObj.frontTimes(str, rpt);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void twoLetters() {
     String str = "ab";
     int rpt = 3;
     String expect = "ababab";
     String result = testObj.frontTimes(str, rpt);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void oneLetter() {
     String str = "Z";
     int rpt = 1;
     String expect = "Z";
     String result = testObj.frontTimes(str, rpt);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void threeLetter() {
     String str = "abc";
     int rpt = 5;
     String expect = "abcabcabcabcabc";
     String result = testObj.frontTimes(str, rpt);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void space() {
     String str = "Dr ";
     int rpt = 3;
     String expect = "Dr Dr Dr ";
     String result = testObj.frontTimes(str, rpt);
     Assert.assertEquals(expect, result);
     }
}
