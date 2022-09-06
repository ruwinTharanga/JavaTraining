package org.example;

import java.util.Objects;

public class employeeC {

    private int id;
    private int code;
    private String name;
    private int nic;
    private String address;

    public employeeC(int id, int code, String name, int nic, String address) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        //
        employeeC employee = (employeeC) obj;
        //if(this == obj){
        if (employee.getId() == this.id && employee.getCode() == this.code) {
            return true;
        } else if (!(obj instanceof employeeC)) {
            return false;
        }
        //return getId() == getId() && getCode() == getCode();
        // getCode().equals(getCode());
        return false;
    }

    @Override
    public String toString() {
        return "employeeC{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", nic=" + nic +
                ", address='" + address + '\'' +
                '}';
    }
}