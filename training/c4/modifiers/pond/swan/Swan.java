package c4.modifiers.pond.swan;

import c4.modifiers.pond.shore.Bird; // in different package than bird

public class Swan extends Bird { // but subclass of bird
    public void swim () {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim () {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text); // package access to superclass
    }

    public void helpOtherBirdSwim () {
        Bird other = new Bird();
        //other.floatInWater(); does not compile
        //System.out.println(other.text); does not compile

        /**
         * the protected rules apply under two scenarios:
         *
         * A member is used without referring to a variable. This is the case on lines 5 and 6. In this case, we are
         * taking advantage of inheritance and protected access is allowed.
         *
         * - A member is used through a variable. This is the case on lines 10, 11, 15, and 16.
         *   In this case, the rules for the reference type of the variable are what matter. If it is a
         *   subclass, protected access is allowed. This works for references to the same class or a subclass.
         *
         */
    }
}
