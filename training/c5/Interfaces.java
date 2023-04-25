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
