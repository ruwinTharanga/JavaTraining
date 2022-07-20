package org.example;

public class Package_03 extends Handler {

    public double getDiscountPackage(OrderD oderD){

        if(oderD.getItemPrice() >3000){
            //Method call
            oderD.setdiscountValue( oderD.getItemPrice() - (oderD.getItemPrice() *20)/100);
            System.out.println("Package Discount: 20%");
            System.out.println("Total price: "+oderD.getItemPrice()+" USD");
            return oderD.getDiscountValue();
        }

        else {
            return successor.getDiscountPackage(oderD);
        }
    }

}
