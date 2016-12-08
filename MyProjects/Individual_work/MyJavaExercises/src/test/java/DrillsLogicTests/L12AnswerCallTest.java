/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L12AnswerCell;
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
public class L12AnswerCallTest {
    
    L12AnswerCell testObj = new L12AnswerCell();
    
    public L12AnswerCallTest() {
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
     public void normalDay() {
     boolean isMorn = false;
     boolean isMom = false;
     boolean isAsleep = false;
     boolean result = testObj.answerCell(isMorn, isMom, isAsleep);
     Assert.assertTrue(result);
     }
         
     @Test
     public void asleep() {
     boolean isMorn = false;
     boolean isMom = false;
     boolean isAsleep = true;
     boolean result = testObj.answerCell(isMorn, isMom, isAsleep);
     Assert.assertFalse(result);
     }
         
     @Test
     public void morning() {
     boolean isMorn = true;
     boolean isMom = false;
     boolean isAsleep = false;
     boolean result = testObj.answerCell(isMorn, isMom, isAsleep);
     Assert.assertFalse(result);
     }
         
     @Test
     public void momMorn() {
     boolean isMorn = true;
     boolean isMom = true;
     boolean isAsleep = false;
     boolean result = testObj.answerCell(isMorn, isMom, isAsleep);
     Assert.assertTrue(result);
     }
         
     @Test
     public void momAsleep() {
     boolean isMorn = false;
     boolean isMom = true;
     boolean isAsleep = true;
     boolean result = testObj.answerCell(isMorn, isMom, isAsleep);
     Assert.assertFalse(result);
     }
}
