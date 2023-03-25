package inheritance;

class Bird {
    public void fly () {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}


public class Eagle extends Bird {

    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    public void eat (int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }

}
