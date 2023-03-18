package alpha;

public class Elephant extends Animal{

    public Elephant(String breed, Integer age, Double weight, Double height) {
        super(breed, age, weight, height);
    }

    public Elephant () {}

    public void makeNoise () {
        getWeight();
        getHeight();

        Elephant elephant = new Elephant();
        elephant.getWeight();
        elephant.getHeight();

        Animal animal = new Animal();
        animal.getHeight();
        animal.getWeight();
    }

}
