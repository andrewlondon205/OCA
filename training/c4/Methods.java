package c4;

public class Methods {

    public static void main(String[] args) {
        String a ;
        call(1);
        call(1,2);
        call(1,2,3);
        call(1,new int [] {4,5});
        // call (1, null); throws nullpointerException
        test(11, 22);
    }

    /**
     * Method Declaration
     *
     * Element                      Value                           Required
     * Access Modifier              public                          no
     * Optional Specifier           final                           no
     * Return Type                  void                            yes
     * Method Name                  nap                             yes
     * Parameter List               (int minutes)                   yes, but can be empty parentheses
     * Optional Exception List      throws Interrupted Exception    no
     * Method Body                  {                               yes
     *                              // take a nap
     *                              }
     *
     * ACCESS MODIFIERS
     *
     * - public: The method can be called from any class.
     * - private: The method can only be called from within the same class.
     * - protected: The method can only be called from classes in the same package or subclasses.
     * - default: The method can only be called from classes in the same package.This one is tricky because there is no
     *   keyword for default access. You simply omit the access modifier.
     *
     * @param minutes
     * @throws InterruptedException
     */
    public final void nap (int minutes) throws InterruptedException {
    }

    public void walk1() {}
    // default void walk2() {} does not compile because default isn't allowed - invalid keyword for access modifier
    // void public walk3() {} does not compile because return type cannot be placed before access modifier
    void walk4 () {}

    /**
     * Optional Specifiers
     *
     * - Can be specified in any order. They are optional meaning that they are not required to be declared
     * - We can have zero or many of these.
     *
     * - static : Used for class methods
     * - abstract : Used when not providing a method body
     * - final : Used when a method is not allowed to be overridden by a subclass.
     *
     */

    public void run1 () {}
    public final void run2 () {}
    public static final void run3 () {}
    public final static void run4() {}
    //public modifier void run5() {} does not compile because modifier is an invalid keyword
    // public void final run6() {} does not compile because return type cannot be placed before optional specifier
    final public void run7() {}

    /**
     * Return type
     *
     * - cannot be omitted
     * - if method shouldn't return anything, then it must be marked as void
     * - When checking return types, you also have to look inside the method body.
     * - Methods with a return type other than void are required to have a return statement inside the method body.
     * - This return statement must include the primitive or object to be returned.
     * - Methods that have a return type of void are permitted to have a return statement with no value returned or omit
     *   the return statement entirely.
     */

    public void fly1() { }
    public void fly2() { return; }
    public String fly3() { return ""; }
    // public String fly4() {} does not compile because return statement was omitted
    // public fly5() {} does not compile because method name and return type and statements are missing.
    // String fly6(int a) {if(a == 4) return ""; } does not compile

    /**
     * NOTE: When returning a value, it needs to be assignable to the return type.
     */

    int integer () {return 9; }
    // int long () {return 9L; } does not compile

    int integerExpanded () {
        int temp = 9;
        return temp;
    }

    /*  int longExpanded () {
        int temp = 9L;      does not compile
        return temp;
    }*/

    /**
     * Method Names
     *
     * - Method names follow the same rules as we practiced with variable names in Chapter 1
     * - To review, an identifier may only contain letters, numbers, $, or _. Also, the first character is not allowed
     *   to be a number, and reserved words are not allowed.
     * - By convention, methods begin with a lowercase letter but are not required to. Since this is a review of
     *   Chapter 1, we can jump right into practicing with some examples:
     */
    public void jump1 () {}
    // public void 2jump() {} does not compile because methods names cannot start with numbers
    // public jump3 void () {} does not compile return type cannot be placed at the end
    public void Jump_$() {}
    // public void () {} does not compile because method name is missing

    /**
     * Parameter List
     *
     * - Although the parameter list is required, it doesn’t have to contain any parameters.
     * - This means you can just have an empty pair of parentheses after the method name, such as void nap(){}.
     * - If you do have multiple parameters, you separate them with a comma.
     * - There are a couple more rules for the parameter list that you’ll see when we cover varargs shortly
     *
     */

    public void jog1() {}
    // public void jog2 {} does not compile because parameter list parenthesis is missing
    public void jog3 (int a) {}
    // public void jog4 (int a; int b ) {} does not compile because parameters should be separated by comma and not semicolon
    public void jog5 (int a, int b) {}

    /**
     * Optional Exception List
     *
     * - In Java, code can indicate that something went wrong by throwing an exception.
     * - You can list as many types of exceptions as you want in this clause sepa- rated by commas. For example:
     */

    public void zeroExceptions () {}
    public void oneException () throws IllegalArgumentException {}
    public void twoExceptions () throws IllegalArgumentException, InterruptedException {}

    /**
     * Method Body
     *
     * - The final part of a method declaration is the method body.
     * - A method body is simply a code block. It has braces that contain zero or more Java statements.
     */

    public void shoot1() {}
    // public void shoot2; does not compile
    public void shoot3 (int a ) {int name = 5; }

    /**
     * Varargs
     *
     * - As you saw in the previous chapter, a method may use a vararg parameter (variable argu- ment) as if it is an array.
     * - It is a little different than an array, though. A vararg parameter must be the last element in a method’s parameter list.
     * - This implies you are only allowed to have one vararg parameter per method.
     * - When calling a method with a vararg parameter, you have a choice. You can pass in an array, or you can list the
     *   elements of the array and let Java create it for you.
     * -  You can even omit the vararg values in the method call and Java will create an array of length zero for you.
     *
     */

    public void swim1 (int ... nums ) {}
    public void swim2 (int start, int ... nums ) {}
    // public void swim3 (int ... nums, int start) {} does not compile because varargs is not placed at the end
    // public void swim4 (int ... start, int ... nums) {} does not compile because varargs is not placed at the end

    public static void call (int start, int ... numbers) {
        System.out.println(numbers.length);
    }

    public static void test(int ... numbers) {
        System.out.println(numbers[1]);
    }

}

class StaticMethods {
    public static void main(String[] args) {

    }
}

