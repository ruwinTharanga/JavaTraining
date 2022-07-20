package org.example;

public class DPackage extends Handler {
    @Override
    public double getDiscountPackage(OrderD oderD) {
        return successor.getDiscountPackage(oderD);
    }
}
