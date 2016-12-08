/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.OrderDAO;
import DAO.OrderDAOImpl;
import DAO.ProductDAO;
import DAO.StateTaxDAO;
import DTOs.Order;
import java.io.IOException;
import java.lang.annotation.Annotation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class FlooringTest {
    
    private OrderDAO orderDao;
    private ProductDAO productDao;
    private StateTaxDAO stateDao;
    
    
    public FlooringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       OrderDAOImpl testObj = new OrderDAOImpl();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void simpleOrder() throws IOException {
         orderDao.loadOrders();
         Order a = new Order (99999, "01/23/1999", "Mr. Man", "Idaho", 0, "Glorious Steel",
                 0, 0, 0, 0, 0, 0, 0);

         orderDao.addOrder(a);
     }
}
