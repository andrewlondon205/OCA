package inheritance.interfaces;

interface Herbivore {
    public void eatPlants();
    public int eatPlants(int quantity);
}

interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}


public class Bear implements Herbivore,Omnivore{

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+ quantity);
        return quantity;
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }
}
