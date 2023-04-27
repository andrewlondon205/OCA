package c5;

/**
 * UNDERSTANDING INTERFACES
 *
 * - An interface is an abstract data type that defines a list of abstract public methods that any class implementing
 *   the interface must provide.
 *
 * - An interface can also include a list of constant variables and default methods, which we’ll cover in this section.
 * - In Java, an interface is defined with the interface keyword, analogous to the class keyword used when defining a class.
 * - A class invokes the interface by using the implements keyword in its class definition
 */

public class Interfaces {
    public static void main(String[] args) {

    }
}

interface canBurrow {
    public static final int MINIMUM_DEPTH = 2; // static is assumed keyword for interface variables
    public abstract int getMaximumDepth(); // public and abstract are assumed keywords within interfaces methods
}

class FieldMouse implements canBurrow {
    public int getMaximumDepth () {
        return 10;
    }
}

// A class may implement multiple interfaces, each separated by a comma, such as in the following example:

interface WalksOnFourLegs {}
interface HasTrunk {}
interface Herbivore {}

class Mammut implements WalksOnFourLegs, HasTrunk, Herbivore { }

// If any of the above interfaces defined abstract methods, then the concrete class would be required to implement those methods

/**
 * INTERFACE DEFINITION RULES
 *
 * - It may be helpful to think of an interface as a specialized kind of abstract class, since it shares many of the
 *   same properties and rules as an abstract class.
 *
 * - The following is a list of rules for creating an interface, many of which you should recognize as adaptions of the
 *   rules for defining abstract classes.
 *
 * 1. Interfaces cannot be instantiated directly.
 * 2. An interface is not required to have any methods.
 * 3. An interface may not be marked as final.
 * 4. All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier
 *    in their definition. Therefore, marking an interface as private, protected, or final will trigger a compiler error,
 *    since this is incompatible with these assumptions.
 *
 * 5. All non-default methods in an interface are assumed to have the modifiers abstract and public in their definition.
 *    Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible
 *    with the abstract and public keywords.
 */

interface WalksOnTwoLegs {}

class TestClass {
    public static void main(String[] args) {
      //   WalksOnTwoLegs example = new WalksOnTwoLegs(); does not compile
    }
}

// final interface WalksOnEightLegs {} doesnt compile

// assumed keywords are automatically inserted by the compiler if they are missing

interface CanFly {

    //Given the following method definitions without the assumed keywords

    void fly (int speed);
    void takeoff();
    double dive();

    // The compiler will add them in case they are missing

    //public abstract void fly (int speed);
    //public abstract void takeoff ();
    //public abstract double dive();

}

/* Does not compile
private final interface CanCrawl { interfaces must not be private or final

    methods are assumed to be public and abstract
    private void dig(int depth);
    protected abstract double depth();
    public final void surface();
}
*/

/**
 * INHERITING AN INTERFACE
 *
 * There are two inheritance rules you should keep in mind when extending an interface:
 *
 * - An interface that extends another interface, as well as an abstract class that implements an interface, inherits
 *   all of the abstract methods as its own abstract methods.
 *
 * - The first concrete class that implements an interface, or extends an abstract class that implements an interface,
 *   must provide an implementation for all of the inherited abstract methods.
 *
 * Like an abstract class, an interface may be extended using the extend keyword. In this manner, the new child interface
 * inherits all the abstract methods of the parent interface.
 */

interface Poisonous {
    public int getLength ();
}

interface HasFangs {
    public int getNumberOfFangs ();
}

interface BlackMamba extends Poisonous, HasFangs { } // any class implementing BlackMamba will have to implement the methods

// How about an abstract class that implements an interface?
// In this scenario, the abstract class is treated in the same way as an interface extending another interface.

interface HasTail  {
    public int getTailLength ();
}

interface HasWhiskers {
    public int getNumberOfWhiskers ();
    public int getNumberOfLimbs();
}

abstract class HarborSeal implements HasTail, HasWhiskers {
    public int getNumberOfLimbs () {
        return 230;
    }

    public abstract boolean isAlive ();

}

