package c6;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * UNDERSTANDING EXCEPTIONS
 *
 * - A program can fail for just about any reason. Here are just a few possibilities:
 *
 * 1. The code tries to connect to a website, but the Internet connection is down.
 * 2. You made a coding mistake and tried to access an invalid index in an array.
 * 3. One method calls another with a value that the method doesn’t support.
 *
 * - As you can see, some of these are coding mistakes. Others are completely beyond your control.
 * - Your program can’t help it if the Internet connection goes down. What it can do is deal with the situation.
 * - First, we’ll look at the role of exceptions. Then we’ll cover the various types of exceptions, followed by an explanation
 *   of how to throw an exception in Java.
 *
 * - An exception is Java’s way of saying, “I give up. I don’t know what to do right now. You deal with it.”
 *   When you write a method, you can either deal with the exception or make it the calling code’s problem.
 */

public class Exceptions {
    public static void main(String[] args) {

    }
}

/**
 * These are the two approaches Java uses when dealing with exceptions. A method can handle the exception case itself or
 * make it the caller’s responsibility.
 */

class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        // throws ArrayIndexOutOfBoundsException
    }
}

/**
 * Java realized there's only one element in the array and index 1 is not allowed. Java threw up its hands in defeat and
 * threw an exception.
 *
 * It didn’t try to handle the exception. It just said, “I can’t deal with it” and the exception was displayed:
 *
 */

/**
 * RETURN CODES VS EXCEPTIONS
 *
 * - Exceptions are used when “something goes wrong.” However, the word “wrong” is subjective. The following code returns –1
 *   instead of throwing an exception if no match is found:
 *
 */

class Calculate {
    public static int indexOf(String [] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i;}
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new String [] {"andrew","visti","sanjay","rafal"},"erica"));
    }
}

/**
 * - This approach is common when writing a method that does a search. For example, imagine being asked to find the name
 *   Joe in the array.
 *
 * - It is perfectly reasonable that Joe might not appear in the array. When this happens, a special value is returned.
 * - An exception should be reserved for exceptional conditions like names being null.
 *
 * - In general, try to avoid return codes. Return codes are commonly used in searches, so programmers are expecting
 *   them. In other methods, you will take your callers by surprise by returning a special value.
 *
 * - An exception forces the program to deal with them or end with the exception if left unhandled, whereas a return code
 *   could be accidentally ignored and cause problems later in the program. An exception is like shouting, “Deal with me!”
 *
 * UNDERSTANDING EXCEPTION TYPES
 *
 * - As we’ve explained, an exception is an event that alters program flow. Java has a Throwable superclass for all objects
 *   that represent these events.
 *
 * - Not all of them have the word exception in their classname, which can be confusing.
 *
 *                                                      java.lang.Object
 *                                                              |
 *                                                              |
 *                                                              |
 *                                                        java.lang.Throwable
 *                                                        /                     \
 *                                                       /                       \
 *                                                      /                         \
 *                                          java.lang.Exception                 java.lang.Error
 *                                                  |
 *                                                  |
 *                                          java.lang.RuntimeException
 *
 * - Error means something went so horribly wrong that your program should not attempt to recover from it.
 * - For example, the disk drive “disappeared.” These are abnormal conditions that you aren’t likely to encounter.
 * - A runtime exception is defined as the RuntimeException class and its subclasses. Runtime exceptions tend to be
 *   unexpected but not necessarily fatal.
 *
 * - For example, accessing an invalid array index is unexpected.  Runtime exceptions are also known as unchecked exceptions.
 * - A runtime (unchecked) exception is a specific type of exception. All exceptions occur at the time that the program is run.
 * - People don’t refer to them as run time exceptions because that would be too easy to confuse with runtime! When you see runtime,
 *   it means unchecked.
 *
 * - A checked exception includes Exception and all subclasses that do not extend RuntimeException.
 * - Checked exceptions tend to be more anticipated—for example, trying to read a file that doesn’t exist.
 * - Checked exceptions? What are we checking? Java has a rule called the handle or declare rule.
 * - For checked exceptions, Java requires the code to either handle them or declare them in the method signature.
 */

class Handler {
    void fall () throws Exception {
        throw new Exception();
    }
}

