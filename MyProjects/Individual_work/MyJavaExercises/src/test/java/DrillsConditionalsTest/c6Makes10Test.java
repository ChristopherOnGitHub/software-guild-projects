/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c6Makes10;
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
public class c6Makes10Test {
    
    c6Makes10 testObj = new c6Makes10();
    
    public c6Makes10Test() {
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
    public void aIs10() {
        int a = 10;
        int b = 13;
        boolean result = testObj.makes10(a, b);
        Assert.assertTrue(result);
    }
    
    @Test
    public void bIs10() {
        int a = 4;
        int b = 10;
        boolean result = testObj.makes10(a, b);
        Assert.assertTrue(result);
    }
    
    @Test
    public void simpleFalse(){
        int a = 3;
        int b = 89;
        boolean result = testObj.makes10(a, b);
        Assert.assertFalse(result);
    }
    
    @Test
    public void sumIsTen(){
        int a = 5;
        int b = 5;
        boolean result = testObj.makes10(a, b);
        Assert.assertTrue(result);
    }
}
