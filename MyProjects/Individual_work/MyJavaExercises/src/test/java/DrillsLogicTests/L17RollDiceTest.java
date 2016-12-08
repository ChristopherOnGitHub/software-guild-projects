/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L17RollDice;
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
public class L17RollDiceTest {

    L17RollDice testObj = new L17RollDice();

    public L17RollDiceTest() {
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
    public void simpleTotal() {
        int die1 = 4;
        int die2 = 4;
        boolean noDoubles = false;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(8, result);
    }

    @Test
    public void simpleTotalDouble() {
        int die1 = 4;
        int die2 = 4;
        boolean noDoubles = true;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(9, result);
    }

    @Test
    public void simpleTotalDouble6() {
        int die1 = 6;
        int die2 = 6;
        boolean noDoubles = true;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(7, result);
    }

    @Test
    public void simpleTotal6s() {
        int die1 = 6;
        int die2 = 6;
        boolean noDoubles = false;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(12, result);
    }

    @Test
    public void simpleTotalnonDoubles() {
        int die1 = 2;
        int die2 = 6;
        boolean noDoubles = true;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(8, result);
    }

    @Test
    public void derp() {
        int die1 = 3;
        int die2 = 2;
        boolean noDoubles = true;
        int result = testObj.rollDice(die1, die2, noDoubles);
        Assert.assertEquals(5, result);
    }
}
