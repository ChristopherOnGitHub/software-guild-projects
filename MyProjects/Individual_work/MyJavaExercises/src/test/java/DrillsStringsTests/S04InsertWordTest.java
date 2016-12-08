/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S04InsertWord;
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
public class S04InsertWordTest {
    
    S04InsertWord testObj = new S04InsertWord();
    
    public S04InsertWordTest() {
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
     public void simpleTest() {
     String container = "(())";
     String message = "asdf";
     String expect = "((asdf))";
     String result = testObj.insertWord(container, message);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String container = "*  *";
     String message = " ";
     String expect = "*   *";
     String result = testObj.insertWord(container, message);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void Harambe() {
     String container = "-~~-";
     String message = "Harambe";
     String expect = "-~Harambe~-";
     String result = testObj.insertWord(container, message);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void overlyComplicated() {
     String container = "Cher";
     String message = "ristoph";
     String expect = "Christopher";
     String result = testObj.insertWord(container, message);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void boof() {
     String container = "(<>)";
     String message = "boof";
     String expect = "(<boof>)";
     String result = testObj.insertWord(container, message);
     Assert.assertEquals(expect, result);
     }
}
