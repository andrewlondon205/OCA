package c5;

/**
 * UNDERSTANDING ABSTRACT CLASSES
 *
 *
 * - An abstract class is a class that is marked with the abstract keyword and cannot be instantiated.
 * - An abstract method is a method marked with the abstract keyword defined in an abstract class, for which no
 *   implementation is provided in the class in which it is declared.
 * -
 */

public class AbstractClasses {
    public static void main(String[] args) {

    }
}

abstract class AlphaAnimal {
    protected int age;
    public void eat () {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}

class Swan extends AlphaAnimal {
    public String getName () {
        return "Swan";
    }

}

/**
 * DEFINING AN ABSTRACT CLASS
 *
 * - The previous sample code illustrates a number of important rules about abstract classes.
 * - For example, an abstract class may include nonabstract methods and variables, as you saw with the variable age and
 *   the method eat().
 * - In fact, an abstract class is not required to include any abstract methods. For example, the following code compiles
 *   without issue even though it doesn’t define any abstract methods:
 *
 * - Although an abstract class doesn’t have to implement any abstract methods, an abstract method may only be defined
 *   in an abstract class.
 */

abstract class Cow {  }
class Chicken {
  //  public abstract void peck() ; causes compilation failure
}

/**
 * Exam creators are fond  of questions like this one, which mixes non-abstract classes with abstract methods.
 */

abstract class Turtle {
    //public abstract void swim() {} does not compile because abstract methods cannot have a body
    //public abstract int getAge() {return 10; } does not compile
}

/**
 * - Although you can’t provide a default implementation to an abstract method in an abstract class, you can still define
 *   a method with a body—you just can’t mark it as abstract.
 *
 * - As long as you do not mark it as final, the subclass still has the option to override it, as explained in the previous
 *   section.
 *
 * - Next, we note that an abstract class cannot be marked as final for a somewhat obvious reason. By definition, an
 *   abstract class is one that must be extended by another class to be instantiated, whereas a final class can’t be
 *   extended by another class.
 *
 * - By marking an abstract class as final, you’re saying the class can never be instantiated, so the compiler refuses
 *   to process the code. For example, the following code snippet will not compile:
 */

// final abstract class Tortoise { } does not compile

/**
 * ABSTRACT METHODS CANNOT BE MARKED AS FINAL
 *
 * - Likewise, an abstract method may not be marked as final for the same reason that an abstract class may not be
 *   marked as final.
 * - Once marked as final, the method can never be overridden in a subclass, making it impossible to create a concrete
 *   instance of the abstract class.
 *
 */

abstract class Goat {
    // public abstract final void chew (); does not compile
}

/**
 *
 * ABSTRACT METHODS CANNOT BE MARKED AS PRIVATE
 *
 * - Finally, a method may not be marked as both abstract and private. This rule makes sense if you think about it.
 * - How would you define a subclass that implements a required method if the method is not accessible by the subclass
 *   itself?
 *
 * - The answer is you can’t, which is why the compiler will complain if you try to do the following:
 */

abstract class MyWhale {
    // private abstract void sing (); does not compile
    protected abstract void sing();
}

class HumpBackWhale extends MyWhale {
/*    private void sing () {
        System.out.println("Humpback Whale is singing"); does not compile because method visibility has been reduced
    }*/

