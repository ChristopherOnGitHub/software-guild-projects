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
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class HighWinsTest {
    
    public HighWinsTest() {
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
     public void happyPath() {
     int[] a = {1, 2, 3};
     HighWins testObj = new HighWins();
     int[] expects = {3, 3, 3};
     int[] actual = testObj.HighWins(a);
     Assert.assertArrayEquals(expects, actual);     
     }
     
     @Test
     public void biggerNegative(){
         int[] z = {-100, 0, 1};
         HighWins testObj = new HighWins();
         int[] expects = {1, 1, 1};
         int[] result = testObj.HighWins(z);
         Assert.assertArrayEquals(expects, result);
     }
     
     @Test
     public void allNegative(){
         int[] x = {-1, -3, -100};
         HighWins testObj = new HighWins();
         int[] expects = {-1, -1, -1};
         int[] result = testObj.HighWins(x);
         Assert.assertArrayEquals(expects, result);
     }
}
