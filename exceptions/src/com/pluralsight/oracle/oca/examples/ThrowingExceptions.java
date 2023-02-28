package com.pluralsight.oracle.oca.examples;

import java.io.IOException;

public class ThrowingExceptions {

    public static void main(String[] args) throws IOException {

        Person p = new Person();
        p.setAge(20);

        System.out.println(p.getAge());

        p.setAge1(25);
        p.setAge2(10);

        increaseAge(p,10);

    }

    static void increaseAge (Person p, int age) throws IOException {
        p.setAge2(age);
    }
}
