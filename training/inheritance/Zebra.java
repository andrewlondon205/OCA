package inheritance;

public class Zebra extends Animal{

    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }
}
