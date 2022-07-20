package org.example;

import SingletonP.SingletonD;

public class Main {
    public static void main(String[] args) {

        // Instantiating Singleton class with variable x
        SingletonD  X  = SingletonD.getSingletonD();

        // Instantiating Singleton class with variable x
        SingletonD  Y  = SingletonD.getSingletonD();

        // Print and display commands
        System.out.println("Mouse" + X.s);
        System.out.println("Keyboard" + Y.s);
        System.out.println("\n");

        SingletonD single_instance = SingletonD.getSingletonD();
        System.out.println(single_instance);

        SingletonD single_instance1 = SingletonD.getSingletonD();
        System.out.println(single_instance1);
    }
}