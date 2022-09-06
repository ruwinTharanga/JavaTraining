package org.example;

public class Main {

    public static void main(String[] args) {

        employeeC employee1 = new employeeC(11,12,"Kalpa",123,"yakkala");
        employeeC employee2 = new employeeC(11,12,"Kalpa",123,"yakkala");
        employeeC employee3 = new employeeC(22,13,"Nuwan",112233,"Colombo");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));
    }
}