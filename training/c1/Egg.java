package c1;

public class Egg {

    private int number = 3;
    public Egg () { number = 5; }
    {number = 4; }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

}
