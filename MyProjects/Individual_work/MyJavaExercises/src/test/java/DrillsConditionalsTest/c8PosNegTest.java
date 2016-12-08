/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c8PosNeg;
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
public class c8PosNegTest {

    c8PosNeg testObj = new c8PosNeg();

    public c8PosNegTest() {
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
    public void posNegSimple() {
        int a = -1;
        int b = 1;
        boolean neg = false;
        boolean result = testObj.posNeg(a, b, neg);
        Assert.assertTrue(result);
    }

    @Test
    public void posNegBooleanDependent() {
        int a = -1;
        int b = -2;
        boolean neg = true;
        boolean result = testObj.posNeg(a, b, neg);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFalse() {
        int a = 12;
        int b = 12;
        boolean neg = false;
        boolean result = testObj.posNeg(a, b, neg);
        Assert.assertFalse(result);
    }
}
