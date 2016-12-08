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
public class HasEvenTest {

    public HasEvenTest() {
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
    public void testA() {
        
        int[] testArray = {4,3};
        HasEven testObj = new HasEven();
        boolean result = testObj.hasEven(testArray);
        
        Assert.assertEquals("Input {4,3} not true as expected",
                true, result);
        
        
    }

    @Test
    public void testB() {
        
        int[] testArray = {5, 7, 8};
        HasEven testObj = new HasEven();
        boolean result = testObj.hasEven(testArray);
        
        Assert.assertEquals("Input {5, 7, 8} no true as expected",
                true, result);
    }

    @Test
    public void testC() {
        
        int[] testArray = {4, 5};
        HasEven testObj = new HasEven();
        boolean result = testObj.hasEven(testArray);
        
        Assert.assertEquals("Input test3 not true like expected",
                true, result);
    }
    
    
    @Test
    public void testHasEvenWithBigArray(){
        int[] testArray = {895, -89, 1, 45, 245674819, 23, 000000000001, 4};
        HasEven testObj = new HasEven();
        boolean result = testObj.hasEven(testArray);
        Assert.assertTrue("Input not true as expected", result);
    }
    
    @Test
    public void testEvenWithSmallArray(){
        int[] testArray = {-7};
        HasEven testObj = new HasEven();
        boolean result = testObj.hasEven(testArray);
        Assert.assertFalse("Input not false as expected", result);
    }
}