    protected void sing () {
        System.out.println("WHOOOOO");
    }
}

/**
 * CREATING CONCRETE CLASSES
 *
 * - When working with abstract classes, it is important to remember that by themselves, they cannot be instantiated and
 *   therefore do not do much other than define static variables and methods.
 *
 * - For example, the following code will not compile as it is an attempt to instantiate an abstract class.
 */

abstract class Eel {
    public static void main(String[] args) {
      //  final Eel eel = new Eel() ; does not compile because abstract classes cannot be instantiated
    }
}

/**
 * - An abstract class becomes useful when it is extended by a concrete subclass. A concrete class is the first non-abstract
 *   subclass that extends an abstract class and is required to implement all inherited abstract methods.
 *
 * - When you see a concrete class extending an abstract class on the exam, check that it implements all of the required
 *   abstract methods.
 */

abstract class Band {
    public abstract String getName ();
}

class RockBand extends Band {
    public String getName () {
        return "ACDC";
    }
}

/**
 * - First, note that Band is marked as abstract and RockBand is not. In this example, RockBand is considered the first
 *   concrete subclass of Animal.
 *
 * - Second, since RockBand is the first concrete subclass, it must implement all inherited abstract methods, getName(),
 *
 * - The key point is that the first class to extend the nonabstract class must implement all inherited abstract methods.
 *   For example, the following variation will also not compile:
 */

abstract class Computer {
    public abstract String getName();
}

/*class Laptop extends Computer {
does not compile
}*/

abstract class Laptop extends Computer {
    // it compiles if we mark the class as abstract
}



class NoteBook extends Laptop {
    public String getName() {
        return "Macbook Pro";
    }
}

// Even though a second subclass Notebook implements the abstract method getName(), the first concrete subclass Laptop doesn't

/**
 * EXTENDING AN ABSTRACT CLASS
 *
 * - Let’s expand our discussion of abstract classes by introducing the concept of extending an abstract class with
 *   another abstract.
 */

abstract class Food {
    public abstract String getName ();
}

/*class VeganFood extends Food {

}*/

abstract class DairyFood extends Food {

}

/**
 * - In this example, we have an abstract class Food, with a concrete subclass VeganFood that doesn't compile since it
 *   doesn't implement a getName() method.
 *
 * - We also have an abstract class DairyFood, which like VeganFood extends Food and doesn't provide an implementation
 *   for getName().
 *
 * - In this situation, DairyFood does compile because it is marked as abstract while VeganFood doesn't compile
 *
 * - It follows, then, that a concrete class that extends an abstract class must implement all inherited abstract methods.
 */

abstract class LandAnimal {
    public abstract String getName();
}

abstract class BigCat extends LandAnimal {
    public abstract void roar();
}

class TheTiger extends BigCat {
    public String getName() {
        return "Tiger";
    }

    public void roar (){
        System.out.println("The Tiger lets out a loud ROAR");
    }
}

/**
 * - BigCat extends Animal, but it is marked as abstract; therefore, it is not required to provide an implementation for
 * getName() method.
 *
 * - The tiger class is not marked as abstract, and as first concrete subclass, it must implement all inherited abstract
 *   methods not defined in a parent class.
 *
 * EXCEPTION
 *
 * - A concrete subclass is not required to provide an implementation for an abstract method if an intermediate abstract
 *   class provides the implementation. For example, take a look at the following variation on our previous example:
 *
 */

abstract class AcquaticAnimal {
    public abstract Integer getLifeSpan ();

}

abstract class TheShark extends AcquaticAnimal {
    public Integer getLifeSpan () {
        return 65;
    }

    public abstract void hunt ();
}

class GreenLandShark extends TheShark {

    public void hunt () {
        System.out.println("It hunts small animals");
    }
}


/**
 * - if an intermediate class provides an implementation for an abstract method, that method is inherited by subclasses as
 *   a concrete method, not as an abstract one.
 *
 * - In other words, the subclasses do not consider it an inherited abstract method because it is no longer abstract by
 *   the time it reaches the subclasses.
 *
 * ABSTRACT CLASS DEFINITION RULES
 *
 * 1. Abstract classes cannot be instantiated directly.
 * 2. Abstract classes may be defined with any number, including zero, of abstract and non abstract methods.
 * 3. Abstract classes may not be marked as private or final.
 * 4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
 * 5. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.
 *
 * ABSTRACT METHOD DEFINITION RULES
 *
 * 1. Abstract methods may only be defined in abstract classes.
 * 2. Abstract methods may not be declared private or final.
 * 3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
 * 4. Implementing an abstract method in a subclass follows the same rules for overriding a method. For example, the name
 *    and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as
 *    the method in the parent class.
 */