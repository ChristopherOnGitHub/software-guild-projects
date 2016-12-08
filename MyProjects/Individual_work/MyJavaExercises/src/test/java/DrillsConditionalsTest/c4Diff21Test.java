/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c4Diff21;
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
public class c4Diff21Test {
    
    c4Diff21 testObj = new c4Diff21();
    
    public c4Diff21Test() {
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
        int n = 11;
        int result = testObj.diff21(n);
        int expect = 10;
        Assert.assertEquals(expect, result, .001);
    }
    
    @Test
    public void negative() {
        int n = 25;
        int result = testObj.diff21(n);
        int expect = 8;
        Assert.assertEquals(expect, result);
    }
}