class Leopard extends HarborSeal implements HasTail, HasWhiskers {
    public int getTailLength () {
        return 10;
    }

    public int getNumberOfWhiskers () {
        return 120;
    }

    public boolean isAlive () {
        return true;
    }

    // without the above method definitions, code would not compile
}

interface Vehicle {
    int getWeight ();
}

abstract class Car implements Vehicle {  }

class Toyota extends Car {
    public int getWeight () {
        return 2000;
    }
}

// Classes, Interfaces, and Keywords

/**
 * - The exam creators are fond of questions that mix class and interface terminology. Although a class can implement an
 *   interface, a class cannot extend an interface.
 * - Likewise, whereas an interface can extend another interface, an interface cannot implement another interface. The
 *   following examples illustrate these principles:
 */

interface CanRun {}
// class Cheetah extends CanRun {} does not compile
class Hyena {}
// interface HasFur extends Hyena does not compile

/**
 * ABSTRACT METHODS AND MULTIPLE INHERITANCE
 *
 * - Since Java allows for multiple inheritance via interfaces, you might be wondering what will happen if you define a
 *   class that inherits from two interfaces that contain the same abstract method:
 */

interface HerBivore {
    public void eatPlants();
}
interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}

class PolarBear implements HerBivore, Omnivore {
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    public void eatMeat () {
        System.out.println("Eating meat");
    }
}

/**
 *
 * COMPATIBLE SIGNATURES
 *
 * -  Why does this work? Remember that interface methods in this example are abstract and define the “behavior” that the
 *    class implementing the interface must have.
 *
 * - If two abstract interface methods have identical behaviors—or in this case the same method signature— creating a class
 *   that implements one of the two methods automatically implements the second method.
 *
 * -  In this manner, the interface methods are considered duplicates since they have the same signature.
 *
 * - What happens if the two methods have different signatures? If the method name is the same but the input parameters
 *   are different, there is no conflict because this is considered a method overload.
 */

interface Vegetarian {
    public int eatVegetables (int quantity);
}

interface MeatEater {
    public void eatVegetables();
}

class Human implements Vegetarian, MeatEater {
    public int eatVegetables (int quantity) {
        return quantity;
    }

    public void eatVegetables () {
        System.out.println("Yummy");
    }
}

/**
 * In this example, we see that the class that implements both interfaces must provide implements of both versions of
 * eatPlants(), since they are considered separate methods.
 *
 * Notice that it doesn’t matter if the return type of the two methods is the same or different, because the compiler
 * treats these methods as independent.
 *
 * Unfortunately, if the method name and input parameters are the same but the return types are different between the
 * two methods, the class or interface attempting to inherit both interfaces will not compile.
 *
 * It is not possible in Java to define two methods in a class with the same name and input parameters but different
 * return types. Given the following two interface definitions for Herbivore and Omnivore, the following code will not
 * compile:
 *
 */


interface Veggie {
    public int getFood ();
}

interface Carnivore {
    public void getFood() ;
}

// DOES NOT COMPILE
/*class Crocodile implements Veggie, Carnivore {
  public int getFood() {
        System.out.println("Eating plants: 10");
        return 10;
    }

    public void getFood() {
        System.out.println("Eating Food");
    }

}*/

/**
 * - The code doesn’t compile, as the class defines two methods with the same name and input parameters but different
 *    return types.
 *
 * - If we were to remove either definition of eatPlants(), the compiler would stop because the definition of Bear
 *   would be missing one of the required methods.
 *
 * - In other words, there is no implementation of the Bear class that inherits from Herbivore and Omnivore that the
 *   compiler would accept.
 *
 * - The compiler would also throw an exception if you define an interface or abstract class that inherits from two
 *   conflicting interfaces, as shown here:
 *
 */


interface Reptilee {
    public int getWeight ();
}

interface Venomous {
    public void getWeight ();
}

//Code will not compile unless one of the above methods return type is changed
//interface KingCobra extends Reptilee, Venomous {  }
//abstract class Taipan implements Reptilee, Venomous {  }

