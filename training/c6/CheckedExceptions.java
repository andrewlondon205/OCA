package c6;

/**
 * CHECKED EXCEPTIONS
 *
 * - Checked exceptions have Exception in their hierarchy but not RuntimeException. They must be handled or declared.
 * - They can be thrown by the programmer or by the JVM. Common checked exceptions include the following:
 *
 * - FileNotFoundException Thrown programmatically when code tries to reference a file that does not exist.
 * - IOException Thrown programmatically when there’s a problem reading or writing a file.
 *
 * - For the OCA exam, you only need to know that these are checked exceptions. Also keep in mind that FileNotFoundException
 *   is a subclass of IOException, although the exam will remind you of that fact if it comes up. You’ll see these two exceptions in more detail on the OCP exam.
 *
 */

public class CheckedExceptions {
    public static void main(String[] args) {

    }
}


/**
 * ERRORS
 *
 * - Errors extend the Error class. They are thrown by the JVM and should not be handled or declared. Errors are rare,
 *   but you might see these:
 *
 * - ExceptionInInitializerError Thrown by the JVM when a static initializer throws an exception and doesn’t handle it
 * - StackOverflowError Thrown by the JVM when a method calls itself too many times (this is called infinite recursion
 *   because the method typically calls itself without end)
 * - NoClassDefFoundError Thrown by the JVM when a class that the code uses is available at compile time but not runtime
 *
 *
 */

/**
 * EXCEPTION INITIALIZER
 *
 * - Java runs static initializers the first time a class is used. If one of the static initializers throws an exception,
 *   Java can’t start using the class.
 *
 * - It declares defeat by throwing an ExceptionInInitializerError. This code shows an ArrayIndexOutOfBounds in a
 *   static initializer:
 *
 *
 */

class InitializerError {

    static {
        int [] countsOfMoose = new int [3];
        int num = countsOfMoose[-1];
    }


    public static void main(String[] args) {

    }

    /**
     * Yields the following output:
     *
     * Exception in thread "main" java.lang.ExceptionInInitializerError
     * Caused by: java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
     * 	at c6.InitializerError.<clinit>(CheckedExceptions.java:54)
     *
     *
     * - We get the ExceptionInInitializerError because the error happened in a static initializer.
     * - That information alone wouldn’t be particularly useful in fixing the problem.
     * - Therefore, Java also tells us the original cause of the problem: the ArrayIndexOutOfBoundsException that we need
     *   to fix.
     * - The ExceptionInInitializerError is an error because Java failed to load the whole class. This failure prevents
     *   Java from continuing.
     */


}

/**
 * STACKOVERFLOW ERROR
 *
 * - When Java calls methods, it puts parameters and local variables on the stack. After doing this a very large number of
 *   times, the stack runs out of room and overflows. This is called a StackOverflowError. Most of the time, this error occurs
 *   when a method calls itself.
 *
 * -
 */

class InfiniteRecursion {
    public static void doNotCodeThis(int num) {
        doNotCodeThis(num);
    }
    public static void main(String[] args) {
        doNotCodeThis(4);
    }

    /**
     * Yields following output:
     *
     * - Exception in thread "main" java.lang.StackOverflowError since the method calls itself, it will never end.
     * - Eventually, Java runs out of room on the stack and throws the error.
     * - This is called infinite recursion. It is better than an infinite loop because at least Java will catch it and
     *   throw the error. With an infinite loop, Java just uses all your CPU until you can kill it.
     */
}

/**
 * NoClassDefFoundError
 *
 * This error won’t show up in code on the exam—you just need to know that it is an error.
 * NoClassDefFoundError occurs when Java can’t find the class at runtime.
 */

/**
 * CALLING METHODS THAT THROW EXCEPTIONS
 *
 * When you’re calling a method that throws an exception, the rules are the same as within a method. Do you see why the
 * following doesn’t compile?
 *
 */

class NoMoreCarrotsException extends Exception {}
class Bunny {
    public static void main(String[] args) throws NoMoreCarrotsException{
        eatCarrot();
    }

