package org.example;

public class Main {
    public static void main(String[] args) {

        Allowance.Bulder bulder = new Allowance.Bulder("Monthly");
        Allowance allowance = bulder.CarAllowance("Monthly").TravelAllowance("Weekly").build();
        System.out.println(allowance);
    }
}