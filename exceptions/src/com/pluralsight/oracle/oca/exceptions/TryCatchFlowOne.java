package com.pluralsight.oracle.oca.exceptions;

public class TryCatchFlowOne {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        try {
            sb.append("a");
        } catch (Exception e) {
            sb.append("b");
        } finally {
            sb.append("c");
        }
        sb.append("d");

    }
}
