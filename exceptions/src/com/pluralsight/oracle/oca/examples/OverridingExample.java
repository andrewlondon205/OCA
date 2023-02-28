package com.pluralsight.oracle.oca.examples;

import java.io.IOException;

public class OverridingExample {

    public static void main(String[] args) {

        TeamMember tm = new Developer();

        try {
            tm.work();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
