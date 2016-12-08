/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c3SumDouble;
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
public class c3SumDoubleTest {
    
    c3SumDouble testObj = new c3SumDouble();
    
    public c3SumDoubleTest() {
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
     public void simpleSum() {
     int a = 1;
     int b = 2;
     int actual = testObj.sumDouble(a, b);
     int expect = 3;
     Assert.assertEquals(actual, expect);
     }
     
     @Test
     public void doubleSum(){
         int a = 2;
         int b = 2;
         int actual = testObj.sumDouble(a, b);
         int expect = 8;
         Assert.assertEquals(expect, actual);
     }
     
     @Test
     public void negativeDouble(){
         int a = -2;
         int b = -2;
         int actual = testObj.sumDouble(a, b);
         int expect = -8;
         Assert.assertEquals(expect, actual);
     }
}
