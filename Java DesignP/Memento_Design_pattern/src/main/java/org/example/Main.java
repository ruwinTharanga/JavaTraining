package org.example;

public class Main {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Park park= new Park();

        park.addVehicle(new Vehicle("Car"));
        careTaker.save(park);
        park.addVehicle(new Vehicle("Van"));
        careTaker.save(park);
        park.addVehicle(new Vehicle("Lorry"));
        careTaker.save(park);

        careTaker.revent(park);
        System.out.println(park);


        careTaker.revent(park);
        System.out.println(park);

        careTaker.revent(park);
        System.out.println(park);


    }
}