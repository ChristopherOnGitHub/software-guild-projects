/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S01SayHi;
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
public class S01SayHiTest {

    S01SayHi testObj = new S01SayHi();

    public S01SayHiTest() {
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
        String x = "Chris";
        String expect = "Hello Chris!";
        String result = testObj.sayHi(x);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void space() {
        String x = " ";
        String expect = "Hello  !";
        String result = testObj.sayHi(x);
        Assert.assertEquals(expect, result);
    }
    
    @Test
    public void numbers() {
        String x = "123";
        String expect = "Hello 123!";
        String result = testObj.sayHi(x);
        Assert.assertEquals(expect, result);
    }
    
    @Test
    public void multipleWords() {
        String x = "good sir";
        String expect = "Hello good sir!";
        String result = testObj.sayHi(x);
        Assert.assertEquals(expect, result);
    }
    
    @Test
    public void datBoi() {
        String x = "dat boi";
        String expect = "Hello dat boi!";
        String result = testObj.sayHi(x);
        Assert.assertEquals(expect, result);
    }
}
