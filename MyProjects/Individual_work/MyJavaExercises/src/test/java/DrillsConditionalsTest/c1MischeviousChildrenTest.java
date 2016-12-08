package DrillsConditionalsTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DrillsConditionals.c1MischeviousChildren;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class c1MischeviousChildrenTest {
    
    c1MischeviousChildren testObj = new c1MischeviousChildren();
    
    public c1MischeviousChildrenTest() {
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
    public void bothTrue() {
        boolean a = true;
        boolean b = true;
        boolean result = testObj.MischeviousChildren(a, b);
        boolean expect = true;
        Assert.assertEquals(expect, result);
    }
    
    @Test
    public void bothFalse() {
        boolean a = false;
        boolean b = false;
        boolean result = testObj.MischeviousChildren(a, b);
        boolean expect = true;
        Assert.assertEquals(expect, result);
    }
    
    @Test
    public void diff(){
        boolean a = true;
        boolean b = false;
        boolean result = testObj.MischeviousChildren(a, b);
        boolean expect = false;
        Assert.assertEquals(expect, result);
    }
}
