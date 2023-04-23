package c4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Methods {

    public static void main(String[] args) {
        String a;
        call(1);
        call(1, 2);
        call(1, 2, 3);
        call(1, new int[]{4, 5});
        // call (1, null); throws nullpointerException
        test(11, 22);
    }

    /**
     * Method Declaration
     * <p>
     * Element                      Value                           Required
     * Access Modifier              public                          no
     * Optional Specifier           final                           no
     * Return Type                  void                            yes
     * Method Name                  nap                             yes
     * Parameter List               (int minutes)                   yes, but can be empty parentheses
     * Optional Exception List      throws Interrupted Exception    no
     * Method Body                  {                               yes
     * // take a nap
     * }
     * <p>
     * ACCESS MODIFIERS
     * <p>
     * - public: The method can be called from any class.
     * - private: The method can only be called from within the same class.
     * - protected: The method can only be called from classes in the same package or subclasses.
     * - default: The method can only be called from classes in the same package.This one is tricky because there is no
     * keyword for default access. You simply omit the access modifier.
     *
     * @param minutes
     * @throws InterruptedException
     */
    public final void nap(int minutes) throws InterruptedException {
    }

    public void walk1() {
    }

    // default void walk2() {} does not compile because default isn't allowed - invalid keyword for access modifier
    // void public walk3() {} does not compile because return type cannot be placed before access modifier
    void walk4() {
    }

    /**
     * Optional Specifiers
     * <p>
     * - Can be specified in any order. They are optional meaning that they are not required to be declared
     * - We can have zero or many of these.
     * <p>
     * - static : Used for class methods
     * - abstract : Used when not providing a method body
     * - final : Used when a method is not allowed to be overridden by a subclass.
     */

    public void run1() {
    }

    public final void run2() {
    }

    public static final void run3() {
    }

    public final static void run4() {
    }

    //public modifier void run5() {} does not compile because modifier is an invalid keyword
    // public void final run6() {} does not compile because return type cannot be placed before optional specifier
    final public void run7() {
    }

    /**
     * Return type
     * <p>
     * - cannot be omitted
     * - if method shouldn't return anything, then it must be marked as void
     * - When checking return types, you also have to look inside the method body.
     * - Methods with a return type other than void are required to have a return statement inside the method body.
     * - This return statement must include the primitive or object to be returned.
     * - Methods that have a return type of void are permitted to have a return statement with no value returned or omit
     * the return statement entirely.
     */

    public void fly1() {
    }

    public void fly2() {
        return;
    }

    public String fly3() {
        return "";
    }
    // public String fly4() {} does not compile because return statement was omitted
    // public fly5() {} does not compile because method name and return type and statements are missing.
    // String fly6(int a) {if(a == 4) return ""; } does not compile

    /**
     * NOTE: When returning a value, it needs to be assignable to the return type.
     */

    int integer() {
        return 9;
    }
    // int long () {return 9L; } does not compile

    int integerExpanded() {
        int temp = 9;
        return temp;
    }

    /*  int longExpanded () {
        int temp = 9L;      does not compile
        return temp;
    }*/

    /**
     * Method Names
     * <p>
     * - Method names follow the same rules as we practiced with variable names in Chapter 1
     * - To review, an identifier may only contain letters, numbers, $, or _. Also, the first character is not allowed
     * to be a number, and reserved words are not allowed.
     * - By convention, methods begin with a lowercase letter but are not required to. Since this is a review of
     * Chapter 1, we can jump right into practicing with some examples:
     */
    public void jump1() {
    }

    // public void 2jump() {} does not compile because methods names cannot start with numbers
    // public jump3 void () {} does not compile return type cannot be placed at the end
    public void Jump_$() {
    }
    // public void () {} does not compile because method name is missing

    /**
     * Parameter List
     * <p>
     * - Although the parameter list is required, it doesn’t have to contain any parameters.
     * - This means you can just have an empty pair of parentheses after the method name, such as void nap(){}.
     * - If you do have multiple parameters, you separate them with a comma.
     * - There are a couple more rules for the parameter list that you’ll see when we cover varargs shortly
     */

    public void jog1() {
    }

    // public void jog2 {} does not compile because parameter list parenthesis is missing
    public void jog3(int a) {
    }

    // public void jog4 (int a; int b ) {} does not compile because parameters should be separated by comma and not semicolon
    public void jog5(int a, int b) {
    }

    /**
     * Optional Exception List
     * <p>
     * - In Java, code can indicate that something went wrong by throwing an exception.
     * - You can list as many types of exceptions as you want in this clause sepa- rated by commas. For example:
     */

    public void zeroExceptions() {
    }

    public void oneException() throws IllegalArgumentException {
    }

    public void twoExceptions() throws IllegalArgumentException, InterruptedException {
    }

    /**
     * Method Body
     * <p>
     * - The final part of a method declaration is the method body.
     * - A method body is simply a code block. It has braces that contain zero or more Java statements.
     */

    public void shoot1() {
    }

    // public void shoot2; does not compile
    public void shoot3(int a) {
        int name = 5;
    }

    /**
     * Varargs
     * <p>
     * - As you saw in the previous chapter, a method may use a vararg parameter (variable argu- ment) as if it is an array.
     * - It is a little different than an array, though. A vararg parameter must be the last element in a method’s parameter list.
     * - This implies you are only allowed to have one vararg parameter per method.
     * - When calling a method with a vararg parameter, you have a choice. You can pass in an array, or you can list the
     * elements of the array and let Java create it for you.
     * -  You can even omit the vararg values in the method call and Java will create an array of length zero for you.
     */

    public void swim1(int... nums) {
    }

    public void swim2(int start, int... nums) {
    }
    // public void swim3 (int ... nums, int start) {} does not compile because varargs is not placed at the end
    // public void swim4 (int ... start, int ... nums) {} does not compile because varargs is not placed at the end

    public static void call(int start, int... numbers) {
        System.out.println(numbers.length);
    }

    public static void test(int... numbers) {
        System.out.println(numbers[1]);
    }

}

