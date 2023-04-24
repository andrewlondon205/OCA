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
 *
 */


class ImmutableSwan {
    private int numberEggs;
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs; }
    public int getNumberEggs() { return numberEggs;
    }}


