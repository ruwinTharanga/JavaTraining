package org.example;

public class Package_1 extends Handler{

    public double getDiscountPackage(OrderD oderD){

        if(oderD.getItemPrice() <= 5000){
            //Method call
            oderD.setdiscountValue( oderD.getItemPrice() - (oderD.getItemPrice() *40)/100);
            System.out.println("Package Discount: 40%");
            System.out.println("Total price: "+oderD.getItemPrice()+" USD");
            return oderD.getDiscountValue();
        }

        else {
            return successor.getDiscountPackage(oderD);
        }
    }

}
