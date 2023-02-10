package com.pluralsight.oracle.oca.shop;

import java.util.List;

public class Variables {

    public static void main(String[] args) {

        int age = 30;
        String name = "Maaike";
        double decimal = 7.8;

        int customerAge = 8;
        boolean lovesCoding = true;

        Address address = new Address("main street","123a");
        Customer customer = new Customer(name, List.of("coding","cooking"),address);



        System.out.println("before: "+ age);
        changeInt(age);
        System.out.println("after: " + age);

        System.out.println("before: "+ customer.getX());
        changeCustomerInt(customer);
        System.out.println("after: " + age);


        System.out.println("before: "+ customer.getName());
        changeCustomer(customer);
        System.out.println("after: " + customer.getName());

    }

    private static void changeCustomerInt(Customer c) {
        c.setName("Els");
    }

    private static void changeCustomer2(Customer c) {
        c.setX(5);
    }



    public static void changeInt (int x) {
        x = 5;
    }

    public static void changeCustomer (Customer c) {
        c.setName("Els");
    }




}
