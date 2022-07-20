package org.example;

import org.example.Allowances;

import java.util.ArrayList;
import java.util.List;

public abstract class EmployeeLevels {

    protected List<Allowances> allowances = new ArrayList<>();
    public EmployeeLevels() {
        createLevel();
    }

    protected abstract void createLevel();


    @Override
    public String toString() {
        return "EmployeeLevels{" +
                "allowances=" + allowances +
                '}';
    }
}

