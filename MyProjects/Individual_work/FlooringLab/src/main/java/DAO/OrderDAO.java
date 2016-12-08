/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTOs.Order;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface OrderDAO {

    void addOrder(Order newOrder);

    void deleteOrder(Order orderToDelete);

    ArrayList<Order> getAllOrders();

    Order getOrder(String date, int orderNum);

    ArrayList<Order> getOrderByDate(String d);

    Order getOrderByOrderNum(int orderNum);

    void loadOrders() throws IOException;

    void saveOrders() throws IOException;
    
}
