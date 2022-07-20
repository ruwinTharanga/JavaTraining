package org.example;

public class Main {
    public static void main(String[] args) {

        Package_1 package_1 = new Package_1();
        Package_02 package_02 = new Package_02();
        Package_03 package_03 = new Package_03();

        DPackage dPackage = new DPackage();

        dPackage.setSuccessor(package_1);
        package_02.setSuccessor(package_02);
        package_03.setSuccessor(package_03);

        //Order Details
        OrderD oderD =  new OrderD(01, 3000);
        System.out.println("Package Discount: "+ dPackage.getDiscountPackage(oderD) +" USD");
        System.out.println();

        OrderD oderD1 =  new OrderD(01, 4000);
        System.out.println("Package Discount: " + dPackage.getDiscountPackage(oderD1) + " USD");

        OrderD oderD2 =  new OrderD(01, 5000);
        System.out.println("Package Discount: " + dPackage.getDiscountPackage(oderD2) + " USD");

    }
}