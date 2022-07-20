package org.example;
import org.example.EmployeeLevels;

import static org.example.EmployeeLevelsCode.EMPLevel_1;
import static org.example.EmployeeLevelsCode.EMPLevel_2;
import static org.example.EmployeeLevelsCode.EMPLevel_3;

public class FactoryClass_EMPLevel { public static EmployeeLevels createLevel(EmployeeLevelsCode levelCode) {

        switch (levelCode){
            case EMPLevel_1:
                return new EMPLevel_1();
            case EMPLevel_2:
                return new EMPLevel_2();
            case EMPLevel_3:
                return new EMPLevel_3();
            default:
                return null;
        }
    }

}
