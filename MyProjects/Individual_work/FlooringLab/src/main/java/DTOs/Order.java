/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author apprentice
 */
public class Order {

    private int orderNumber;
    private String date;
    private String customerName;
    private String state;
    private double taxRate;
    private String productType;
    private double area;
    private double costSqFt;
    private double laborSqFt;
    private double materialCost;
    private double laborCost;
    private double tax;
    private double total;

    public Order(int orderNumber, String date, String customerName, String state, double taxRate,
            String productType, double area, double costSqFt, double laborSqFt,
            double materialCost, double laborCost, double tax, double total) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.customerName = customerName;
        this.state = state;
        this.taxRate = taxRate;
        this.productType = productType;
        this.area = area;
        this.costSqFt = costSqFt;
        this.laborSqFt = laborSqFt;
        this.materialCost = materialCost;
        this.laborCost = laborCost;
        this.tax = tax;
        this.total = total;

    }

    public String getDate() {
        return date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getState() {
        return state;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String getProductType() {
        return productType;
    }

    public double getArea() {
        return area;
    }

    public double getCostSqFt() {
        return costSqFt;
    }

    public double getLaborSqFt() {
        return laborSqFt;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCostSqFt(double costSqFt) {
        this.costSqFt = costSqFt;
    }

    public void setLaborSqFt(double laborSqFt) {
        this.laborSqFt = laborSqFt;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
