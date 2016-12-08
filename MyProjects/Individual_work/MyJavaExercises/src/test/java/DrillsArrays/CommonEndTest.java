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

/**
 *
 * @author apprentice
 */
public class CommonEndTest {

    public CommonEndTest() {
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
        int[] z = {5, 7, 8};
        int[] y = {1, 2, 8};
        CommonEnd testObj = new CommonEnd();
        boolean result = testObj.commonEnd(z, y);

        Assert.assertEquals("Input {5, 7, 8} no true as expected",
                true, result);
    }

    @Test
    public void testNegativeFirst() {
        int[] z = {-4, 6, 1, 24};
        int[] y = {-4, 123, 7, 3};
        CommonEnd testObj = new CommonEnd();
        boolean result = testObj.commonEnd(z, y);
        
        Assert.assertEquals("Negative First test has failed", true, result);
    }
    
    @Test
    public void testZeros(){
        int[] z = {0, 0, 0, 0};
        int[] y = {0, 0, 0, 0};
        CommonEnd testObj = new CommonEnd();
        boolean result = testObj.commonEnd(z, y);
        
        Assert.assertEquals("All zeros test has failed", true, result);
    }
    
    @Test
    public void testFalse(){
        int [] z = {1, 2, 3, 4};
        int [] y = {5, 6, 7, 8};
        CommonEnd testObj = new CommonEnd();
        boolean result = testObj.commonEnd(z, y);
        
        Assert.assertEquals("False arrays returning true test failed", false, result);
    }
    
    @Test
    public void testPositiveNegativeFalse(){
        int [] z = {1, 5, 6, 12};
        int [] y = {-1, 4, 5, -12};
        CommonEnd testObj = new CommonEnd();
        boolean result = testObj.commonEnd(z, y);
        
        Assert.assertEquals("Positve, Negative test has failed", false, result);
    }

}
