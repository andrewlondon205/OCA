package c1;

public class References {

    public static void main(String[] args) {

        java.util.Date today;
        String greeting;

        today = new java.util.Date();
        greeting = "How are you?";

        String name = null;
        // int value = null; DOES NOT COMPILE

        String reference = "Content";
        int len = reference.length();
        //int bad = len.length();  DOES NOT COMPILE

        //Variable declaration
        String zooName;
        int numberAnimals;

        //Variable initialization
        zooName = "The best zoo";
        numberAnimals = 100;

        // Variable declaration and initialization
        String creature = "Wolfman";
        int height = 210;

        //Multiple variables declaration
        String s1, s2;
        String s3 = "yes", s4 = "no";
        int i1, i2, i3 = 0;

        //invalid initialization
        // int number, String value; DOES NOT COMPILE

        // examples
        boolean b1, b2;
        String c1 = "1", c2;
        // double d1, double d2; DOES NOT COMPILE
        int f1; int f2;
        int k3; // k4 DOES NOT COMPILE;

        int a1;
        int a2;
        int a3;
        // a4; DOES NOT COMPILE



    }
}
