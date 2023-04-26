package c5;

/**
 * INHERITANCE
 *
 * - When creating a new class in Java, you can define the class to inherit from an existing class. Inheritance is the
 *   process by which the new child subclass automatically includes any public or protected primitives, objects, or
 *   methods defined in the parent class.
 *
 * - For illustrative purposes, we refer to any class that inherits from another class as a child class, or a descendent
 *   of that class.
 *
 * - Alternatively, we refer to the class that the child inherits from as the parent class, or an ancestor of the class.
 *
 * - If child X inherits from class Y, which in turn inherits from class Z, then X would be considered an indirect child,
 *   or descendent, of class Z.
 *
 * - Java supports single inheritance, by which a class may inherit from only one direct parent class.
 *
 * - It is possible in Java to prevent a class from being extended by marking the class with the final modifier.
 */


public class Inheritance {
    public static void main(String[] args) {
    }
}

class Seal {

}

abstract class ElephantSeal extends Seal {
    // Methods and variables defined here
}

class Animal {
    private int age;
    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}

class Lion extends Animal {
    private void roar () {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
       //  System.out.println("The " + age + " year old lion says: Roar!"); does not compile because age is marked as private in animal class
    }

    /**
     * - Despite the fact that age is inaccessible by the child class, if we have an instance of a Lion object, there is
     *   still an age value that exists within the instance.
     *
     * - The age value just cannot be directly referenced by the child class nor any instance of the class.
     *
     * - In this manner, the Lion object is actually “bigger” than the Animal object in the sense that it includes all the properties of the Animal object
     */

}

/**
 * ACCESS MODIFIERS
 *
 * - As discussed in Chapter 4, you can apply access modifiers (public, private, protected, default) to both class methods
 *   and variables.
 * - It probably comes as no surprise that you can also apply access modifiers to class definitions, since we have been
 *   adding the public access modifier to nearly every class up to now.
 *
 * - The public access modifier applied to a class indicates that it can be referenced and used in any class.
 * - The default package private modifier, which is the lack of any access modifier, indicates the class can be accessed
 *   only by a subclass or class within the same package.
 * - As you know, a Java file can have many classes but at most one public class.
 *
 * - In fact, it may have no public class at all. One feature of using the default package private modifier is that you
 *   can define many classes within the same Java file.
 *
 * - The rules for applying class access modifiers are identical for interfaces. There can be at most one public class
 *   or interface in a Java file.
 */

/**
 * CREATING JAVA OBJECTS
 *
 * - In Java, all classes inherit from a single class, java.lang.Object. Furthermore, java.lang.Object is the only class
 *   that doesn’t have any parent classes.
 *
 * - Compiler adds "extends java.lang.Object" when we don't indicate that our class extends another class/
 *
 * - The key is that when Java sees you define a class that doesn’t extend another class, it immediately adds the syntax
 *   extends java.lang.Object to the class definition.
 *
 * - If you define a new class that extends an existing class, Java doesn’t add this syntax, although the new class still
 *   inherits from java.lang.Object. Since all classes inherit from java.lang.Object, extending an existing class means
 *   the child automatically inherits from java.lang.Object by construction.
 *
 * - This means that if you look at the inheritance structure of any class, it will always end with java.lang.Object on
 *   the top of the tree, as shown in the following diagram.
 *
 *                                                      java.lang.Object
 *                                                              |
 *                                                              |
 *                                                           Mammal
 *                                                             |
 *                                                             |
 *                                                            OX
 */

class Zoo extends java.lang.Object {  }

/**
 * DEFINING CONSTRUCTORS
 *
 * - As you may recall from Chapter 4, every class has at least one constructor. In the case that no constructor is
 *   declared, the compiler will automatically insert a default no-argument constructor.
 *
 * - In the case of extending a class, though, things are a bit more interesting.
 *
 * - In Java, the first statement of every constructor is either a call to another constructor within the class, using
 *   this(), or a call to a constructor in the direct parent class, using super().
 *
 * - If a parent constructor takes arguments, the super constructor would also take arguments.
 */

