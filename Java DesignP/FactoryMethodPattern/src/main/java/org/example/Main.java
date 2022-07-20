package org.example;

public class Main {
    public static void main(String[] args) {

        EmployeeLevels employeeLevels = FactoryClass_EMPLevel.createLevel(EmployeeLevelsCode.EMPLevel_1);
        System.out.println(employeeLevels);

        EmployeeLevels employeeLevels1 = FactoryClass_EMPLevel.createLevel(EmployeeLevelsCode.EMPLevel_2);
        System.out.println(employeeLevels1);

        EmployeeLevels employeeLevels2 = FactoryClass_EMPLevel.createLevel(EmployeeLevelsCode.EMPLevel_3);
        System.out.println(employeeLevels2);
    }
}