package com.pluralsight.oracle.oca.examples;

import java.io.IOException;

public class Person {

    int age;

    void setAge(int age) {
        this.age = age;
    }

    void setAge1(int age) throws IllegalArgumentException {
        if (age <=0) {
            throw new IllegalArgumentException("...");
        }
        this.age = age;
    }

    void setAge2 (int age) throws IOException {
        this.age = age ;
    }

    int getAge () {return age;}
}
