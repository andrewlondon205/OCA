package c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * RECOGNIZING COMMON EXCEPTION TYPES
 *
 * - You need to recognize three types of exceptions for the OCA exam: runtime exceptions, checked exceptions, and errors
 * - We’ll look at common examples of each type. For the exam, you’ll need to recognize which type of an exception it is
 *   and whether it’s thrown by the JVM or a programmer.
 *
 */
public class CommonExceptions {
    public static void main(String[] args) {

    }
}

/**
 * RUNTIME EXCEPTIONS
 *
 * - Runtime exceptions extend RuntimeException. They don’t have to be handled or declared. They can be thrown by the
 *   programmer or by the JVM. Common runtime exceptions include the following:
 *
 * 1. ArithmeticException = Thrown by the JVM when code attempts to divide by zero
 * 2. ArrayIndexOutOfBoundsException = Thrown by the JVM when code uses an illegal index to access an array
 * 3. ClassCastException = Thrown by the JVM when an attempt is made to cast an exception to a subclass of
 *     which it is not an instance.
 * 4. IllegalArgumentException Thrown by the programmer to indicate that a method has been passed an illegal or
 *    inappropriate argument
 * 5. NullPointerException Thrown by the JVM when there is a null reference where an object is required
 * 6. NumberFormatException Thrown by the programmer when an attempt is made to convert a string to a numeric type
 *    but the string doesn’t have an appropriate format.
 *
 */

/**
 * ARITHMETIC EXCEPTION
 *
 * - Trying to divide an int by zero gives an undefined result. When this occurs, the JVM will throw an ArithmeticException:
 *
 * - Running this code results in the following output:
 *   Exception in thread "main" java.lang.ArithmeticException: / by zero
 *
 * - Java doesn’t spell out the word “divide.” That’s okay, though, because we know that / is the division operator and that
 *   Java is trying to tell us division by zero occurred.
 *
 * - The thread "main" is telling us the code was called directly or indirectly from a program with a main method.
 */

class Arithmetic {
    public static void main(String[] args) {
        int answer = 11 / 0;
    }
}

/**
 * ARRAYINDEXOUTOFBOUNDS EXCEPTION
 *
 * - You know by now that array indexes start with 0 and go up to 1 less than the length of the array—which means this
 *   code will throw an ArrayIndexOutOfBoundsException:
 */

class ArrayIndexOutOfBounds {

    public static void countsOfMoose1 () {
        int [] countsOfMoose = new int[3];
        System.out.println(countsOfMoose);
    }

    public static void countsOfMoose2 () {
        int total = 0;
        int [] countsOfMoose = new int [3];
        for (int i=0; i<=countsOfMoose.length; i++)
            total += countsOfMoose[i];
    }
     public static void main(String[] args) {
        countsOfMoose1();// throws exception
        countsOfMoose2();// throws exception
    }

    /**
     * - The problem is that the for loop should have < instead of <=On the final iteration of the loop, Java tries to
     *   call countsOfMoose[3], which is invalid.
     *
     * - The array includes only three elements, making 2 the largest possible index. The output looks like this:
     *   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
     *
     */
}

/**
 * CLASSCAST EXCEPTION
 *
 * - Java tries to protect you from impossible casts. This code doesn’t compile because Integer is not a subclass of String:
 */

class A {}
class B extends A {}

class C extends B{}

class D extends C {}

class BadCasting {
    public static void main(String[] args) {
        String type = "moose";
        // Integer number = (Integer) type; does not compile because Integer and String do not have any hierarchical relationship
       //  Object obj = type;
       // Integer number = (Integer) obj;

        /**
         * The compiler sees a cast from Object to Integer. This could be okay. The compiler doesn’t realize there’s a
         * String in that Object. When the code runs, it yields the following output:
         */

        B b = new B();
        A a = new A();
        b = (B) a;

        System.out.println(a instanceof B);
        System.out.println(b instanceof A);

    }
}

/**
 * ILLEGAL-ARGUMENT EXCEPTION
 *
 * IllegalArgumentException is a way for your program to protect itself. We first saw the following setter method in the
 * Swan class in Chapter 4, “Methods and Encapsulation.”
 *
 *
 */

class Hen {
    private String name;
    private int numberEggs;

    public void setNumberEggs(int numberEggs) {// setter if (numberEggs >= 0) // guard condition
       this.numberEggs = numberEggs; }

    /**
     * - This code works, but we don’t really want to ignore the caller’s request when they tell us a Swan has –2 eggs.
     * - We want to tell the caller that something is wrong—preferably in a very obvious way that the caller can’t ignore
     *   so that the programmer will fix the problem.
     *
     * - Exceptions are an efficient way to do this. Seeing the code end with an exception is a great reminder that something
     *   is wrong:
     *
     */

    public void setNumberEggsBetha (int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative!");
        this.numberEggs = numberEggs;
    }

    public static void main(String[] args) {
        Hen h = new Hen();
        h.setNumberEggsBetha(-15); // throws exception
    }

    //NOTE: this keyword cannot be present within a static context. It leads to compiler error
}

/**
 * NULLPOINTER EXCEPTION
 *
 * - Instance variables and methods must be called on a non-null reference. If the reference is null, the JVM will throw
 *   a NullPointerException.
 *
 * - It’s usually subtle, such as this example, which checks whether you remember instance variable references default
 *   to null.
 */

class NullPointer {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("undertaker","randy orton","kane","batista",null));
        names.forEach(n -> System.out.println(n.length()));

        String a = null;
        a.trim();
    }
}

/**
 * NUMBERFORMAT EXCEPTION
 *
 * - Java provides methods to convert strings to numbers. When these are passed an invalid value, they throw a
 *   NumberFormatException.
 * - The idea is similar to IllegalArgumentException. Since this is a common problem, Java gives it a separate class.
 * - In fact, NumberFormatException is a subclass of IllegalArgumentException. Here’s an example of trying to convert
 *   something non-numeric into an int:
 */

class WrongFormatting {
    public static void main(String[] args) {
        Integer number = Integer.parseInt("awkmdawlmdk214");
    }

    //yields the following output: Exception in thread "main" java.lang.NumberFormatException: For input string: awkmdawlmdk214
}

