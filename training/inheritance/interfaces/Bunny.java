package inheritance.interfaces;

interface Hop {
    static int getJumpHeight () {
        return 8;
    }
}


public class Bunny implements Hop {
    public void printDetais () {
        System.out.println(Hop.getJumpHeight());
    }
}
