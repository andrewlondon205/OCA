package betha;

import alpha.Animal;

public class Tiger extends Animal {

    public Tiger(String breed, Integer age, Double weight, Double height) {
        super(breed, age, weight, height);
    }

    public Tiger() {}

    public void doSomething () {

        getHeight();
        getWeight();

        Tiger tiger = new Tiger();
        tiger.getHeight();
        tiger.getWeight();

        Animal animal = new Animal();
/*        animal.getWeight();
        animal.getHeight();

        Animal animal1 = new Tiger();
        animal1.getHeight();
        animal1.getWeight(); */

    }
}
