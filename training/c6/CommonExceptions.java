package c6;

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
 * 3. ClassCastException = Thrown by the JVM when an attempt is made to cast an excep- tion to a subclass of
 *     which it is not an instance.
 * 4. IllegalArgumentException Thrown by the programmer to indicate that a method has been passed an illegal or
 *    inappropriate argument
 * 5. NullPointerException Thrown by the JVM when there is a null reference where an object is required
 * 6. NumberFormatException Thrown by the programmer when an attempt is made to con- vert a string to a numeric type
 *    but the string doesn’t have an appropriate format.
 *
 */