class Creature {
    private int age;
    public Creature(int age) {
        super();
        this.age = age;
    }
}

class Zebra extends Creature {
    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }
}

class TheZoo {
    public TheZoo () {
        //System.out.println("Zoo created")
        super(); // does not compile if a statement appears before super() or this() in a constructor
        // super() cannot appear twice

    }
}

/**
 * - if the parent class has more than one constructor, the child class may use any valid parent constructor in its definition,
 *   as shown in the following example:
 */

class TheAnimal {
    private int age;
    private String name ;
    public TheAnimal (int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public TheAnimal (int age) {
        super();
        this.age= age;
        this.name = null;
    }
}

class Gorilla extends TheAnimal {
    public Gorilla (int age) {
        super(age,"Gorilla");
    }

    public Gorilla () {
        super(5);
    }

    // Note: child constructors are not required to call matching parent constructors.
    // Any valid parent constructor is acceptable as long as the appropriate input parameters to the parent constructor are provided.
}

/**
 * COMPILER ENHANCEMENTS
 *
 * - Up to now, we defined numerous classes that did not explicitly call the parent construc- tor via the super()
 *   keyword, so why did the code compile?
 *
 * - The answer is that the Java compiler automatically inserts a call to the no-argument constructor super() if the
 *   first statement is not a call to the parent constructor.
 *
 * - For example, the following three class and constructor definitions are equivalent, because the compiler will
 *   automatically convert them all to the last example:
 *
 *   public class Donkey { }
 *   public class Donkey {
 *    public Donkey() { }
 *   }
 *   public class Donkey {
 *    public Donkey() {
 *     super();
 *    }
 *  }
 *
 */

/**
 * - What happens if the parent class doesn’t have a no-argument constructor?
 * - Recall that the no-argument constructor is not required and only inserted if there is no constructor defined
 *   in the class.
 *
 * - In this case, the Java compiler will not help and you must create at least one constructor in your child class
 *   that explicitly calls a parent constructor via the super() command.
 *
 */

class Mammal {
    public Mammal (int age) {
    }

}

class Elephant extends Mammal {
    public Elephant () {
        super(20);
        /*
          if we remove the call to the parent constructor, code doesn't compile because the compiler cannot add a constructor
          other than the no-args constructor.
         */
    }
}

/**
 * REVIEWING CONSTRUCTOR RULES
 *
 * 1. The first statement of every constructor is a call to another constructor within the class using this(), or a call
 *    to a constructor in the direct parent class using super().
 *
 * 2. The super() call may not be used after the first statement of the constructor.
 * 3. If no super() call is declared in a constructor, Java will insert a no-argument super() as the first statement
 *    of the constructor.
 *
 * 4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any constructors, the compiler
 *    will throw an error and try to insert a default no-argument constructor into the child class.
 *
 * 5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit call to a parent constructor
 *    in each child constructor.
 *
 * Note: Make sure you understand these rules; the exam will often provide code that breaks one or many of these rules
 *       and therefore doesn’t compile.
 */

/**
 * CALLING CONSTRUCTORS
 *
 * In Java, the parent constructor is always executed before the child constructor. For example, try to determine
 * what the following code outputs:
 */

class Primate {
    public Primate () {
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape () {
        System.out.println("Ape");
    }
}

class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}

/**
 * CALLING INHERITED CLASS MEMBERS
 * - Java classes may use any public or protected member of the parent class, including methods, primitives, or object
 *   references.
 *
 * - If the parent class and child class are part of the same package, the child class may also use any default members
 *   defined in the parent class.
 *
 * - Finally, a child class may never access a private member of the parent class, at least not through any direct reference.
 *
 * - As you saw in the first example in this chapter, a private member age may be accessed indirectly via a public or
 *   protected method.
 *
 * - To reference a member in a parent class, you can just call it directly, as in the following example with the output
 *   function displaySharkDetails():
 */

class Fish {
    protected int size;
    private int age;
    public Fish (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }
}

class Shark extends Fish {
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails () {
        System.out.print("Shark with age:" + getAge() );
        System.out.print(" and " + size + " meters long");
        System.out.print("with " + numberOfFins + " fins");

        System.out.print("Shark with age:" + this.getAge() );
        System.out.print(" and " + this.size + " meters long");
        System.out.print("with " + this.numberOfFins + " fins");

        System.out.print("Shark with age:" + super.getAge() );
        System.out.print(" and " + super.size + " meters long");
        System.out.print("with " + this.numberOfFins + " fins");
        // System.out.print("with " + super.numberOfFins + " fins"); does not compile because numberOfFins doesn't exist in the parent class

    }
}

/**
 * INHERITING METHODS
 *
 * - Inheriting a class grants us access to the public and protected members of the parent class, but also sets the stage
 *   for collisions between methods defined in both the parent class and the subclass.
 *
 * - In this section, we’ll review the rules for method inheritance and how Java handles such scenarios.
 *
 * METHOD OVERRIDING
 *
 * - What if there is a method defined in both the parent and child class? For example, you may want to define a new
 *   version of an existing method in a child class that makes use of the definition in the parent class.
 *
 * - In this case, you can override a method by declaring a new method with the signature and return type as
 *   the method in the parent class.
 *
 * - When you override a method, you may reference the parent version of the method using the super keyword. In this manner,
 *   the keywords this and super allow you to select between the current and parent version of a method, respectively.
 * -
 */

class Canine {

