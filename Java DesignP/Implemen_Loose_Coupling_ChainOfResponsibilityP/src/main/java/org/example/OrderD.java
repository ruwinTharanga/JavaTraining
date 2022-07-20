package org.example;

public class OrderD {
    private int orderID;
    private double discountValue;
    private double ItemPrice;
    //get setters
    protected void setdiscountValue(double discountValue){
        this.discountValue = discountValue;
    }
    public OrderD(int orderID, double ItemPrice){
        this.orderID = orderID;
        this.ItemPrice = ItemPrice;
    }
    public int getOrderID() {
        return orderID;
    }
    public double getDiscountValue() {
        return discountValue;
    }

    public double getItemPrice() {
        return ItemPrice;
    }
}
