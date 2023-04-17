package c2;

public class Operations {

    public static void main(String[] args) {

        /**
         * Order of operator precedence
         * - Post-unary:          exp++, exp--
         * - Pre-unary:           ++exp, --exp
         * - other:               -, !
         * - mdm:                 *, /, %
         * - add/sub:             +, -
         * - relational:          <, >, <=, =>, instanceOf
         * - equal to/not:        ==, !=
         * - logical:             &, ^, |
         * - short-circuit-log:   &&, ||
         * - ternary-op:          boolean expression ? expression1 : expression2
         * - assignment:          =, +=, -=,
         */

        //First op
        int x = 2 * 5 + 3 * 4 - 8;
        System.out.println("int x = 2 * 5 + 3 * 4 - 8 = " + x);

        int y = 2 * ((5 + 3) * 4 - 8);
        System.out.println("int y = 2 * ((5 + 3) * 4 - 8) = " + y);

        System.out.println(9 / 3); // Outputs 3
        System.out.println(9 % 3); // Outputs 0
        System.out.println(10 / 3); // Outputs 3
        System.out.println(10 % 3); // Outputs 1
        System.out.println(11 / 3); // Outputs 3
        System.out.println(11 % 3); // Outputs 2
        System.out.println(12 / 3); // Outputs 4
        System.out.println(12 % 3); // Outputs 0
        System.out.println(12.4 % 5); //Outputs 2.4
        System.out.println(10 % 2.3);



    }



}