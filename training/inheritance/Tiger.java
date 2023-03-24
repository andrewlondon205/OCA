package inheritance;

public class Tiger extends Animal{

    public Tiger(int age) {
        super(age);
    }

    private void roar() {
        System.out.println("The " + getAge() + " year old tiger says: Roar!" );
    }
}
