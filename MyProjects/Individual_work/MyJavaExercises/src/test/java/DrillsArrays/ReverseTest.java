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
public class ReverseTest {
    
    public ReverseTest() {
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
     public void test1() {
     int[] asdf = {7,8,9};
     Reverse testObj = new Reverse();
     int[] result = testObj.Reverse(asdf);
     Assert.assertArrayEquals("test 1 failure", asdf, result);
     }
     
     @Test
     public void testNegatives(){
         int[] asdf = {-1, 0, -3};
         Reverse testObj = new Reverse();
         int[] result = testObj.Reverse(asdf);
        Assert.assertArrayEquals(asdf, result);
     }
     
     @Test
     public void test2(){
         int[] asdf = {2, 2, 3};
         Reverse testObj = new Reverse();
         int[] result = testObj.Reverse(asdf);
         Assert.assertArrayEquals(asdf, result);
     }
}