// throw tells Java that you want to throw an Exception.
// throws simply declares that the method might throw an Exception. It also might not.
/**
 * Because checked exceptions tend to be anticipated, Java enforces that the programmer do something to show the exception
 * was thought about.
 *
 * Maybe it was handled in the method. Or maybe the method declares that it can’t handle the exception and someone else should.
 *
 * An example of a runtime exception is a NullPointerException, which happens when you try to call a member on a null
 * reference.
 *
 * THROWING AN EXCEPTION
 *
 * - Any Java code can throw an exception; this includes code you write. For the OCP exam, you’ll learn how to create
 *   your own exception classes.
 * - The OCA exam is limited to exceptions that someone else has created.
 * - Most likely, they will be exceptions that are provided with Java.
 * - You might encounter an exception that was made up for the exam. This is fine. The question will make it obvious that
 *   these are exceptions by having the classname end with exception.
 *
 * -
 *
 */

class Test {
    public static void main(String[] args) {
        String [] animals = new String[0];
        System.out.println(animals[0]); //throws ArrayOutOfBounds exception
    }
}

/**
 * - On the OCA exam, the vast majority of questions have a choice about not compiling and about throwing an exception.
 * - Pay special attention to code that calls a method on a null or that references an invalid array or ArrayList index.
 * - If you spot this, you know the correct answer is that the code throws an exception.
 *
 * - The second way for code to result in an exception is to explicitly request Java to throw one. Java lets you write
 *   statements like these:
 *
 * -
 */

class ExceptionsThrower {
    public void exception1 () throws Exception {
        Object a;
        throw new Exception();

    }

    public void exception2 () throws Exception {
        throw new Exception("Ow! I fell");
    }

    public void exception3 () {
        throw new RuntimeException();
    }

    public void exception4 () {
        throw new RuntimeException("Ow! I fell");
    }

    // The throw keyword tells Java you want some other part of the code to deal with the exception.
    // This is the same as the young girl crying for her daddy. Someone else needs to figure out what to do about the
    // exception.

    /**
     * When creating an exception, you can usually pass a String parameter with a message or you can pass no parameters
     * and use the defaults.
     *
     * Sometimes constructors are not available. Therefore, usually.
     */
}


/**
 * TYPES OF EXCEPTIONS
 *
 * TYPE                     HOW TO RECOGNIZE                 IS IT OK TO CATCH                 IS IT REQUIRED TO HANDLE
 *                                                                                                      OR DECLARE
 *
 * Runtime exception        Subclass of RuntimeException            Yes                                 No
 * Checked exception        Subclass of Exception but not           Yes                                 Yes
 *                          subclass of RunTimeException
 *
 * Error                    Subclass of Error                       No                                  NO
 *
 *
 * USING A TRY STATEMENT
 *
 * - Now that you know what exceptions are, let’s explore how to handle them.
 * - Java uses a try statement to separate the logic that might throw an exception from the logic to handle that exception.

 */

class TryStatement {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Go back to Kindergarten");
        }
    }
}

/**
 * - The code in the try block is run normally. If any of the statements throw an exception that can be caught by the
 *   exception type listed in the catch block.
 *
 * - The try block stops running and execution goes to the catch statement.
 * - If none of the statements in the try block throw an exception that can be caught, the catch clause is not run.
 */

class Scenario1 {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Dubai");
            String g = null;
            g.length();
            System.out.println("This line of code is never executed");

        } catch (NullPointerException exception) {
            System.out.println("Go back to high school");
        }
    }
}

// Catch block doesn't execute
class Scenario2 {
    public static void main(String[] args) {
        try {
            String a = "    !!a    wildebeest!!    !";
            a = a.trim();
            System.out.println(a);
        } catch (Exception exception) {
            System.out.println("Exception handled");
        }
    }
}

class Scenario3 {
    static void explore () {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            System.out.println("Handled!");
        }
    }

    public static void main(String[] args) {
        explore();
    }
    static void fall () {throw new RuntimeException("The girl has fallen! ");}
}

// line 266 calls fall() methods.
// line 237 throws an exception.
// Line 267 is completely skipped
// the girl gets up - exception handled
// Now let’s look at some invalid try statements that the exam might try to trick you with.

class TrickyScenarios {
    public static void main(String[] args) {
        // does not compile because we haven't added the braces
/*        try
            fall();
        catch (Exception e)
          System.out.println("get up");*/

        // Now it works
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }

        // try statements are like methods in that the curly braces are required even if there is only one statement inside the code blocks.

/*        try {
            fall(); does not compile because try statements require catch or finally after it
        }*/
    }
    static void fall () throws Exception{}
}

/**
 * ADDING A FINALLY BLOCK
 *
 * - The try statement also lets you run code at the end with a finally clause regardless of whether an exception is
 *   thrown. Figure 6.3 shows the syntax of a try statement with this extra functionality.
 */

class TryAndFinally {
    public static void main(String[] args) {
        try {
            int x = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Please, get yourself a brain");
        } finally {
            System.out.println("Well Done! ");
        }
    }

    // A finally block can only appear as part of a try statement.
    // The finally block always executes, whether or not an exception occurs in the try block.
    /**
     * There are two paths through code with both a catch and a finally. If an exception is thrown, the finally block is
     * run after the catch block. If no exception is thrown, the finally block is run after the try block completes.
     */
}

class Scenario4 {

    static void seeAnimals() {
        System.out.println("Beautiful animals");
    }

    static void fall() throws Exception {
        System.out.println("Dad!! I need your help!");
        throw new Exception();
    }

    static void getHugFromDaddy () {
        System.out.println("Here Daddy comes to rescue!");
    }

    static void seeMoreAnimals () {
        System.out.println("Let us visit the hippos");
    }
    static void explore () {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        System.out.println("Let's go home");
    }
    public static void main(String[] args) {
        explore();
    }
}

// On the OCA exam, a try statement must have catch and/or finally. Having both is fine. Having neither is a problem.
// On the OCP exam, you’ll learn about a special syntax for a try statement called try-with-resources that allows neither
// a catch nor a finally block.

// On the OCA exam, you get to assume a try statement is just a regular try statement and not a try- with-resources statement.

/**
 * The exam will try to trick you with missing clauses or clauses in the wrong order. Do you see why the following do or do not compile?
 */
class TrickAttempt {
    public static void main(String[] args) {
/*
        WRONG ORDER
        try {
            String s = null;
        } finally {
            System.out.println("all better");
        } catch (Exception e) {
            System.out.println("get up");
        }


        CATCH OR FINALLY MUST BE PRESENT
        try {
            int = 12/ 0;
        }*/

        //code between lines 384 and 394 doesn't compile
        // THIS WORKS FINE
        try {
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
            numbers.get(20);
        } finally {
            System.out.println("all better");
        }
    }
}

/**
 * One problem with finally is that any realistic uses for it are out of the scope of the OCA exam. finally is typically
 * used to close resources such as files or databases—both of which are topics on the OCP exam.
 *
 * This means most of the examples you encounter on the OCA exam with finally are going to look contrived. For example,
 * you’ll get asked ques- tions such as what this code outputs:
 *
 *
 */

class FinallyExample {
    public static void main(String[] args) {
        String s = "";
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }

        s+= "a";
        System.out.println(s);

        //The answer is tfa. The try block is executed. Since no exception is thrown, Java goes straight to the finally block.
        //
    }
}

/**
 * FINALLY EXCEPTION
 *
 * - There is one exception to “the finally block always runs after the catch block” rule:
 * - Java defines a method that you call as System.exit(0);
 * - The integer parameter is the error code that gets returned.
 * - System.exit tells Java, “Stop. End the program right now. Do not pass go.
 * - Do not collect $200.” When System.exit is called in the try or catch block, finally does not run.
 *
 */

class FinallyException {
    public static void main(String[] args) {
        try {
            System.exit(0);// prevents execution altogether
            String s = null;
            s.length();
            System.out.println("we never get here");
        } catch (NullPointerException e) {
            System.out.println("Time to handle exception!");
            System.exit(0);// prevents finally block execution
        } finally {
            System.exit(0);// prevents the execution of the statements after line 460
            System.out.println("Time to go home!");
        }
    }
}

/**
 * CATCHING VARIOUS TYPES OF EXCEPTIONS
 *
 * - So far, you have been catching only one type of exception. Now let’s see what happens when different types of
 *   exceptions can be thrown from the same method.
 *
 * - Creating your own exceptions is not on the OCA exam, but it is on the OCP exam.
 *
 * - However, the OCA exam can define basic exceptions to show you the hierarchy. You only need to do two things with
 *   this information.
 *
 * - First, you must be able to recognize if the exception is a checked or an unchecked exception.
 * - Second, you need to determine if any of the exceptions are subclasses of the others.
 */

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitedClose extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitedClose {}

