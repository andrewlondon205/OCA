package inheritance;


class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
}


public class Panda extends Bear{

    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

  /*  public static void hibernate () {
        System.out.println("Panda bear is going to sleep");
    }

    public void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }*/

    public static void main(String[] args) {
        Panda.eat();
    }
}
