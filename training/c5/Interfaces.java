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
private final interface CanCrawl {
    private void dig(int depth);
    protected abstract double depth();
    public final void surface();
}
*/








