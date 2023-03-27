package inheritance;

class Marsupial {
    public static boolean isBiped () {
        return false;
    }

    public boolean isAlive () {
        return false;
    }

    public void getMarsupialDescription () {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public void getMarsupialStatus() {
        System.out.println("The Marsupial is alive: " + isAlive());
    }
}


public class Kangaroo extends Marsupial{
    public static boolean isBiped() {
        return true;
    }

    public boolean isAlive() {
        return true;
    }

    public void getKangarooDescription () {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public void getKangarooStatus() {
        System.out.println("The Kangaroo is alive: " + isAlive());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();

        System.out.println("HIDING METHODS \n------------------");

        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        System.out.println("------------------");

        System.out.println("OVERRIDING METHODS \n------------------");

        joey.getMarsupialStatus();
        joey.getKangarooStatus();

        System.out.println("------------------");
    }
}
