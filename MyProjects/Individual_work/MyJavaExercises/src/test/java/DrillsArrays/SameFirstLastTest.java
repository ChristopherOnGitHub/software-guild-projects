/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SameFirstLastTest {
    
    public SameFirstLastTest() {
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
     public void happyTest() {
     int[] x = {1, 2, 1};
     SameFirstLast testObj = new SameFirstLast();
     boolean result = testObj.SameChecker(x);
     boolean expects = true;
     Assert.assertEquals(result, expects);    
     }
     
     @Test
     public void falseTest(){
         int[] x = {1, 2, 3};
         SameFirstLast asdf = new SameFirstLast();
         boolean result = asdf.SameChecker(x);
         boolean expects = false;
         Assert.assertEquals(expects, result);
     }
     
     @Test
     public void negatives(){
         int[] arrX = {-1, -2, -1};
         SameFirstLast x = new SameFirstLast();
         boolean result = x.SameChecker(arrX);
         boolean expecteds = true;
         Assert.assertEquals(result, expecteds);
     }
}
