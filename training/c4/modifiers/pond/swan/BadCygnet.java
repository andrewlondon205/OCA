package c4.modifiers.pond.swan;

import c4.modifiers.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise () {
        MotherDuck duck = new MotherDuck();
        // duck.quack(); does not compile because methods and fields are in a different package
        // System.out.println(duck.noise); does not compile because methods and fields are in a different package
    }


}
