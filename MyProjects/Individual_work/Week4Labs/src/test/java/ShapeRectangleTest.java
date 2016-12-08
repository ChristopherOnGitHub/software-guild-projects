/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Shapes.ShapeRectangle;
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
public class ShapeRectangleTest {
    
    public ShapeRectangleTest() {
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
     public void basicTest() {
     double b = 12.0;
     double h = 3.0;
     ShapeRectangle x = new ShapeRectangle();
     double expected = 36.0;
     double result = x.areaCalc();
     Assert.assertEquals(result, expected, .0001);
     }
     
     @Test
     public void zeroTest(){
         double b = 0;
         double h = 0;
         ShapeRectangle rec = new ShapeRectangle();
         double expected = 0.0;
         double result = rec.areaCalc();
         Assert.assertEquals(result, expected, 0.0000001);
     }
     
     @Test
     public void perimTest(){
         double base = 12.7;
         double height = 3.4;
         ShapeRectangle a = new ShapeRectangle();
         double expected = (base+base+height+height);
         double result = a.perimeterCalc();
         Assert.assertEquals(result, expected, 0.000001);
     }
     
     @Test
     public void perimTestZero(){
         double b = 0;
         double h = 0;
         ShapeRectangle x = new ShapeRectangle();
         double expected = 0.0;
         double result = x.perimeterCalc();
         Assert.assertEquals(expected, result, 0.000001);
     }
     
     
}
