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

        /**
         *  NAMING IDENTIFIERS RULES:
         *  The name must begin with a letter or the symbol $ or _.,
         *  Subsequent characters may also be numbers.
         *  reserved words are not allowed to be used.
         */

        //legal
        String okidentifier;
        String $OK2Identifier;
        String _alsoOK1d3ntifi3r;
        String __SStillOkbutKnotsonice$;

        //illegal

        // String 3DPointClass (identifiers cannot begin with a number hollywood@vine)
        // String (@ is not a letter, digit, $ or _)
        // String (*$coffee * is not a letter, digit, $ or _)
       // public  public is a reserved word

    }
}

enum Keywords {

    ABSTRACT, ASSERT, BOOLEAN, BREAK, BYTE, CASE, CATCH, CHAR, CLASS, CONST, CONTINUE, DEFAULT, DO, DOUBLE, ELSE, ENUM,
    EXTENDS, FALSE, FINAL, FINALLY, FLOAT, FOR, GOTO, IF, IMPLEMENTS, IMPORT, INSTANCEOF, INT, INTERFACE, LONG, NATIVE,
    NEW, NULL, PACKAGE, PRIVATE, PROTECTED, PUBLIC, RETURN, SHORT, STATIC, STRICTFP, SUPER, SWITCH, SYNCRONIZED, THIS,
    THROW, THROWS, TRANSIENT, TRUE, TRY, VOID, VOLATILE, WHILE
}
