package org.example;

public class Main {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Student student = (Student) registry.getPerson(Person_gender.MALE);
        System.out.println(student);

        student.setSID(002);
        System.out.println(student);

        Student student1 = (Student) registry.getPerson(Person_gender.MALE);
        System.out.println(student1);

    }
}