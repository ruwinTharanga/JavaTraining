package org.example;

public class Teacher extends Person {
    private int TID;

    //Get getters
    public int getTID() {
        return TID;
    }

    //Get Setters
    public void setTID(int TID) {
        this.TID = TID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TID=" + TID +
                '}';
    }
}
