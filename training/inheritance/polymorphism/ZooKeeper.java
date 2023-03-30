package inheritance.polymorphism;

class Animal {
    public String getName() {
        return "Animal";
    }
}

class Gorilla extends Animal {
    public String getName() {
        return "Gorilla";
    }
}


public class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}