/**
 * INTERFACE VARIABLES
 *
 * - Let’s expand our discussion of interfaces to include interface variables, which can be defined within an interface.
 * - Like interface methods, interface variables are assumed to be public.
 * - Unlike interface methods, though, interface variables are also assumed to be static and final.
 *
 * Two interface variable rules:
 *
 * - Interface variables are assumed to be public, static, and final. Therefore, marking a variable as private or
 *   protected will trigger a compiler error, as will marking any variable as abstract.
 *
 * - The value of an interface variable must be set when it is declared since it is marked as final.
 *
 * - In this manner, interface variables are essentially constant variables defined on the interface level. Because they
 *   are assumed to be static, they are accessible even without an instance of the interface.
 *
 * - Like our earlier CanFly example, the following two interface definitions are equivalent, because the compiler will
 *   automatically convert them both to the second example:

 */

interface CanSwim {
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";

    //public static final int MAXIMUM_DEPTH = 100;
    //public static final boolean UNDERWATER = true;
    //public static final String TYPE = "Submersible";

}

interface CanDig {
    //private int MAXIMUM_DEPTH = 100; does not compile
    //protected abstract boolean UNDERWATER = false; does not compile
    //public static String TYPE ; does not compile
}

/**
 * DEFAULT INTERFACE METHODS
 *
 * - With the release of Java 8, the authors of Java have introduced a new type of method to an interface, referred to
 *   as a default method.
 *
 * - A default method is a method defined within an interface with the default keyword in which a method body is provided.
 *
 * - Contrast default methods with “regular” methods in an interface, which are assumed to be abstract and may not have
 *   a method body.
 *
 * - A default method within an interface defines an abstract method with a default implementation.
 *
 * - In this manner, classes have the option to override the default method if they need to, but they are not required
 *   to do so.
 *
 * - If the class doesn’t override the method, the default implementation will be used. In this manner, the method
 *   definition is concrete, not abstract.
 *
 */

interface IsWarmBlooded {

    boolean hasScales ();
    public default double getTemperature () {
        return 10.0;
    }
    //NOTE: Both methods are assumed to be public like all methods defined within interfaces
    // Any class that implements IsWarmBlooded interface may rely on the default implementation of getTemperature()
    // or override it to create its own version
}

/**
 * - Note that the default access modifier as defined in Chapter 4 is completely different from
 *   the default method defined in this chapter.
 *
 * - We defined a default access modifier in Chapter 4 as lack of an access modifier, which indicated a class may access
 *   a class, method, or value within another class if both classes are within the same package.
 *
 * - In this chapter, we are specifically talking about the keyword default as applied to a method within an interface.
 *   Because all methods within an interface are assumed to be public, the access modifier for a default method is
 *   therefore public.
 *
 * DEFAULT INTERFACE METHODS RULES:
 *
 * 1. A default method may only be declared within an interface and not within a class or abstract class.
 * 2. A default method must be marked with the default keyword. If a method is marked as default, it must provide
 *    a method body.
 * 3. A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that
 *    implements the interface.
 *
 * 4. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private
 *    or protected.
 *
 *
 */

interface Predator {


/*
    Code does not compile
    public default void eatMeat();
    public int getRequiredFoodAmount () {
        return 13;
    }
*/

    void eatMeat();
    default int getRequiredFoodAmount () {
        return 20;
    }

}

/**
 *
 * FURTHER RULES
 *
 * - Unlike interface variables, which are assumed static class members, default methods cannot be marked as static and
 *   require an instance of the class implementing the interface to be invoked.
 *
 * - They can also not be marked as final or abstract, because they are allowed to be overridden in subclasses but are
 *   not required to be overridden.
 *
 * - When an interface extends another interface that contains a default method, it may choose to ignore the default
 *   method, in which case the default implementation for the method will be used.
 *
 * - Alternatively, the interface may override the definition of the default method using the standard rules for method
 *   overriding, such as not limiting the accessibility of the method and using covariant returns.
 *
 * - Finally, the interface may redeclare the method as abstract, requiring classes that implement the new interface to
 *   explicitly provide a method body.
 *
 * - Analogous options apply for an abstract class that implements an interface.
 * - For example, the following class overrides one default interface method and redeclares a second interface method as
 *   abstract:
 */

