/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S02Abba;
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
public class S02AbbaTest {
    
    S02Abba testObj = new S02Abba();
    
    public S02AbbaTest() {
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
     String a = "hello";
     String b = "again";
     String expect = "helloagainagainhello";
     String result = testObj.abba(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sameWord() {
     String a = "hello";
     String b = "hello";
     String expect = "hellohellohellohello";
     String result = testObj.abba(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void caps() {
     String a = "Hello";
     String b = "Again";
     String expect = "HelloAgainAgainHello";
     String result = testObj.abba(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void thisHurtsMyEyes() {
     String a = "lo";
     String b = "ol";
     String expect = "loolollo";
     String result = testObj.abba(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String a = "123";
     String b = "again";
     String expect = "123againagain123";
     String result = testObj.abba(a, b);
     Assert.assertEquals(expect, result);
     }
}