/**
 * - Static methods don't require an instance of the class
 * - They are shared among all users of the class. You can think of statics as being a member of the single class
 * object that exist independently of any instances of that class.
 * <p>
 * - Each class has a copy of the instance variables.
 * - There is only one copy of the code for the instance methods.
 * - Each instance of the class can call it as many times as it would like. However, each call of an instance method
 * (or any method) gets space on the stack for method parameters and local variables.
 * - The same thing happens for static methods. There is one copy of the code. Parameters and local variables go on
 * the stack.
 * - Just remember that only data gets its “own copy.” There is no need to duplicate copies of the code itself.
 * <p>
 * In addition to main() methods, static methods have two main purposes:
 * <p>
 * - For utility or helper methods that don’t require any object state. Since there is no need to access instance
 * variables, having static methods eliminates the need for the caller to instantiate the object just to call the method.
 * <p>
 * - For state that is shared by all instances of a class, like a counter. All instances must share the same state. Methods
 * that merely use that state should be static as well.
 */


class Koala {
    public static int count = 0;    // static variable

    public static void main(String[] args) { // static method
        System.out.println(count);
    }
}

class KoalaTester {
    public static void main(String[] args) {
        //Koala.main(new String [0]); // call static method
/*        System.out.println(Koala.count);
        Koala.main(new String[0]);

        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count);*/

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // prints 5 because there is only one static variable because it is static
    }
}

/**
 * STATIC VS INSTANCE
 * <p>
 * - A static member cannot call an instance member. This shouldn’t be a surprise since static doesn’t require any
 * instances of the class to be around.
 */

class Static {
    private String name = "Static class";

