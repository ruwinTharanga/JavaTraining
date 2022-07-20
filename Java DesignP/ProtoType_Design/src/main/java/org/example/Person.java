package org.example;

public abstract class Person implements Cloneable{
    private String name;


    public String getName() {
        return name;
    }
    //Get Setters
    public void setName(String name) {
        this.name = name;
    }

    //Create Clone Method.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
