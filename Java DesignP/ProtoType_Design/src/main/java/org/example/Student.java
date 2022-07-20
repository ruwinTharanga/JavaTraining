package org.example;

public class Student extends Person {
    private int SID;

    //Get getters
    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SID=" + SID +
                '}';
    }
}
