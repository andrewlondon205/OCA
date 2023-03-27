package inheritance.groupb;

abstract class Animal {

    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName () ;
}

public class Swan extends Animal {

    @Override
    public String getName() {
        return null;
    }
}
