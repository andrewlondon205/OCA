package c2;

import java.io.File;
import java.util.Locale;

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

class LogRelOperators {

    public static void main(String[] args) {

        // Relational Operators
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false

        // Logical Operators

        /**
         * AND
         *
         * true & true = true
         * true & false = false
         * false & true = false
         * false & false = false
         *
         * INCLUSIVE OR
         *
         * true & true  = true
         * true & false = true
         * false & true = true
         * false & false = false
         *
         * EXCLUSIVE OR
         *
         * true ^ true = false
         * true ^ false = true
         * false ^ true = true
         * false ^ false = false
         */

        int alpha = 20;
        int betha = 20;
        String variable = null;

        boolean var = true || (10 < 4);

        /** SHORT-CIRCUIT OR
         * If left-hand side of the expression is false, the right-hand side is executed.
         * If left-hand side of the expression is true, the right-hand side is NEVER executed
         */
        if (false || ++alpha < 22)
            System.out.println("SHORT-CUIT OR: It's less then 21");
        System.out.println(alpha);

        /** SHORT-CIRCUIT AND
         * If left-hand side of the expression is false, the right-hand side is NEVER executed.
         * If left-hand side of the expression is true, the right-hand side is executed
         */
        if (true && ++betha < 22)
             System.out.println("SHORT-CUIT AND: It's less than 21");
         System.out.println(betha);

         if (variable != null && variable.toLowerCase().length() < 5) {
             System.out.println("Hello world");
         }

         if (variable != null & variable.toUpperCase().length() < 5) {
             System.out.println("Do another thing");
         }

         int value = 6;
         boolean result = (value >= 6) || (++value <= 7);
         System.out.println(result);
         System.out.println(value);
    }
}

class EqualityOperators {
    public static void main(String[] args) {

        // If numeric values are of different data types, the values are automatically promoted
        System.out.println(5 == 5.0);

        // boolean x = true == 3; does not compile
        // boolean y = false != "Giraffe" does not compile
        // boolean z = 3 == "Kangaroo" does not compile

        boolean y = false;
        boolean x = y = true;
        System.out.println(x);

        File f1 = new File("myFile.txt");
        File f2 = new File("myFile.txt");
        File f3 = f1;

        System.out.println(f1 == f2);
        System.out.println(f1 == f3);

    }
}

class ConditionalStatements {
    public static void main(String[] args) {

        int hourOfDay = 9;
        int morningGreetingCount = 0;
        if (hourOfDay < 11)
            System.out.println("Good Morning");

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        // Not best practice, but valid.
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }

        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }


        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        // Watch out for questions about if statements that don't have a boolean expression

        int var1 = 21;
        /*  if (var1) {
            System.out.println("I am a variable"); does not compile because var1 is not a boolean value or expression
        }*/

        int var2 = 2154;
        /*  if (var2 = 52) {
            System.out.println("Do something"); does not compile because var2 is not a boolean value or expression
        }*/
    }
}

class TernaryOperator {

    String a ;
    public static void main(String[] args) {

        /**
         * Ternary Operator Structure:
         * - booleanExpression ? expression1 : expression2
         *
         * - first operand must be a boolean expression, and the 2nd and 3rd can be any expression that returns a value
         */

        int y = 9;
        int x = y > 5 ? y % 2 == 0 ? y * y : 2 * y : 3 * y ;

        //equates to
/*
        if (y > 5) {
            if (y % 2 == 0) {
                y *= y;
            }
            else {
                y *= 2;
            }
        } else {
            y *= 3;
        }
*/

        int z = (y % 2 == 1) ? (y > 5 )? (++y) : (y--) : (y * y * y) ;

        System.out.println(x);
        System.out.println(z);

        //Trick: If number of colons and question marks are different, code does not compile

        // int k = z > 2 ?  z++ ? z * z: z-- ; does not compile number of colons and question marks are not same
        // int h = y > 10 ? "alpha" : "betha"; does not compile because we cannot assign a String to an integral number variable.

    }


}
