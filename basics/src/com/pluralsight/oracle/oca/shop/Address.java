package com.pluralsight.oracle.oca.shop;

public class Address {

    private String address;
    private String number;

    public Address(String address, String number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
