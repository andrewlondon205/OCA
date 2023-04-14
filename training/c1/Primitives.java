package c1;

public class Primitives {

    public static void main(String[] args) {

        //Booleans
        boolean a = true;
        boolean b = false;

        //Integer numbers
        byte n1 = 10; // 8 bit
        byte n2 = -20;
        short n3 = 215; // 16 bit
        int n4 = 5124; // 32 bit
        long n5 = 215992; // 64 bit

        /**
         * long max = 3123456789; does not compile because "3123456789" is larger than the maximum value allowed for a int.
         */

        //Floating Point numbers
        float f1 = 10.5f; // requires f at the end 32 bit
        double f2 = 215.02; // 64 bit

        System.out.println("Byte minimum value: " + Byte.MIN_VALUE);
        System.out.println("Byte maximum value: " + Byte.MAX_VALUE);

        System.out.println("Short minimum value: " + Short.MIN_VALUE);
        System.out.println("Short maximum value: " + Short.MAX_VALUE);

        System.out.println("Int minimum value: " + Integer.MIN_VALUE);
        System.out.println("Int maximum value: " + Integer.MAX_VALUE);

        System.out.println("Long minimum value: " + Long.MIN_VALUE);
        System.out.println("Long maximum value: " + Long.MAX_VALUE);

        System.out.println("Float minimum value: " + Float.MIN_VALUE);
        System.out.println("Float maximum value: " + Float.MAX_VALUE);

        System.out.println("Double minimum value: " + Double.MIN_VALUE);
        System.out.println("Double maximum value: " + Double.MAX_VALUE);

        // From Java 7, Its possible to add underscores in numbers to make them easier to read.

        int million1 = 1000000;
        int million2 = 1_000_000;

        //It is possible to add underscores anywhere except at the beginning of a literal, the end of a literal, right before or after a decimal point
        //double noAtStart = _1000.00; DOES NOT COMPILE
        //double notAtEnd = 1000.00_; DOES NOT COMPILE
        //double notByDecimal = 1000_.00; DOES NOT COMPILE
        // double annoyingButLegal = 1_00_0.0_0; THIS ONE COMPILES

    }
}
