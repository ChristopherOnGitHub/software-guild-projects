/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c2SleepingIn;
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
public class c2SleepingInTest {

    c2SleepingIn testObj = new c2SleepingIn();

    public c2SleepingInTest() {
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
    public void onVacation() {
        boolean isWeekday = true;
        boolean onVacation = true;
        boolean result = testObj.canSleepIn(isWeekday, onVacation);
        Assert.assertTrue(result);

    }
    
    @Test
    public void noVacation(){
        boolean isWeekday = true;
        boolean onVacation = false;
        boolean result = testObj.canSleepIn(isWeekday, onVacation);
        Assert.assertFalse(result);
    }
}
