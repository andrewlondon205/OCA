package c4;

/**
 * - Encapsulation is the process by which we protect our data from external callers by marking instance variables as private
 * - Once the instance variables have been marked as private, we create public getters and setters to allow access to the ouside
 *   under strict rules.
 */


public class Encapsulation {
    public static void main(String[] args) {

    }
}

class Swan {
    private int numberEggs; // private
    public int getNumberEggs () {   // getter
        return numberEggs;
    }

    public void setNumberEggs (int numberEggs) { //setter
        if(numberEggs > 0) //guard condition
            this.numberEggs = numberEggs;
    }
 }

/**
 *   RULE                                                                   EXAMPLE
 *
 * - Properties are private.                                           private int numEggs;
 * - Getter methods begin with is if the property is a boolean.        public boolean isHappy() {return happy;}
 * - Getter methods begin with get if the property is not a boolean.   public int getNumEggs() {return numEggs;}
 * - Setter methods begin with set.                                    public void setHappy(boolean happy) {this.happy = happy;}
 * - The method name must have a prefix of set/get/is, followed        public void setNumEgs(int num) { numEggs = num;}
 *   by the first letter of the property in uppercase, followed
 *   by the rest of the property name.
 */

/**
 * Examples
 */

class Examples {
    private boolean playing; //good
    private String name; // good

    public boolean getPlaying() {return playing; } // bad
    public boolean isPlaying () {return playing;} // good
    public String name () {return name; } // bad
    public void updateName(String n) {name = n;} // bad
    public void setname(String n) {name = n;} // bad
}

/**
 * CREATING IMMUTABLE CLASSES
 *
 * - Encapsulating data is helpful because it prevents callers from making uncontrolled changes to your class.
 * - Another common technique is making classes immutable so they cannot be changed at all.
 * - Immutable classes are helpful because you know they will always be the same. You can pass them around your
 *   application with a guarantee that the caller didn’t change anything. This helps make programs easier to maintain.
 *
 * - One step in making a class immutable is to omit the setters. But wait: we still want the caller to be able to specify
 *   the initial value—we just don’t want it to change after the object is created. Constructors to the rescue!
 *
 */

class ImmutableSwan {
    private int numberEggs;
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs; }
    public int getNumberEggs() { return numberEggs;
    }}


class NotImmutable {
    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
        //builder = new StringBuilder(b) -> to render it immutable
    }

    public StringBuilder getBuilder() {
        return builder;
        // return new StringBuilder(builder); -> to render it immutable
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");

        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());

        /**
         * - This outputs "initial added more"—clearly not what we were intending.  The problem is that we are just passing
         *   the same StringBuilder all over.
         * - The caller has a reference since it was passed to the constructor.
         * - Anyone who calls the getter gets a reference too. A solution is to make a copy of the mutable object.
         * - This is called a defensive copy.
         */
    }
}