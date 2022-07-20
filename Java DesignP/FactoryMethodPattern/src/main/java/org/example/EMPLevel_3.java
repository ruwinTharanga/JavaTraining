package org.example;

import org.example.EmployeeLevels;
import org.example.InternetAllowance;

public class EMPLevel_3 extends EmployeeLevels {
    @Override
    protected void createLevel() {
        allowances.add(new InternetAllowance());
    }
}