    private static void eatCarrot() throws NoMoreCarrotsException{ }
}

/**
 * The problem is that NoMoreCarrotsException is a checked exception. Checked exceptions must be handled or declared.
 * The code would compile if we changed the main() method to either of these:
 *
 *
    public static void main(String[] args)
    throws NoMoreCarrotsException {// declare exception eatCarrot();
    }
 *
 *  public static void main(String[] args) {
 *  try { eatCarrot();
 *   } catch (NoMoreCarrotsException e ) {// handle exception System.out.print("sad rabbit");
 * } }
 *
 * You might have noticed that eatCarrot() didn’t actually throw an exception; it just declared that it could. This is
 * enough for the compiler to require the caller to handle or declare the exception.
 *
 * - The compiler is still on the lookout for unreachable code. Declaring an unused exception isn’t considered unreachable
 *   code.
 * - It gives the method the option to change the implementa- tion to throw that exception in the future. Do you see the issue here?
 *
 *
 */

class Carrots {
    public void bad () {
        try {
            eatCarrot();
            good();
        } catch (NoMoreCarrotsException e) {
            System.out.println("sad rabbit");
        }
    }
    public void good () throws NoMoreCarrotsException {
        eatCarrot();
    }
    private static void eatCarrot() {}

    //compiler realizes that eatcarrot cannot throw a checked exception. which means there’s no way for the catch block
    // in bad() to be reached. In comparison, good() is free to declare other exceptions.
}

/**
 * SUBCLASSES
 * - Now that you have a deeper understanding of exceptions, let’s look at overriding methods with exceptions in the
 *   method declaration.
 *
 * - When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed to add
 *   new checked exceptions to the method signature. For example, this code isn’t allowed:

 */

class CanNotHopException extends Exception {}
class Hopper {
    public void hop (){ }
}

class Bunnny extends Hopper {
    // public void hop () throws CanNotHopException { } does not compile
}

/**
 * - Java knows hop() isn't allowed to throw any checked exceptions because the superclass doesn't declare any. Imagine
 *   what would happen if subclasses could add checked exceptions—you could write code that calls Hopper’s hop() method
 *   and not handle any exceptions.
 *
 * - Then if Bunny was used in its place, the code wouldn’t know to handle or declare CanNotHopException.
 * - A subclass is allowed to declare fewer exceptions than the superclass or interface. This is legal because callers
 *   are already handling them.
 *
 */

class MyHopper {
    public void hop () throws CanNotHopException {}
}

class LittleBunny extends MyHopper {
    public void hop() {}

}

// A subclass not declaring an exception is similar to a method declaring it throws an exception that it never actually throws. This is perfectly legal.
// Similarly, a class is allowed to declare a subclass of an exception type. The idea is the same
// The superclass or interface has already taken care of a broader type. Here’s an example:

class CannotSwimException extends Exception {}

class Aquatic {
    public void swim() throws Exception {}
}

class Whale extends Aquatic {
    public void swim() throws CannotSwimException {}
}

// Whale could declare that it throws Exception directly, or it could declare that it throws a more specific type of Exception
// It could even declare that it throws nothing at all
// NOTE: THIS RULES APPLIES ONLY TO CHECKED EXCEPTIONS. The following code is legal because it has a runtime exception in the subclass’s version:

class LandAnimal {
    public void run () {}
}

class Buffalo extends LandAnimal {
    public void run () throws IllegalStateException {}
}

/**
 * The reason that it’s okay to declare new runtime exceptions in a subclass method is that the declaration is redundant.
 * Methods are free to throw any runtime exceptions they want without mentioning them in the method declaration.
 */

/**
 * PRINTING EXCEPTIONS
 *
 * There are three ways to print an exception. You can let Java print it out, print just the mes- sage, or print where
 * the stack trace comes from. This example shows all three approaches:
 *
 *
 */

class Printing {

    private static void hop () {

        throw new ArithmeticException("cannot divide by 0, go back to Kindergarten");
    }
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            //System.out.println(e);
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}