interface HasFins {
    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength () {
        return 20.0;
    }
    public default boolean doFinsHaveScales () {
        return true;
    }
}

interface SharkFamily extends HasFins {
    public default int getNumberOfFins () {
        return 8;
    }

    public double getLongestFinLength();

/*    public boolean doFinsHaveScales () {
    does not compile because it lacks default keyword
    }*/

    public default boolean doFinsHaveScales () {
        return false;
    }
}

/**
 * DEFAULT METHODS AND MULTIPLE INHERITANCE
 *
 * - You may have realized that by allowing default methods in interfaces, coupled with the fact a class may implement
 *   multiple interfaces, Java has essentially opened the door to multiple inheritance problems. For example, what value
 *   would the following code output?
 */

interface Walk {
    public default int getSpeed () {
        return 5;
    }
}

interface Run {
     public default int getSpeed () {
        return 10;

    }
}

class SmallCat implements Walk, Run {

    public int getSpeed () {
        return 20;
    } // ambiguity has been removed. Therefore, code compiles without issue
    public static void main(String[] args) {
        System.out.println(new SmallCat().getSpeed());
    }
}

/**
 * - In this example, Cat inherits the two default methods for getSpeed(), so which does it use?
 * - Since Walk and Run are considered siblings in terms of how they are used in the Cat class, it is not clear whether
 *   the code should output 5 or 10.
 *
 * - If a class implements two interfaces that have default methods with the same name and signature, the compiler will
 *   throw an error.
 *
 * - There is an exception to this rule, though: if the subclass overrides the duplicate default methods, the code will
 *   compile without issue—the ambiguity about which version of the method to call has been removed.
 *
 * - You can see that having a class that implements or inherits two duplicate default methods forces the class to
 *   implement a new version of the method, or the code will not compile. This rule holds true even for abstract classes
 *   that implement multiple interfaces, because the default method could be called in a concrete method within the abstract
 *   class.
 */

interface Fly {
    public default double getAltitudeInMeters () {
        return 1066.3;
    }
}

interface Hunt {
    public default double getAltitudeInMeters () {
        return 532.52;
    }
}

 abstract class PeregrineFalcon implements Fly, Hunt {

    public double getAltitudeInMeters () {
        return 3214.24;
    }

    public static void main(String[] args) {

    }
}

/**
 *   STATIC INTERFACE METHODS
 *
 * - Java 8 also now includes support for static methods within interfaces.
 *
 * - These methods are defined explicitly with the static keyword and function nearly identically to static methods
 *   defined in classes, as discussed in Chapter 4.
 *
 * - In fact, there is really only one distinction between a static method in a class and an interface.
 * - A static method defined in an interface is not inherited in any classes that implement the interface.
 *
 * RULES
 *
 * 1. Like all methods in an interface, a static method is assumed to be public and will not
 *    compile if marked as private or protected.
 *
 * 2. To reference the static method, a reference to the name of the interface must be used.
 *
 *
 */

interface Hop {
    static int getJumpHeight () {
        return 8;
    }

    /**
     * - The method getJumpHeight() works just like a static method as defined in a class. In other words, it can be
     *   accessed without an instance of the class using the Hop.getJumpHeight() syntax.
     *
     * - Also, note that the compiler will automatically insert the access modifier public since all methods in interfaces
     *   are assumed to be public.
     *
     *
     */
}

class Bunny implements Hop {


    public void printDetails () {
        // System.out.println(getJumpHeight()); does not compile without an explicit reference to the name of the interface
        System.out.println(Hop.getJumpHeight());
    }
}

/**
 *
 * - It follows, then, that a class that implements two interfaces containing static methods with the same signature will
 *   still compile at runtime, because the static methods are not inherited by the subclass and must be accessed with a
 *   reference to the interface name.
 *
 * - Contrast this with the behavior you saw for default interface methods in the previous sec- tion: the code would compile
 *   if the subclass overrode the default methods and would fail to compile otherwise.
 *
 * - You can see that static interface methods have none of the same multiple inheritance issues and rules as default
 *   interface methods do.
 *
 * -
 */
