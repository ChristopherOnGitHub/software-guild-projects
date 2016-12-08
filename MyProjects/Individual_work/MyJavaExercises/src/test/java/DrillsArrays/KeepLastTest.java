/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

import java.util.List;
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
public class KeepLastTest {

    public KeepLastTest() {
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
        int[] testA = {2, 3, 4};
        KeepLast testObj = new KeepLast();
        int[] expect = {0, 0, 0, 0, 0, 4};
        int[] result = testObj.KeepLast(testA);
        Assert.assertArrayEquals(expect, result);
    }
    
    @Test
    public void zeros(){
        int[] test = {0,0,0,};
        KeepLast testObj = new KeepLast();
        int[] expect = {0,0,0,0,0,0,};
        int[] result = testObj.KeepLast(test);
        Assert.assertArrayEquals(expect, result);
    }
}
