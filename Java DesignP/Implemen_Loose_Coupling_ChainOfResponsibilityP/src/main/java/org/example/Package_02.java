package org.example;

public class Package_02 extends Handler {

    public double getDiscountPackage(OrderD oderD){

        if(oderD.getItemPrice() >4000){
            //Method call
            oderD.setdiscountValue( oderD.getItemPrice() - (oderD.getItemPrice() *30)/100);
            System.out.println("Package Discount: 30%");
            System.out.println("Total price: "+oderD.getItemPrice()+" USD");
            return oderD.getDiscountValue();
        }

        else {
            return successor.getDiscountPackage(oderD);
        }
    }

}
