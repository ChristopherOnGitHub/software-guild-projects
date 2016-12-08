/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Shapes.Shape;
import Shapes.ShapeCircle;
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
public class ShapeCircleTest {


    public ShapeCircleTest() {
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

    @Test
    public void testA() {
        double r = 2.5;
        String p = "black";
        ShapeCircle ShapeCircle = new ShapeCircle(r, p);
        double result = ShapeCircle.areaCalc();
        double expected = Math.PI * r * r;
        Assert.assertEquals("Area of circle not expected", expected, result, .01);
    }

    @Test
    public void testNegative() {
        double r = -3;
        String color = "red";
        ShapeCircle ShapeCircle = new ShapeCircle(r, color);
        double result = ShapeCircle.areaCalc();
        double expected = Math.PI * r * r;
        Assert.assertEquals("Area of circle not expected", expected, result, .01);
    }

    @Test
    public void testDifferentEquation() {
        double r = 238723472;
        String z = "blue";
        ShapeCircle ShapeCircle = new ShapeCircle(r, z);
        double result = ShapeCircle.areaCalc();
        double expected = r * Math.PI * r;
        Assert.assertEquals("Area of circle not expected", expected, result, .01);
    }
    
    @Test
    public void testPerimeter() {
        double r = 34.5;
        double expected = Math.PI * 2 * r;
        Shape circle = new ShapeCircle(r, "blue");
        double result = circle.perimeterCalc();
        Assert.assertEquals("Circumference of circle not expected", expected, result, .01);
    }

    @Test
    public void testingPerimeter() {
        double r = 23;
        double expected = Math.PI * 2 * r;
        Shape circle = new ShapeCircle(r, "purple");
        double result = circle.perimeterCalc();
        Assert.assertEquals(expected, result, 0.000001);
    }

    @Test
    public void testPerimeterdifferentEquation() {
        double r = 4.6;
        String color = "purple";
        ShapeCircle x = new ShapeCircle(r, color);
        double result = x.perimeterCalc();
        double expected = r*Math.PI*2;
        Assert.assertEquals("Circumference of circle not expected", expected, result, .01);
    }
}