    // private static String name = "Static class";
    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    //public static void third() {System.out.println(name);}
    public static void main(String[] args) {
        first();
        second();
        // third(); does not compile because a static method cannot call an instance method
        new Static().third();
    }

    /**
     * Type                  Calling                            Legal                How
     *
     * Static method        Another static method/variable      Yes                  Using the classname
     * Static method        An instance method/variable         No
     * Instance method      A static method/variable            Yes                  Using the classname or a reference variable
     * Instance method      Another instance method/variable    Yes                  Using a reference variable
     */
}

class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        //    babyGorilla();
    }

    public int total;
    //public static average = total / count;
}

class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);

        //Each time the constructor gets called, it increments count by 1.
        // This example relies on the fact that static (and instance) variables are automatically initialized to the
        // default value for that type, which is 0 for int.
    }
}

/**
 * Static Variables
 * <p>
 * - Some static variables are meant to change as the program runs. Counters are a common example of this.
 * - We want the count to increase over time. Just as with instance variables, you can initialize a static
 * variable on the line it is declared:
 */

class Initializers {
    private static int counter = 0;
    private static final int NUM_BUCKETS = 45;
    private static final List<String> values = new ArrayList<>();

    public static void main(String[] args) {
        // NUM_BUCKETS = 5; doesn't compile because num_buckets is marked as final
        values.add("changed"); //compiles without issue because  values is a reference variable. We are allowed to call methods on reference variables.
        // All the compiler can do is check that we don’t try to reassign the final values to point to a different object.

    }
}

/**
 * Static Initialization
 * <p>
 * - In Chapter 1, we covered instance initializers that looked like unnamed methods. Just code inside braces.
 * - Static initializers look similar. They add the static keyword to specify they should be run when the class is first used.
 * -
 */

class StaticInitialization {
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numMinutesPerHour * numSecondsPerMinute;
    }

    private static int one;
    private static final int two;
    private static final int three = 3;
    //  private static final int four; does not compile because it was not initialized

    static {
        one = 1;
        two = 2;
        // three = 3; does not compile
        //two = 4; does not compile
    }
}

/**
 * Static Imports
 * <p>
 * - Static imports are for importing static members of classes. Just like regular imports, you can use a wildcard or import a specific member.
 */

//import static statics.A.TYPE;
//import static statics.B.TYPE;
class Imports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two");

        asList("one");
    }
}

class PassByValue {

    public static void main(String[] args) {
        int num = 4;
        newNumber(5);

        String name = "Webby";
        StringBuilder label = new StringBuilder("Kevin");

        speak(name);
        talk(label);

        System.out.println(num);
        System.out.println(name);
        System.out.println(label);
    }

    public static void newNumber(int num) {
        num = 8;
    }

    public static void speak(String name) {
        name = "Sparky";
    }

    public static void talk(StringBuilder label) {
        label.append(" Payano");
    }
}

class ReturningValues {
    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        number(number);
        letters = letters(letters);
        System.out.println(number + letters);
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}

/**
 * METHOD OVERLOADING
 * <p>
 * - Method overloading occurs when there are different method signatures with the same name but different type parameters.
 * We’ve been calling overloaded methods for a while. System.out.println and StringBuilder’s append methods provide many
 * overloaded versions so you can pass just about anything to them without having to think about it.
 * <p>
 * - Everything other than the method signature can vary for overloaded methods. This means there can be different access
 * modifiers, specifiers (like static), return types, and exception lists.
 */
class Overloading {
    public static void main(String[] args) {
        winner((long) 23);
        load(new int[]{1, 2, 3, 4});
        crack(5, 2, 12, 452, 9);
        System.out.println();
        shatter(4);

    }

    public void fly(int numMiles) {
    }

    public void fly(short numFeet) {
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet) {
    }

    public void fly(short numFeet, int numMiles) throws Exception {
    }

    public void swim(int distance) {
    }
    // public int swim (int distance) {return 2;} does not compile

