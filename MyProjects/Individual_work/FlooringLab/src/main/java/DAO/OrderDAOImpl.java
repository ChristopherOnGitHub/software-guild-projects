/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTOs.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class OrderDAOImpl implements OrderDAO {

    private final HashMap<String, ArrayList<Order>> orderList;
    private final String DELIMITER = ",";
    private final ArrayList<Order> OrderAL;

    public OrderDAOImpl() {
        orderList = new HashMap();
        OrderAL = new ArrayList<>();
    }

    @Override
    public void loadOrders() throws IOException {
        Order newOrder;

        File dir = new File("orders");
        File[] filesInDir = dir.listFiles();
        for (int i = 0; i < filesInDir.length; i++) {

            Scanner fileSC = new Scanner(filesInDir[i]);
            ArrayList<Order> newOrderList = new ArrayList<>();
            String fileName = filesInDir[i].getName().replace(".txt", "");
            fileName = fileName.replace("Orders_", "");
            String MM = fileName.substring(0, 2);
            String DD = fileName.substring(2, 4);
            String YYYY = fileName.substring(4, 8);
            while (fileSC.hasNextLine()) {
                String tempString = fileSC.nextLine();
                String[] x = tempString.split(DELIMITER);

                if (x.length != 12) {
                    continue;
                }

                newOrder = new Order(Integer.parseInt(x[0]), (MM + "/" + DD + "/" + YYYY), x[1], x[2],
                        Double.parseDouble(x[3]), x[4], Double.parseDouble(x[5]),
                        Double.parseDouble(x[6]), Double.parseDouble(x[7]), Double.parseDouble(x[8]),
                        Double.parseDouble(x[9]), Double.parseDouble(x[10]), Double.parseDouble(x[11]));

                newOrderList.add(newOrder);
            }
            String prettyDate = (MM + "/" + DD + "/" + YYYY);
            orderList.put(prettyDate, newOrderList);
            fileSC.close();
        }
    }

    @Override
    public Order getOrder(String date, int orderNum) {

        Order orderToGet = null;

        for (ArrayList<Order> i : orderList.values()) {
            if (date.equals(date)) {
                for (int j = 0; j < i.size(); j++) {
                    if (i.get(j).getOrderNumber() == orderNum) {
                        orderToGet = i.get(j);
                    }
                }
            }
        }

        return orderToGet;
    }

    @Override
    public Order getOrderByOrderNum(int orderNum) {

        Order orderToGet = null;

        for (ArrayList<Order> i : orderList.values()) {
            for (int j = 0; j < i.size(); j++) {
                if (i.get(j).getOrderNumber() == orderNum) {
                    orderToGet = i.get(j);
                }
            }
        }

        return orderToGet;
    }

    @Override
    public ArrayList<Order> getOrderByDate(String d) {

        ArrayList<Order> dateOrders = new ArrayList();

        for (ArrayList<Order> i : orderList.values()) {

            for (Order yearOrder : i) {
                if (yearOrder.getDate().contains(d)) {
                    dateOrders.add(yearOrder);
                }
            }
        }

        return dateOrders;
    }

    @Override
    public ArrayList<Order> getAllOrders() {
        ArrayList<Order> allOrders = new ArrayList();
        for (ArrayList<Order> i : orderList.values()) {
            for (Order x : i) {
                allOrders.add(x);
            }
        }

        return allOrders;
    }

    @Override
    public void addOrder(Order newOrder) {

        ArrayList<Order> orderAL = orderList.get(newOrder.getDate());

        if (orderAL == null) {
            ArrayList<Order> newOrderAL = new ArrayList<>();
            orderList.put(newOrder.getDate(), newOrderAL);
            newOrderAL.add(newOrder);
        } else {
            orderAL.add(newOrder);
        }
    }

    @Override
    public void deleteOrder(Order orderToDelete) {

        for (ArrayList<Order> i : orderList.values()) {
            for (int j = 0; j < i.size(); j++) {
                if (i.get(j).equals(orderToDelete)) {
                    i.remove(j);
                }
            }
        }
    }

    @Override
    public void saveOrders() throws IOException {
        PrintWriter writer;
        ArrayList<Order> orderAL;

        for (String key : orderList.keySet()) {
            ArrayList<ArrayList<Order>> toSaveAL = new ArrayList();

            for (String keyMatch : orderList.keySet()) {
                if (keyMatch.equals(key)) {
                    orderAL = (orderList.get(key));
                    toSaveAL.add(orderAL);
                    String prettyKey = key;
                    prettyKey = prettyKey.replaceAll("/", "");
                    String saveFile = "Orders_" + prettyKey + ".txt";
                    writer = new PrintWriter(new FileWriter("orders/" + saveFile));

                    for (ArrayList<Order> dateOrder : toSaveAL) {
                        for (Order toSave : dateOrder) {

                            writer.println(
                                    toSave.getOrderNumber() + DELIMITER
                                    + toSave.getCustomerName() + DELIMITER
                                    + toSave.getState() + DELIMITER
                                    + toSave.getTaxRate() + DELIMITER
                                    + toSave.getProductType() + DELIMITER
                                    + toSave.getArea() + DELIMITER
                                    + toSave.getCostSqFt() + DELIMITER
                                    + toSave.getLaborSqFt() + DELIMITER
                                    + toSave.getMaterialCost() + DELIMITER
                                    + toSave.getLaborCost() + DELIMITER
                                    + toSave.getTax() + DELIMITER
                                    + toSave.getTotal());

                        }
                        writer.flush();
                        writer.close();
                    }

                }
            }
        }
    }

}
