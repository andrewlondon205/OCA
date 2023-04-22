package c4.modifiers.pond.duck;

public class GoodDuckling {
    public void makeNoise () {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access works
        System.out.println(duck.noise); // default access works
    }


}
