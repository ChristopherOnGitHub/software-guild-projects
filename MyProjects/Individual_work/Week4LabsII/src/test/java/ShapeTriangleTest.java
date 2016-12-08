/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Shapes.ShapeTriangle;
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
public class ShapeTriangleTest {
    
    public ShapeTriangleTest() {
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
     double s1 = 2.3;
     double s2 = 4.56;
     double s3 = 2.3;
     double b = 0;
     double h = 0;
     ShapeTriangle x = new ShapeTriangle(s1, s2, s3, "teal", b, h);
     double expected = 9.16;
     double result = x.perimeterCalc();
     Assert.assertEquals(expected, result, 0.01);     
     }
     
     @Test
     public void moreVariables(){
         double s1 = 3;
         double s2 = 4;
         double s3 = 4;
         double b = 0;
         double h = 0;
         ShapeTriangle x = new ShapeTriangle(s1, s2, s3, "brown", b, h);
         double result = x.perimeterCalc();
         double expected = 11.0;
         Assert.assertEquals(result, expected, 0.01);
     }
     
     @Test
     public void areaTest(){
         double s1 = 13;
         double s2 = 13;
         double s3 = 13;
         double b = 10;
         double h = 3;
         ShapeTriangle x = new ShapeTriangle(s1, s2, s3, "green", b, h);
         double result = x.areaCalc();
         double expected = 15.0;
         Assert.assertEquals(expected, result, 0.00001);
         
     }
     
     @Test
     public void areaTestDecimals(){
         double s1 = .3;
         double s2 = .4;
         double s3 = 6;
         double b = .4758;
         double h = .23456;
         String color = "grey";
         ShapeTriangle tri = new ShapeTriangle(s1, s2, s3, color, b, h);
         double expected = b*h*.5;
         double result = tri.areaCalc();
         Assert.assertEquals(expected, result, 0.00001);
     }
     
}