    public void fight(int weight) {
    }
    //public static void fight (int weight) {} does not compile because parameter list is the same

    public static void winner(int victories) {
        System.out.println("Jon Jones");
    }

    public static void winner(long victories) {
        System.out.println("Stipe Miocic");
    }

    /**
     * OVERLOADING AND VARARGS
     * <p>
     * - Java treats varargs as if they were an array. This means that the method signature is the same for both methods.
     */

    public static void load(int[] lengths) {
        System.out.println(Arrays.toString(lengths));
    }
    // public static void load(int ... lengths) {} does not compile

    public static void crack(int... lengths) {
        System.out.println(Arrays.toString(lengths));
    }

    /**
     * AUTOBOXING
     * <p>
     * - In the previous chapter, you saw how Java will convert a primitive int to an object Integer to add it to an
     * ArrayList through the wonders of autoboxing. This works for code you write too.
     * <p>
     * Example
     * <p>
     * - public void fly(Integer numMiles) { }
     * <p>
     * It implies that calling the method fly(3) will execute it. However, what if we have the following methods?
     */
    public static void shatter(int weight) {
        System.out.println("shattered");
    }

    public static void shatter(Integer weight) {
        System.out.println("shattered bones");
    }

    /**
     * - Java will match the int numMiles version. Java tries to use the most specific parameter list it can find.
     * - When the primitive int version isn't present, it will autobox. However, when the primitive int version is
     *   provided, there is no reason for Java to do the extra work of autoboxing.
     */
}

class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public void fly(Number n) {
        System.out.println("number");
    }


    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
    }

}

/**
 * PRIMITIVES
 * - Primitives work in a way similar to reference variables. Java tries to find the most specific matching overloaded method.
 */

class Plane {
    public void fly(int i) {
        System.out.println("int");
    }

    public void fly(long l) {
        System.out.println("long");
    }


    public static void main(String[] args) {

        Plane p = new Plane();
        p.fly(123);
        p.fly(123L);

        /**
         * - Note that Java can only accept wider types. An int can be passed to a method taking a long parameter.
         * - Java will not automatically convert to a narrower type.
         * - If you want to pass a long to a method taking an int parameter, you have to add a cast to explicitly say
         *   narrowing is okay.
         */
    }
}

/**
 * OVERLOADING ORDER
 *
 * Rule                         Example of what will be chosen for glide(1,2)
 *
 * Exact match by type          public String glide(int i, int j) {}
 * Larger primitive type        public String glide(long i, long j) {}
 * Autoboxed type               public String glide(Integer i, Integer j) {}
 * Varargs                      public String glide(int... nums) {}
 */

class Glider2 {

    public static String glide(String s) {
        return "1";
    }

    public static String glide(String... s) {
        return "2";
    }

    public static String glide(Object o) {
        return "3";
    }

    public static String glide(String s, String t) {
        return "4";
    }
    public static void method(Integer a, double b) {
        System.out.println("first");
    }
    public static void method(Double a, int b) {
        System.out.println("second");
    }
    public static void method(int j, int i) {
        System.out.println("third");
    }
    public static void method(double j, double i) {
        System.out.println("fourth");
    }
    public static void method (Integer a, Integer b) {
        System.out.println("fifth");
    }
    public static void method (Double x, Double y) {
        System.out.println("Sixth");
    }

    public static void main(String[] args) {

        short alpha = 45;
        float number = 23.4f;
        double x = 12;


        method(1,2);
        method(9.5,7);
        method(Integer.valueOf(10),alpha);
        method(number,alpha);
        //method(null,null); does not compile
        method(Double.valueOf(15),null);
        method(19.4f,alpha);
        method(10l,45);

        System.out.println();
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }
}

class TooManyConversions {

    public static void play(Long l) { }
    public static void play(Long ... l ) {}

    public static void main(String[] args) {
       // play(4); does not compile
        play(4L);
    }

}

