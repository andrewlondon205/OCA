package c4.modifiers.pond.goose;

import c4.modifiers.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim () {
        floatInWater();         // calling protected member
        System.out.println(text); // calling protected member
    }

    public static void main(String[] args) {
        Gosling g = new Gosling();
        g.swim();
    }
}
