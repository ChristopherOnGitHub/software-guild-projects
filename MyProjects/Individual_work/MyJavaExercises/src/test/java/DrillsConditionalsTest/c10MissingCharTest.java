/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c10MissingChar;
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
public class c10MissingCharTest {
    
    c10MissingChar testObj = new c10MissingChar();
    
    public c10MissingCharTest() {
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
    public void simple() {
        String str = "Chris";
        int x = 1;
        String expect = "Cris";
        String result = testObj.missingChar(str, x);
        Assert.assertTrue(expect.equals(result));
    }
    
    @Test
    public void lastLetter() {
        String str = "Harambe";
        int x = 6;
        String expect = "Haramb";
        String result = testObj.missingChar(str, x);
        Assert.assertTrue(expect.equals(result));
    }
    
    @Test
    public void firstLetter(){
        String str = "knife";
        int x = 0;
        String expect = "nife";
        String result = testObj.missingChar(str, x);
        Assert.assertTrue(expect.equals(result));
    }
}
