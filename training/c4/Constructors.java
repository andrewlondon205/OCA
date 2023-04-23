package c4;

public class Constructors {

    public static void main(String[] args) {

    }
}

/**
 * - Constructors are used when creating a new object. This process is called instantiation because it creates a new
 * instance of the class.
 *
 * - A constructor is called when we write new followed by the name of the class we want to instantiate. For example:
 *  new Bunny();
 *
 * - When Java sees the new keyword, it allocates memory for the new object. Java also looks for a constructor and calls it.
 *
 * - A constructor is typically used to initialize instance variables. The this keyword tells Java you want to reference
 *   an instance variable.
 *
 * - Most of the time, this is optional. The problem is that sometimes there are two variables with the same name.
 */

class Bunny {
    private String color;
    private int height;
    private int length;
    public Bunny (String color) {
        this.color = color;
        System.out.println("constructor");
    }

    public Bunny (int length, int theHeight) {
        length = this.length;
        height = theHeight;
        this.color = "white";
    }

    //public bunny () {} does not compile because it doesn't match the name of the class
    public void Bunny () {}

    public static void main(String[] args) {

        Bunny b = new Bunny(1,2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}

/**
 * DEFAULT CONSTRUCTOR
 *
 * - Every class in Java has a constructor whether you code one or not. If you don’t include any constructors in the class,
 *   Java will create one for you without any parameters.
 * - This Java-created constructor is called the default constructor. Sometimes we call it the default no-arguments
 *   constructor for clarity. Here’s an example:
 */

class Rabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(); // Calls default constructor
    }
}

/**
 * - The default constructor has an empty parameter list and an empty body. It is fine for you to type this in
 *   yourself. However, since it doesn't do anything, Java is happy to supply it for you and save you some typing.
 *
 * - We keep saying generated. This happens during the compile step. If you look at the file with the .java extension,
 *   the constructor will still be missing.
 *
 * - It is only in the compiled file with the.class extension that it makes an appearance.
 *
 * - Remember that a default constructor is only supplied if there are no constructors present. Which of these classes
 *   do you think has a default constructor?
 */

class Rabbit1 {

}

class Rabbit2 {
    public Rabbit2() {}
}

class Rabbit3 {
    public Rabbit3(boolean b) {}
}

class Rabbit4 {
    private Rabbit4 () {}
}

/**
 * - Only Rabbit1 gets a default no-argument constructor. It doesn't have a constructor coded so Java generates a default
 *   no-argument constructor.
 *
 * - Rabbit2 and Rabbit3 both have public constructors already. Rabbit4 has a private constructor.
 *
 * - Since these three classes have a constructor defined, the default no-argument constructor is not inserted for you.
 *
 * - Let’s take a quick look at how to call these constructors:
 */

class RabbitsMultiply {
    public static void main(String[] args) {

        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        // Rabbit4 r4 = new Rabbit4(); does not compile because

    }
}

/**
 * CONSTRUCTOR OVERLOADING
 *
 *  - You can have multiple constructors in the same class as long as they have different method signatures. When overloading
 *    ods, the method name and parameter list needed to match.
 *  - With constructors, the name is always the same since it has to be the same as the name of the class.
 *  - This means construc- tors must have different parameters in order to be overloaded.
 *
 */

class Hamster {
    private String color;
    private int weight;
    public Hamster (int weight) { // first constructor
        //Hamster(weight,"brown"); does not compile
        this(weight,"brown");  // it must be first non commented statement
        new Hamster(weight, "brown"); // compiles but doesn't work the way we expect it to. It constructs a different object
        this.weight = weight;
        color = "brown";
    }

    public Hamster (int weight, String color) {  // second constructor
        this.weight = weight;
        this.color = color;
    }


}

/**
 * CONSTRUCTOR CHAINING
 *
 * - Overloaded constructors often call each other. One common technique is to have each constructor add one parameter
 *   until getting to the constructor that does all the work.
 * - This approach is called constructor chaining. In this example, all three constructors are chained.
 */
class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight,16);
    }

    public Mouse (int weight, int numTeeth) {
        this(weight,numTeeth,6);
    }

    public Mouse (int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print(); // 15 16 6
    }
}

/**
 * FINAL FIELDS
 *
 * - As you saw earlier in the chapter, final instance variables must be assigned a value exactly once.
 * - We saw this happen in the line of the declaration and in an instance initializer.
 * - There is one more location this assignment can be done: in the constructor.
 *
 */

class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    public MouseHouse (int length, int width, int height) {
        volume = length * width * height;
    }
}

/**
 * INITIALIZATION ORDER
 *
 * 1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say
 *     “no superclass” and go on to the next rule.)
 * 2. Static variable declarations and static initializers in the order they appear in the file.
 * 3. Instance variable declarations and instance initializers in the order they appear in the file.
 * 4. The constructor.
 *
 */

class InitializationOrderSimple {
    private String name = "Torchie";
    {System.out.println(name);}
    private static int COUNT = 0;
    static {System.out.println(COUNT);}
    static {COUNT += 10; System.out.println(COUNT);}
    public InitializationOrderSimple () {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}

class InitializationOrder {
    private String name = "Torchie";
    {System.out.println(name);}
    private static int COUNT = 0;
    static {System.out.println(COUNT);}
    {COUNT++; System.out.println(COUNT);}

    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder();
    }

    /**
     * Outputs:
     *
     * 0
     * read to construct
     * 1
     * Torchie
     * constructor
     *
     */
}

class YetMoreInitializationOrder {

    static {add(2);}
    static void add(int num) {System.out.print(num + " ");}
    YetMoreInitializationOrder() {add(5); }
    static {add(4);}
    {add(6);}
    static {new YetMoreInitializationOrder();} // constructor must be called within a static method.
    {add(8);}

    public static void main(String[] args) {
    //constructor can be called from within or outside main method. However, it will always be the last to be executed
    }
}

/**
 * 2 4 5 6 8
 */

