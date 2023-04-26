package c5;

import jdk.jshell.JShell;

/**
 * POLYMORPHISM
 *
 * - Java supports polymorphism, the property of an object to take on many different forms.
 *
 * - To put this more precisely, a Java object may be accessed using a reference with the same type as the object,
 *   a reference that is a superclass of the object, or a reference that defines an interface the object implements,
 *   either directly or through a superclass.
 *
 *  - Furthermore, a cast is not required if the object is being reassigned to a super type or interface of the object.
 */


public class Polymorphism {
    public static void main(String[] args) {

    }
}

class Primate$ {
    public boolean hasHair () {
        return true;
    }
}

interface HasTail$ {
    public boolean isTailStripped();
}

class Lemur extends Primate$ implements HasTail$ {
    public boolean isTailStripped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail$ hasTail = lemur;
        System.out.println(hasTail.isTailStripped());

        Primate$ primate = lemur;
        System.out.println(primate.hasHair());

        /**
         * The most important thing to note about this example is that only one object, Lemur, is created and referenced.
         * The ability of an instance of Lemur to be passed as an instance of an interface it implements, HasTail, as well
         * as an instance of one of its superclasses, Primate, is the nature of polymorphism.
         *
         * Once the object has been assigned a new reference type, only the methods and variables available to that reference
         * type are callable on the object without an explicit cast. For example, the following snippets of code will not compile:
         */

       // System.out.println(hasTail.age) ; does not compile
       // System.out.println(primate.isTailStripped()); does not compile
    }
}

/**
 * OBJECTS VS REFERENCE
 *
 * - In Java, all objects are accessed by reference, so as a developer you never have direct access to the object itself.
 *
 * - Conceptually, though, you should consider the object as the entity that exists in memory, allocated by the Java
 *   runtime environment.
 *
 * - Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change.
 *
 * - For example, since all objects inherit java.lang.Object, they can all be reassigned to java.lang.Object, as shown
 *   in the following example:
 *
 */

class Serpent {
    public static void main(String[] args) {
        Serpent serpent = new Serpent();
        Object serpentAsObject = serpent;

        /**
         * Even though the Serpent object has been assigned a reference with a different type, the object itself has not
         * changed and still exists as a Serpent object in memory.
         *
         * What has changed is our ability to access methods within the Serpent class with the serpentAsObject reference
         *
         * Without an explicit cast back to serpent, we no longer have access to its properties.
         *
         * We can summarize this principle with the following two rules:
         *
         * 1. The type of the object determines which properties exist within the object in memory.
         * 2. The type of the reference to the object determines which methods and variables are accessible to the
         *    Java program.
         *
         * It therefore follows that successfully changing a reference of an object to a new reference type may give you
         * access to new properties of the object, but those properties existed before the reference change occurred.
         */
    }
}

/**
 * CASTING OBJECTS
 *
 * - In the previous example, we created a single instance of a Serpent object and accessed it via superclass and interface
 *   references.
 *
 * - Once we changed the reference type, though, we lost access to more specific methods defined in the subclass that
 *   still exist within the object.
 *
 * - We can reclaim those references by casting the object back to the specific sub- class it came from:
 *
 *      Primate primate = lemur;
 *      Lemur lemur2 = primate; // DOES NOT COMPILE
 *
 *      Lemur lemur3 = (Lemur)primate;
 *      System.out.println(lemur3.age);
 *
 * - In this example, we first try to convert the primate reference back to a lemur reference, lemur2, without
 *   an explicit cast.
 *
 * - The result is that the code will not compile. In the second example, though, we explicitly cast the object to a
 *   subclass of the object Primate and we gain access to all the methods available to the Lemur class.
 *
 * RULES
 *
 * 1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
 * 2. Casting an object from a superclass to a subclass requires an explicit cast.
 * 3. The compiler will not allow casts to unrelated types.
 * 4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not
 *    actually an instance of that class.
 */

class Bird$ { }

class Fish$ {
    public static void main(String[] args) {
        Fish$ fish = new Fish$();
        // Bird bird = (Bird)fish; does not compile because Bird and Fish are not related in any hierarchy
    }
}

/**
 * In this example, the classes Fish and Bird are not related through any class hierarchy that the compiler is aware of;
 * therefore, the code will not compile.
 *
 * Casting is not without its limitations. Even though two classes share a related hierarchy, that doesn’t mean an
 * instance of one can automatically be cast to another. Here’s an example:
 */

class Rodentt {  }

class Capybara extends Rodentt {
    public static void main(String[] args) {

        Rodentt rodentt = new Capybara();
        Capybara cap = (Capybara) rodentt; //fine

        Rodentt rodent = new Rodentt();
        Capybara capybara = (Capybara) rodent; // throws exception*/

        /**
         * This code creates an instance of Rodent and then tries to cast it to a subclass of Rodent, Capybara. Although
         * this code will compile without issue, it will throw a ClassCastException at runtime since the object being
         * referenced is not an instance of the Capybara class.
         *
         * The thing to keep in mind in this example is the object that was created is not related to the Capybara class
         * in any way.
         *
         *
         */

    }
}

/**
 * VIRTUAL METHODS
 *
 * - The most important feature of polymorphism—and one of the primary reasons we have class structure at all—is to support
 *   virtual methods.
 *
 * - A virtual method is a method in which the specific implementation is not determined until runtime.
 *
 * - In fact, all non-final, non- static, and non-private Java methods are considered virtual methods, since any of
 *   them can be overridden at runtime.
 *
 * - What makes a virtual method special in Java is that if you call a method on an object that overrides a method, you
 *   get the overridden method, even if the call to the method is on a parent reference or within the parent class.
 */

class MyBird {
    public String getName() {
        return "Unknown";
    }

    public void displayInformation () {
        System.out.println("The bird name is: " + getName());
    }
}

class Peacock extends MyBird {
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        MyBird myBird = new Peacock();
        myBird.displayInformation(); //the bird name is: Peacock

    }
}

/**
 * - As you saw in similar examples in the section “Overriding a Method,” the method getName() is overridden in the child
 *   class Peacock.
 *
 * - More importantly, though, the value of the getName() method at runtime in the displayInformation() method is replaced
 *   with the value of the implementation in the subclass Peacock.
 *
 * - In other words, even though the parent class Bird defines its own version of getName() and doesn’t know anything about
 *   the Peacock class during compile-time, at runtime the instance uses the overridden version of the method, as defined on
 *   the instance of the object.
 *
 * - We emphasize this point by using a reference to the Bird class in the main() method, although the result would have been
 *   the same if a reference to Peacock was used.
 *
 * - You now know the true purpose of overriding a method and how it relates to polymorphism.
 *
 * - The nature of the polymorphism is that an object can take on many different forms.
 *
 */

/**
 * POLYMORPHIC PARAMETERS
 *
 * - For example, you can define a method that takes an instance of an interface as a parameter. In this manner, any class
 *   that implements the interface can be passed to the method.
 *
 * - Since you’re casting from a subtype to a supertype, an explicit cast is not required. This property is referred to
 *   as polymorphic parameters of a method, and we demonstrate it in the following example:
 *
 */

class Reptile_ {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile_{
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile_ {
    public String getName() {
        return "Crocodile";
    }
}

class ZooWorker {
    public static void feed(Reptile_ reptile) {
        System.out.println("Feeding reptile: " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile_());
    }
}

/**
 * GOOD CODING PRACTICE
 *
 * List<Integer> numbers = new ArrayList<Integer>();
 *
 */

