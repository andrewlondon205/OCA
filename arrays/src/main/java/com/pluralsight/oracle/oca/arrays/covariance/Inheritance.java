package com.pluralsight.oracle.oca.arrays.covariance;

public class Inheritance {

    public static void main(String[] args) {
        Dog [] dogs =  {new Dog(), new Dog()};

        Animal [] animals = dogs;

        makeSounds(dogs);

        animals[0] = new Cat();
    }

    static void makeSounds (Animal [] animals ) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    interface Animal {
        void makeSound();
    }

    static class Dog implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    static class Cat implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }
}
