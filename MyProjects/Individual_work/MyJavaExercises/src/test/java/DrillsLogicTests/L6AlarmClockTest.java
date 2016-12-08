/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L6AlarmClock;
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
public class L6AlarmClockTest {

    L6AlarmClock testObj = new L6AlarmClock();

    public L6AlarmClockTest() {
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
    public void simpleWorkDay() {
        int day = 3;
        boolean vacation = false;
        String result = testObj.alarmClock(day, vacation);
        Assert.assertEquals("7:00", result);
    }

    @Test
    public void weekEndNormal() {
        int day = 0;
        boolean vacation = false;
        String result = testObj.alarmClock(day, vacation);
        Assert.assertEquals("10:00", result);
    }

    @Test
    public void weekdayVacation() {
        int day = 4;
        boolean vacation = true;
        String result = testObj.alarmClock(day, vacation);
        Assert.assertEquals("10:00", result);
    }

    @Test
    public void weekendVacation() {
        int day = 0;
        boolean vacation = true;
        String result = testObj.alarmClock(day, vacation);
        Assert.assertEquals("off", result);
    }

    @Test
    public void negative() {
        int day = -3;
        boolean vacation = false;
        String result = testObj.alarmClock(day, vacation);
        Assert.assertEquals("7:00", result);
    }

}
