package com.pluralsight.oracle.oca;

import com.pluralsight.oracle.oca.shop.Customer;
import com.pluralsight.oracle.oca.shop.VIPCustomer;

import java.util.List;


public class FirstJavaApp {

    public static void main(String[] args) {

        // System.out.println("Hello OCA8! " + args[0]);


        Customer customer = new VIPCustomer();
        customer.setName("Maaike");
        customer.setInterests(List.of("coding","riding"));

        System.out.println(customer.getName() + " loves " + customer.getInterests().get(0));

    }
}
