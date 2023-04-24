package c4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * LAMBDAS
 *
 * - Functional programming uses lambda expressions to write code. A lambda expression is a block of code that gets passed around.
 * - You can think of a lambda expression as an anonymous method.
 * - It has parameters and a body just like full-fledged methods do, but it doesn’t have a name like a real method.
 * -
 */
public class Lambdas {
    public static void main(String[] args) {

    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop () {return canHop; }
    public boolean canSwim () {return canSwim; }
    public String toString () {return species; }

}


interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test (Animal a) {
        return a.canHop();
    }
}

class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true, false));
        animals.add(new Animal("turtle",false,true));

        print(animals, new CheckIfHopper());
        // print(animals, a -> a.canSwim());
        // print(animals, a -> ! a.canSwim());

    }

    private static void print (List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if(checker.test(animal));
            System.out.print (animal + " ");
        }
        System.out.println();
    }
}

/**
 * LAMBDA SYNTAX
 *
 * - Let’s look at what is going on here. The first example  has three parts:
 *                   a -> a.canHop();
 *
 * -> Specify a single parameter with the name a
 * -> The arrow operator to separate the parameter and body
 * -> A body that calls a single method and returns the result of that method
 *
 * The second example also has three parts; it’s just more verbose:
 *              (Animal a) -> {return a.canHop();}
 *
 * - The parentheses can only be omitted if there is a single parameter and its type is not explicitly stated.
 * - Java does this because developers commonly use lambda expressions this way and they can do as little typing as possible.
 * - It shouldn’t be news to you that we can omit braces when we only have a single statement.
 * - We did this with if statements and loops already.
 * - Java doesn’t require you to type return or use a semicolon when no braces are used.
 * - This special shortcut doesn’t work when we have two or more statements.
 * -
 *
 *  print(() -> true);                                      0P
 *  print(a -> a.startsWith("test"));                       1P
 *  print((String a) -> a.startsWith("test"));              1P
 *  print((a, b) -> a.startsWith("test"));                  2P
 *  print((String a, String b) -> a.startsWith("test"));    2P
 *
 *  print(a, b -> a.startsWith("test")); does not compile (parenthesis is missing)
 *  print(a -> { a.startsWith("test"); }); does not compile (return statement is missing)
 *  print(a -> { return a.startsWith("test") }); does not compile (semicolon is missing)
 *
 *  (a, b) -> {int a = 0; return 5; } cannot redefine variables using parameter names;
 *  (a, b) -> {int c = 0; return 5;} no issue
 *
 */

/**
 * PREDICATES
 *
 * - In our earlier example, we created an interface with one method:
 *      boolean test(Animal a);
 *
 * - Lambdas work with interfaces that have only one method. These are called functional interfaces—interfaces that can
 *   be used with functional programming.
 *
 * - You can imagine that we’d have to create lots of interfaces like this to use lambdas.
 * - We want to test Animals and Strings and Plants and anything else that we come across.
 * - Luckily, Java recognizes that this is a common problem and provides such an interface for us. It’s in the package
 *   java.util.function and the gist of it is as follows:
 *
 *   public interface Predicate<T> {
 *      boolean test(T t);
 *   }
 */

class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("elephant",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("dog",true,true));

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
        print(animals, f -> f.toString().length() > 1 && f.toString().length() <= 4);


    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print (animal + " ");
        }
        System.out.println();
    }
}

