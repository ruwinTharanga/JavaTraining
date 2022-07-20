package org.example;

import org.example.EmployeeLevels;
import org.example.InternetAllowance;
import org.example.TransportAllowance;

public class EMPLevel_2 extends EmployeeLevels {
    @Override
    protected void createLevel() {
        allowances.add(new InternetAllowance());
        allowances.add(new TransportAllowance());
    }

}
