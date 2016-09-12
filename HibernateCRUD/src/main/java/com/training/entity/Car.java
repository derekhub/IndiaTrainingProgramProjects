package com.training.entity;

import com.training.domains.Address;

public class Car {

    private String registerNumber;
    private String ownerName;

    private Address officeAddress;
    private Address resiAddress;

    public Car() {
        super();
    }

    public Car(String registerNumber, String ownerName) {
        super();
        this.registerNumber = registerNumber;
        this.ownerName = ownerName;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Address getResiAddress() {
        return resiAddress;
    }

    public void setResiAddress(Address resiAddress) {
        this.resiAddress = resiAddress;
    }

    @Override
    public String toString() {
        return "Car [registerNumber=" + registerNumber + ", ownerName=" + ownerName + ", officeAddress=" + officeAddress
                + ", resiAddress=" + resiAddress + "]";
    }

}
