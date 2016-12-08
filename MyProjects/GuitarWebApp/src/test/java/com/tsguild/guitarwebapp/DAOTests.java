/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.guitarwebapp;

import com.tsguild.GuitarWebApp.guitarDAO.guitarDAO;
import guitarDTO.Guitar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class DAOTests {
    
    private guitarDAO testDao;
    
    public DAOTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean(guitarDAO.class);
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void addGuitar() {
     Guitar x = new Guitar(-1, "Fender", "Stratocaster", "Black");
     testDao.addGuitar(x);
     Guitar y = testDao.getSerial(x.getSerial());
     Assert.assertEquals(x, y);
     
     Guitar z = new Guitar(12345, "Gibson", "Flying V", "N/A");
     testDao.removeGuitar(z.getSerial());
     Guitar z2 = testDao.getSerial(z.getSerial());
     Assert.assertNull(z2);
     
     List<Guitar> testGuitarList = testDao.getAllProducts();
     Assert.assertNotNull(testGuitarList);
     
     Guitar z3 = new Guitar (z.getSerial(), "Gibson", "Flying V", "Cherry Red");
     testDao.addGuitar(z3);
     testDao.updateGuitar(z3);
     }
     
     @Test
     public void addStressTests(){
         Guitar a = new Guitar(-2, "Gibson", "Explorer", "   ");
         Guitar b = new Guitar(-3, "1234", " ", null);
         Guitar c = new Guitar(100000000, "000000", "00000.00", "&$#(@&^%){}");
         Guitar d = new Guitar(-999999999, null, null, null);
         Guitar e = new Guitar(101, null, null, null);
         Guitar f = new Guitar(101, "D E A N ---", "A very 'good' color", "''");
         Guitar g = new Guitar(-0, "A very dull null", "12345", "____");
         
         testDao.addGuitar(a);
         testDao.addGuitar(b);
         testDao.addGuitar(c);
         testDao.addGuitar(d);
         testDao.addGuitar(e);
         testDao.addGuitar(g);
         testDao.addGuitar(f);
         
         testDao.removeGuitar(3);
         testDao.removeGuitar(4);
         testDao.removeGuitar(5);
         testDao.removeGuitar(6);
     }
     
     
}