class DriverClass {

    public static void seeAnimal() throws AnimalsOutForAWalk{
        System.out.println("hi tiger");
        throw new AnimalsOutForAWalk();
    }
    public static void main(String[] args) {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.println("try back later");
        } catch (ExhibitedClose e) {
            System.out.println("not today");
        }
    }

    /**
     * - There are three possibilities for when this code is run. If seeAnimal() doesn’t throw an exception, nothing is
     *   printed out. If the animal is out for a walk, only the first catch block runs. If the exhibit is closed, only the
     *   second catch block runs.
     *
     * - A rule exists for the order of the catch blocks. Java looks at them in the order they appear.
     * - If it is impossible for one of the catch blocks to be executed, a compiler error about unreachable code occurs.
     * - This happens when a superclass is caught before a subclass. Remember, we warned you to pay attention to any subclass exceptions.
     *
     * - In the porcupine example, the order of the catch blocks could be reversed because the exceptions don’t inherit
     *   from each other.
     *
     * - And yes, we have seen a porcupine be taken for a walk on a leash.
     */
}

class Procupine {
    public static void seeAnimal() throws ExhibitClosedForLunch{
        System.out.println("hi tiger");
        throw new ExhibitClosedForLunch();
    }
    public static void main(String[] args) {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) { //subclass exception
            System.out.println("try back later");
        } catch (ExhibitedClose e) { //superclass exception
            System.out.println("not today");
        }

/*
       unreachable code -- does not compile
       try {
            seeAnimal();
        } catch (ExhibitedClose e) {
            System.out.println("not today");
        } catch (ExhibitClosedForLunch e) {
            System.out.println("try back later");
        }*/

        /**
         * This time, if the more specific ExhibitClosedForLunch exception is thrown the catch block for ExhibitClosed runs
         * which means  there is no way for the second catch block to ever run.
         *
         * Java correctly tells us there is an unreachable catch block.
         */

    }
}

class Snakes {

    public static void seeAnimal() {
        System.out.println("Grr");
    }

    public static void main(String[] args) {

/*        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        } catch (ExhibitedClose e) {
            System.out.println("not today");
        } catch (Exception e) {
            System.out.println("exception");
        }*/

        // To review catching multiple exceptions, remember that at most one catch block will run and it will be the
        // first catch block that can handle it.
    }
}

/**
 * THROWING A SECOND EXCEPTION
 *
 * - So far, we’ve limited ourselves to one try statement in each example. However, a catch or finally block can have
 *   any valid Java code in it—including another try statement.
 *
 * -
 */

class Reader {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {

            }
        }
    }

    /**
     * If line 591 doesn't throw an exception. Then the entire catch block between 592 and 598 lines is skipped.
     * If line 591 does throw an NullPointer Exception, lines block 592 to 598 is skipped.
     * If line 591 does throw an IOException, the code between these lines gets executed
     * @return
     * @throws IOException
     */


    private static FileReader read() throws IOException {
        System.out.println("Bingo");
        throw new IOException();
    }
}

/**
 * Most of the examples you see with exception handling on the exam are abstract. They use letters or numbers to make
 * sure you understand the flow. This one shows that only the last exception to be thrown matters.
 */

class ReThrowExepction {
    public static void main(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
    }
    /**
     * - Line 624 throws an exception, which is caught on line 625.
     * - The catch block then throws an exception on line 626.
     * - If there were no finally block, the exception from line 29 would be thrown.
     * - However, the finally runs after try block. Since finally block throws an exception on its own on line 628, this one
     *   gets thrown.
     *
     * - The exception from line 626 gets forgotten about
     *
     * - This is why you often see another try/catch inside a finally block—to make sure it doesn’t mask the exception
     *   from the catch block.
     */
}

class HardExample {

    public static String exceptions () {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch (NullPointerException e) {
                result += "catch ";
                throw new RuntimeException();
            } finally {
                result += "finally ";
            }   throw new Exception();
        } catch (Exception e) {
            result += "done ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exceptions());
    }
}

class MyException extends Exception {}
class AdditionalExample {

    public static void fall () throws IOException, MyException {
        throw new IOException();
    }
    public static void main(String[] args) {

        try {
            String s = null;
            s.length();
            fall();
        } catch (RuntimeException | IOException  | MyException exception ) {
            System.out.println();
        }
    }
}
