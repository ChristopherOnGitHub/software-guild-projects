/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ops;

import DAO.ConfigDAO;
import ui.ConsoleIOImpl;
import DTOs.Material;
import DTOs.Order;
import DAO.OrderDAO;
import DAO.ProductDAO;
import DAO.StateTaxDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class FlooringController {

    private final ConsoleIOImpl console;
    private final OrderDAO orderDAO;
    private final ProductDAO productDAO;
    private final StateTaxDAO stateTaxDAO;
    private final ConfigDAO configDAO;

    public FlooringController(ConsoleIOImpl console, OrderDAO orderDAO, ProductDAO productDAO,
            StateTaxDAO stateTaxDAO, ConfigDAO configDAO) {
        this.console = console;
        this.orderDAO = orderDAO;
        this.productDAO = productDAO;
        this.stateTaxDAO = stateTaxDAO;
        this.configDAO = configDAO;
    }

    public void run() throws IOException {

        boolean keepLooping = true;
        int orderNumber = configDAO.config();

        productDAO.loadMaterials();
        stateTaxDAO.loadMaterials();
        orderDAO.loadOrders();

        do {
            menu();
            int Tripp = console.readInt("SELECT A MENU OPTION", 1, 6);

            switch (Tripp) {
                case 1:
                    displayOrders();
                    break;
                case 2:
                    addOrder(orderNumber);
                    orderNumber = orderNumber + 1;
                    break;
                case 3:
                    editOrder();
                    break;
                case 4:
                    removeOrder();
                    break;
                case 5:
                    String x = configDAO.configTest();
                    if (x.equals("test")) {
                        console.print("Saving not available in test mode.");
                    } else {
                        orderDAO.saveOrders();
                        configDAO.updateOrderNumber(orderNumber, x);
                        console.print("Your changes have been saved.");
                    }
                    break;
                case 6:
                    keepLooping = false;
                    break;

            }
        } while (keepLooping);

        console.print("Goodbye");
    }

    public void menu() {
        console.print("---SELECT A MENU OPTION---");
        console.print("");
        console.print("1. DISPLAY ORDERS");
        console.print("2. ADD AN ORDER");
        console.print("3. EDIT AN ORDER");
        console.print("4. REMOVE AN ORDER");
        console.print("5. SAVE CURRENT WORK");
        console.print("6. QUIT");
        console.print(" ");
    }

    //DISPLAY ORDERS METHOD
    public void displayOrders() {
        Order foundOrder = null;
        console.print("1. Search by order number");
        console.print("2. Search by order date");
        console.print("3. List all orders");
        int searchNum = console.readInt("choose search type: ", 1, 3);

        switch (searchNum) {
            case 1:
                int userQuery = console.readInt("Order number to search: ");

                foundOrder = orderDAO.getOrderByOrderNum(userQuery);

                if (foundOrder != null) {
                    console.print("Order#" + foundOrder.getOrderNumber() + " " + foundOrder.getDate());
                    console.print(foundOrder.getCustomerName() + " at: " + foundOrder.getState());
                    console.print(foundOrder.getArea() + "/sqft of " + foundOrder.getProductType()
                            + ": $" + foundOrder.getTotal());
                    console.print("");
                }

                if (foundOrder == null) {
                    console.print("No orders found");
                }
                break;

            case 2:
                console.print("Search by year or full date?");
                console.print("1. Year");
                console.print("2. Full date");
                int dateChoice = console.readInt("", 1, 2);
                String searchDate = null;
                int foundOrders = 0;

                if (dateChoice == 2) {
                    int year = console.readInt("Enter YYYY", 0000, 9999);
                    int month = console.readInt("MM", 1, 12);
                    int day = console.readInt("DD", 1, 31);
                    if (month < 10 && day < 10) {
                        searchDate = ("0" + month + "/0" + day + "/" + year);
                    } else if (month < 10) {
                        searchDate = ("0" + month + "/" + day + "/" + year);
                    } else if (day < 10) {
                        searchDate = (month + "/0" + day + "/" + year);
                    } else {
                        searchDate = (month + "/" + day + "/" + year);
                    }

                    ArrayList<Order> foundAL = orderDAO.getOrderByDate(searchDate);

                    if (foundAL == null) {
                        console.print("No Orders Found!");
                    } else if (foundAL != null) {
                        for (Order i : foundAL) {
                            foundOrders++;
                            console.print("Order#" + i.getOrderNumber() + " " + i.getDate());
                            console.print(i.getCustomerName() + " at: " + i.getState());
                            console.print(i.getArea() + "/sqft of " + i.getProductType()
                                    + ": $" + i.getTotal());
                            console.print("");
                        }

                        if (foundOrders == 0) {
                            console.print("There are no orders present in the given file");
                        }
                    }
                }

                if (dateChoice == 1) {

                    foundOrders = 0;

                    int year = console.readInt("Enter YYYY", 0000, 9999);
                    String yearSearch = "" + year;
                    ArrayList<Order> foundAL = orderDAO.getOrderByDate(yearSearch);
                    String theYear = (year + "");
                    for (Order i : foundAL) {
                        if (i.getDate().contains(theYear)) {
                            foundOrders++;
                            console.print("Order#" + i.getOrderNumber() + " " + i.getDate());
                            console.print(i.getCustomerName() + " at: " + i.getState());
                            console.print(i.getArea() + "/sqft of " + i.getProductType()
                                    + ": $" + i.getTotal());
                            console.print("");
                        }
                    }
                }

                if (foundOrders == 0) {
                    console.print("No orders found");
                }

                break;

            case 3:
                foundOrders = 0;

                ArrayList<Order> allOfEm = orderDAO.getAllOrders();
                if (allOfEm == null) {
                    console.print("No orders found!");
                } else {
                    for (Order i : allOfEm) {
                        foundOrders++;
                        console.print("Order#" + i.getOrderNumber() + " " + i.getDate());
                        console.print(i.getCustomerName() + " at: " + i.getState());
                        console.print(i.getArea() + "/sqft of " + i.getProductType()
                                + ": $" + i.getTotal());
                        console.print("");

                    }
                }

                if (foundOrders == 0) {
                    console.print("No orders found");
                }

                break;
        }
    }

//ADD ORDERS METHOD
    public void addOrder(int orderNumber) throws FileNotFoundException, IOException {
        Collection<Material> x = productDAO.listAll();
        Material userMaterialChoice = null;
        boolean keepLooping = true;
        boolean hasComma = false;
        String date;

        int year = console.readInt("Enter YYYY (Open since 1995, orders may be placed 10"
                + " years in advance.", 1995, 2026);
        int month = console.readInt("MM", 1, 12);
        int day = console.readInt("DD", 1, 31);
        if (month < 10 && day < 10) {
            date = ("0" + month + "/0" + day + "/" + year);
        } else if (month < 10) {
            date = ("0" + month + "/" + day + "/" + year);
        } else if (day < 10) {
            date = (month + "/0" + day + "/" + year);
        } else {
            date = (month + "/" + day + "/" + year);
        }

        do {
            int hits = 0;
            String userMaterial = console.readString("---PLEASE SELECT A FLOORING MATERIAL---");
            for (Material m : x) {
                if (m.getType().equalsIgnoreCase(userMaterial)) {
                    userMaterialChoice = m;
                    keepLooping = false;
                    hits++;
                } else if (m.getType().toLowerCase().contains(userMaterial.toLowerCase())
                        && (!m.getType().toLowerCase().equalsIgnoreCase(userMaterial))) {
                    console.print("Did you mean: " + m.getType() + "?");
                    hits++;
                }

            }

            if (hits == 0) {
                console.print("No results found");
            }
        } while (keepLooping);

        console.print("You have chosen: " + userMaterialChoice.getType());

        HashMap<String, Double> y = stateTaxDAO.listAll();
        String userStateChoice = null;
        boolean keepRunning = true;
        String userName = " ";

        do {
            console.print("---PLEASE ENTER A TRANSACTION LOCATION---");
            String userState = console.readString("Provide location in an abbreviation format (Kentucky=KY)");
            int hits = 0;
            for (String st : y.keySet()) {
                if (st.equalsIgnoreCase(userState)) {
                    userStateChoice = st;
                    hits++;
                    keepRunning = false;
                } else if (st.toLowerCase().contains(userState.toLowerCase())
                        && (!st.toLowerCase().equalsIgnoreCase(userState))) {
                    console.print("Did you mean: " + st + "?");
                    hits++;
                }
            }
            if (hits == 0) {
                console.print("No states found");
            }
        } while (keepRunning);

        console.print("You have chosen " + userMaterialChoice.getType() + " at " + userStateChoice);

        double area = console.readDouble("Area of project in square feet:", 0, 10000.9);
        do {
            userName = console.readString("---ENTER NAME FOR ORDER---");
            if (userName.contains(",")) {
                console.print("Comma ',' is unavailable for order name.");
                hasComma = true;
            } else if (!userName.contains(",")) {
                hasComma = false;
            }
        } while (hasComma);
        double materialCost = area * userMaterialChoice.getCostSqFt();
        double laborCost = area * userMaterialChoice.getLaborSqFt();
        double tax = (materialCost + laborCost) * (y.get(userStateChoice) * 0.01);
        double total = materialCost + laborCost + tax;
        console.print(" ");
        console.print("YOUR ORDER:");
        console.print("Order Number: " + orderNumber + ", " + userName);
        console.print(area + " sqft of: " + userMaterialChoice.getType());
        console.print("Cost of material: " + materialCost);
        console.print("Cost of labor: " + laborCost);
        console.print("tax: " + tax);
        console.print(" ");
        console.print("FINAL BILL: $" + total);
        console.print("");

        String yn = console.yesNo("Would you like to add this order? (y/n)");
        if (yn.equalsIgnoreCase("y")) {

            Order newOrder = new Order(0, "x", "x", "x", 0.0, "x", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

            newOrder.setOrderNumber(orderNumber);
            newOrder.setDate(date);
            newOrder.setCustomerName(userName);
            newOrder.setState(userStateChoice);
            newOrder.setTaxRate(y.get(userStateChoice));
            newOrder.setProductType(userMaterialChoice.getType());
            newOrder.setArea(area);
            newOrder.setCostSqFt(userMaterialChoice.getCostSqFt());
            newOrder.setLaborSqFt(userMaterialChoice.getLaborSqFt());
            newOrder.setMaterialCost(materialCost);
            newOrder.setLaborCost(laborCost);
            newOrder.setTax(tax);
            newOrder.setTotal(total);

            orderDAO.addOrder(newOrder);

        } else if (yn.equalsIgnoreCase("n")) {
            console.print("Order has been discarded");
        }

    }

    //EDIT
    public void editOrder() {
        boolean keepRunning = true;
        int toEdit = console.readInt("Order # of order to edit:");
        Order orderToEdit = orderDAO.getOrderByOrderNum(toEdit);
        String newDate = null;

        if (orderToEdit == null) {
            console.print("Order Not Found");
        } else {
            console.print(orderToEdit.getOrderNumber() + ": " + orderToEdit.getCustomerName()
                    + ", " + orderToEdit.getState());
            console.print(orderToEdit.getArea() + "/sqft of " + orderToEdit.getProductType());
            console.print("total: " + orderToEdit.getTotal());
            String userDelete = console.yesNo("Delete this order?");
            if (userDelete.equalsIgnoreCase("y")) {

                int updatedKey = 0;

                while (keepRunning) {
                    console.print("1. Name on order");
                    console.print("2. State of transaction");
                    console.print("3. State tax rate");
                    console.print("4. Product material");
                    console.print("5. Area");
                    console.print("6. Material cost per sqft");
                    console.print("7. Labor cost per sqft");
                    console.print("8. Total material cost");
                    console.print("9. Total labor cost");
                    console.print("10. Total tax");
                    console.print("11. Total cost");
                    console.print("12. Date");
                    int userEdit = console.readInt("What property to edit?", 1, 12);

                    switch (userEdit) {
                        case 1:
                            boolean hasComma;
                            String newName = null;
                            do {
                                newName = console.readString("---ENTER NAME FOR ORDER---");
                                if (newName.contains(",")) {
                                    console.print("Comma ',' is unavailable for order name.");
                                    hasComma = true;
                                } else {
                                    hasComma = false;
                                }
                            } while (hasComma);
                            orderToEdit.setCustomerName(newName);
                            break;
                        case 2:
                            String newState = null;
                            do {
                                newState = console.readString("New state of transaction: ");
                                if (newState.contains(",")) {
                                    console.print("Comma ',' is unavailable for order name.");
                                    hasComma = true;
                                } else {
                                    hasComma = false;
                                }
                            } while (hasComma);
                            orderToEdit.setState(newState);
                            break;
                        case 3:
                            double newTaxRate = console.readDouble("New tax rate: ", 0, 100.00);
                            orderToEdit.setTaxRate(newTaxRate);
                            break;
                        case 4:
                            String newMaterial = null;
                            do {
                                newMaterial = console.readString("Updated material: ");
                                if (newMaterial.contains(",")) {
                                    console.print("Comma ',' is unavailable for order name.");
                                    hasComma = true;
                                } else {
                                    hasComma = false;
                                }
                            } while (hasComma);
                            orderToEdit.setProductType(newMaterial);
                            break;
                        case 5:
                            double newArea = console.readDouble("New area/sqft (10,000 maximum):", 0, 10000);
                            orderToEdit.setArea(newArea);
                            break;
                        case 6:
                            double newMaterialSqFt = console.readDouble("New material cost"
                                    + "(/sqft):", 0, 10000);
                            orderToEdit.setCostSqFt(newMaterialSqFt);
                            break;
                        case 7:
                            double newLaborSqFt = console.readDouble("New labor cost"
                                    + "(/sqft):", 0, 10000);
                            orderToEdit.setLaborSqFt(newLaborSqFt);
                            break;
                        case 8:
                            double newTotalMaterial = console.readDouble("New total material cost:", 0, 999999999);
                            orderToEdit.setMaterialCost(newTotalMaterial);
                            break;
                        case 9:
                            double newTotalLabor = console.readDouble("New total labor cost:", 0, 999999999);
                            orderToEdit.setLaborCost(newTotalLabor);
                            break;
                        case 10:
                            double newTax = console.readDouble("New total tax:", 0, 999999999);
                            orderToEdit.setTax(newTax);
                            break;
                        case 11:
                            double newTotal = console.readDouble("New total :", 0, 999999999);
                            orderToEdit.setTotal(newTotal);
                            break;
                        case 12:
                            int year = console.readInt("Enter YYYY (Year may be set further in edit mode)"
                                    + " years in advance.", 1000, 9999);
                            int month = console.readInt("MM", 1, 12);
                            int day = console.readInt("DD", 1, 31);
                            String newKey = (month + "/" + day + "/" + year);
                            updatedKey++;
                            orderToEdit = new Order(
                                    orderToEdit.getOrderNumber(),
                                    newKey,
                                    orderToEdit.getCustomerName(),
                                    orderToEdit.getState(),
                                    orderToEdit.getTaxRate(),
                                    orderToEdit.getProductType(),
                                    orderToEdit.getArea(),
                                    orderToEdit.getCostSqFt(),
                                    orderToEdit.getLaborSqFt(),
                                    orderToEdit.getMaterialCost(),
                                    orderToEdit.getLaborCost(),
                                    orderToEdit.getTax(),
                                    orderToEdit.getTotal());
                            orderDAO.addOrder(orderToEdit);
                            break;
                    }
                    String userEditChoice = console.yesNo("Keep editing this order?");
                    if (userEditChoice.equalsIgnoreCase("n")) {
                        keepRunning = false;
                        break;
                    }

                }
                orderDAO.deleteOrder(orderToEdit);
                if (updatedKey == 0 && keepRunning) {
                    orderToEdit = new Order(
                            orderToEdit.getOrderNumber(),
                            newDate,
                            orderToEdit.getCustomerName(),
                            orderToEdit.getState(),
                            orderToEdit.getTaxRate(),
                            orderToEdit.getProductType(),
                            orderToEdit.getArea(),
                            orderToEdit.getCostSqFt(),
                            orderToEdit.getLaborSqFt(),
                            orderToEdit.getMaterialCost(),
                            orderToEdit.getLaborCost(),
                            orderToEdit.getTax(),
                            orderToEdit.getTotal());

                    orderDAO.addOrder(orderToEdit);
                }
            }
        }
    }

    //    REMOVE ORDER METHOD
    public void removeOrder() {
        Order orderToDelete = null;
        String dateToDelete = console.readString("Date of order to delete: ");
        int toDelete = console.readInt("Order # of order to be deleted:");

        Order i = orderDAO.getOrder(dateToDelete, toDelete);

        console.print(i.getOrderNumber() + ": " + i.getCustomerName()
                + ", " + i.getState());
        console.print(i.getArea() + "/sqft of " + i.getProductType());
        console.print("total: " + i.getTotal());
        String userDelete = console.yesNo("Delete this order?");
        if (userDelete.equalsIgnoreCase("y")) {
            orderToDelete = i;
        }

        if (orderToDelete != null) {
            orderDAO.deleteOrder(orderToDelete);
        }
    }
}
