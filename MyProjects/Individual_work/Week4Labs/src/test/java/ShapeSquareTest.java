/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Shapes.ShapeSquare;
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
public class ShapeSquareTest {
    
    public ShapeSquareTest() {
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
     public void basicTest() {
     double b = 2.0;
     double h = 2.0;
     ShapeSquare x = new ShapeSquare(b, h, "white");
     double result = x.areaCalc();
     double expected = 4.0;
     Assert.assertEquals(expected, result, 0.0001);
     }
     
     @Test
     public void decimalsTest(){
         double b = 2.34567;
         double h = 2.34567;
         ShapeSquare theSquare = new ShapeSquare(b, h, "maroon");
         double result = theSquare.areaCalc();
         double expected = b*h;
         Assert.assertEquals(expected, result, 0.0000001);
     }
     
     @Test
     public void basicPerimeter(){
         double b = 6;
         ShapeSquare x = new ShapeSquare(b, b, "yellow");
         double result = x.perimeterCalc();
         double expected = 24.0;
         Assert.assertEquals(expected, result, 0.0001);
     }
     
     @Test
     public void decimalPerimeter(){
         double b = 1.23456789;
         ShapeSquare aSquare = new ShapeSquare(b,b,"hot pink");
         double result = aSquare.perimeterCalc();
         double expected = b*4;
         Assert.assertEquals(result, expected, 0.001);
     }
}