    public double getAverageWeight () {
        return 50;
    }

}

class Wolf extends Canine{
    public double getAverageWeight () {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {

        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());

        //without super keyword, we would go in infinite recursion
    }
}

/**
 * OVERRIDING RULES
 *
 *  1. The method in the child class must have the same signature as the method in the parent class.
 *  2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
 *  3. The method in the child class may not throw a checked exception that is new or broader than the class of any
 *     exception thrown in the parent class method.
 *  4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as
 *     covariant return types.
 */

/**
 * OVERRIDING VS OVERLOADING
 *
 * - Overloading a method and overriding a method are similar in that they both involve redefining a method using the
 *   same name.
 *
 * - They differ in that an overloaded method will use a different signature than an overridden method.
 * - This distinction allows overloaded methods a great deal more freedom in syntax than an overridden method would have.
 *
 *
 */

class Bird {
    public void fly () {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

class Eagle extends Bird {
    public int fly (int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

/*    public int eat(int food) {
        System.out.println("Bird is eating " + food + " units of food"); does not compile because return type is not covariant
        return food;
    }*/

    public void eat (int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

class Camel {
    protected String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel {
    /* private int getNumberOfHumps () { // does not compile because the return type is not covariant, and it's less vissible
         return 2;
    }*/
    public String getNumberOfHumps() {
        return "Overriden method";
    }

    public static void main(String[] args) {
        System.out.println(new Camel().getNumberOfHumps()); // undefined
        Camel c = new BactrianCamel();
        System.out.println(c.getNumberOfHumps()) ; // Overridden method
    }
}

class InsufficientDataException extends Exception  { }

class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight () throws Exception  {
        return 2;
    }

    protected double getHeight () throws InsufficientDataException {
        return 2;
    }

    protected int getLength () {
        return 10;
    }
}

class Snake extends Reptile {
    protected boolean hasLegs () {
        return false;
    }

    protected double getWeight () throws InsufficientDataException {
        return 2;
    }


/*    protected double getHeight () throws Exception {
        return 4;
    }

    protected int getLength() throws InsufficientDataException {
        return 10;

        these methods don't compile because they violate the rules for overriding methods
    }*/

    protected double getHeight() throws InsufficientDataException {
        return 21;
    }

    protected int getLength () {
        return 124;
    }
}

/**
 * RE-DECLARING PRIVATE METHODS
 *
 * - The previous section defined the behavior if you override a public or protected method in the class. Now let’s expand
 *   our discussion to private methods.
 *
 * - In Java, it is not possible to override a private method in a parent class since the parent method is not accessible
 *   from the child class.
 *
 * - Just because a child class doesn’t have access to the parent method, doesn’t mean the child class can’t define its
 *   own version of the method. It just means, strictly speaking, that the new method is not an overridden version of
 *   the parent class’s method.
 *
 * - Java permits you to redeclare a new method in the child class with the same or modified signature as the method
 *   in the parent class.
 *
 * - This method in the child class is a separate and independent method, unrelated to the parent version’s method, so
 *   none of the rules for overriding methods are invoked.
 *
 * - For example, let’s return to the Camel example we used in the previous section and show two related classes that
 *   define the same method:
 */

class Whale {
    private String getName () {
        return "A random Whale";
    }
}

class BlueWhale extends Whale {
    private String getName () {
        return "A blue Whale";
    }
}

//Code compiles without issue. The method getName() has not been overridden, but hidden.
//If the method in the parent class were public, protected or package-private, then the code would not compile

/**
 * HIDING STATIC METHODS
 *
 * - A hidden method occurs when a child class defines a static method with the same name and signature as a static
 *   method defined in a parent class.
 *
 * - Method hiding is similar but not exactly the same as method overriding. First, the four previous rules for
 *   overriding a method must be followed when a method is hidden.
 *
 * - In addition, a new rule is added for hiding a method, namely that the usage of the static keyword must be the same
 *   between parent and child classes. The following list summarizes the five rules for hiding a method:
 *
 * 1. The method in the child class must have the same signature as the method in the parent class.
 *
 * 2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
 *
 * 3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception
 *    thrown in the parent class method.
 *
 * 4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as
 *    covariant return types.
 *
 * 5. The method defined in the child class must be marked as static if it is marked as static in the parent class
 *    (method hiding). Likewise, the method must not be marked as static in the child class if it is not marked as static
 *    in the parent class (method overriding).
 *
 * - Note that the first four are the same as the rules for overriding a method.
 */

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate () {
        System.out.println("Bear is hibernating");
    }
}

class Gryzzly extends Bear {
    public static void eat() {
        System.out.println("Gryzzly bear is chewing");
    }

/*
    public void sneeze () {
        System.out.println("Gryzzly bear sneezes quietly");
    }

    public static void hibernate () {
        System.out.println("Grizzly bear is going to sleep");
    }

    Code doesnot compile because it violates the 5th rule of static method hiding
*/

    public static void sneeze() {
        System.out.println("Gryzzly bear sneezes quietly");
    }

    public void hibernate() {
        System.out.println("Grizzly bear is going to sleep");
    }
    public static void main(String[] args) {
        Gryzzly.eat();
    }
}

/**
 * OVERRIDING VS HIDING METHODS
 *
 * - In our description of hiding of static methods, we indicated there was a distinction between overriding and hiding methods.
 *
 * - Unlike overriding a method, in which a child method replaces the parent method in calls defined in both the parent
 *   and child, hidden methods only replace parent methods in the calls defined in the child class.
 *
 * - At runtime the child version of an overridden method is always executed for an instance regardless of whether the
 *   method call is defined in a parent or child class method.
 *
 * - In this manner, the parent method is never used unless an explicit call to the parent method is referenced, using
 *   the syntax ParentClassName.method().
 *
 * - Alternatively, at runtime the parent version of a hidden method is always executed if the call to the method is
 *   defined in the parent class. Let’s take a look at an example:
 */

class Marsupial {
    public static boolean isBiped () {
        return false;
    }

    public void getMarsupialDescription () {
        System.out.println("Marsupial walks on two legs " + isBiped());
    }
}

//Method hiding example
class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        Marsupial map = new Marsupial();
        System.out.println(Marsupial.isBiped());
        System.out.println(joey.isBiped());
    }
}

/**
 * - Notice that isBiped() returns false in the parent class and true in the child class.
 *   In the first method call, the parent method getMarsupialDescription() is used.
 *
 * - The Marsupial class only knows about isBiped() from its own class definition, so it outputs false.
 *
 * - In the second method call, the child executes a method of isBiped(), which hides the parent method’s version and
 *   returns true.
 *
 *
 */

class Feline {
    public boolean isQuadruped () {
        return false;
    }

    public void getFelineDescription () {
        System.out.println("Feline walks on four legs: " + isQuadruped());
    }
}

class Tiger extends Feline {
    public boolean isQuadruped () {
        return true;
    }

    public void getTigerDescription () {
        System.out.println("Tiger walks on four legs: " + isQuadruped());
    }

    public static void main(String[] args) {

        Tiger t = new Tiger();
        t.getFelineDescription();
        t.getTigerDescription();
    }
}

/**
 * - In this example, the isBiped() method is overridden, not hidden, in the child class.
 *
 * - Therefore, it is replaced at runtime in the parent class with the call to the child class’s method.
 *
 * - Make sure you understand these examples as they show how hidden and overridden methods are fundamentally
 *   different. This example makes uses of polymorphism, which we’ll discuss later in this chapter.
 *
 */

/**
 * CREATING FINAL METHODS
 * - We conclude our discussion of method inheritance with a somewhat self-explanatory rule:
 * - final methods cannot be overridden. If you recall our discussion of modifiers from Chapter 4, you can create a
 *   method with the final keyword.
 * - By doing so, though, you for- bid a child class from overriding this method.
 * - This rule is in place both when you override a method and when you hide a method.
 * - In other words, you cannot hide a static method in a parent class if it is marked as final.
 */

class TheBird {
    public final boolean hasFeathers() {
        return true;
    }
}

class Penguin extends TheBird {
    /*  public final boolean hasFeathers () {
        return false;
        Does not compile because final methods cannot be overridden
    }*/
}

/**
 * INHERITING VARIABLES
 *
 * - As you saw with method overriding, there were a lot of rules when two methods have the same signature and are
 *   defined in both the parent and child classes.
 * - Luckily, the rules for variables with the same name in the parent and child classes are a lot simpler, because Java
 *   doesn’t allow variables to be overridden but instead hidden.
 *
 * HIDING VARIABLES
 *
 * - When you hide a variable, you define a variable with the same name as a variable in a parent class. This creates
 *   two copies of the variable within an instance of the child class: one instance defined for the parent reference and
 *   another defined for the child reference.
 *
 * - As when hiding a static method, you can’t override a variable; you can only hide it
 *
 * - Also similar to hiding a static method, the rules for accessing the parent and child variables are quite similar.
 * - If you’re referencing the variable from within the parent class, the variable defined in the parent class is used
 * - Alternatively, if you’re referencing the variable from within a child class, the variable defined in the child class
 *   is used.
 * - Likewise, you can reference the parent value of the variable with an explicit use of the super keyword.
 *
 */

class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails () {
        System.out.println("[parentTail="+tailLength+"]");
    }
}

class Mouse extends Rodent{
    protected int tailLength = 8;
    public void getMouseDetails () {
        System.out.println("[tail=" + tailLength + " ,parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}

//VARIABLE HIDING

class MyAnimal {
    public int length = 2;
}

class JellyFish extends MyAnimal {
    public int length = 5;

    public static void main(String[] args) {
        JellyFish jellyFish = new JellyFish();
        MyAnimal myAnimal = new JellyFish();

        System.out.println(jellyFish.length);
        System.out.println(myAnimal.length);
    }
}

