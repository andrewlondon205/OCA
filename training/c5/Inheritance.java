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

