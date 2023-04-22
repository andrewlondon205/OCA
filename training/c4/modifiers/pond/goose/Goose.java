package c4.modifiers.pond.goose;

import c4.modifiers.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim () {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim () {
        Bird other = new Goose();
       // other.floatInWater(); does not compile
       //  System.out.println(other.text); does not compile
    }


}
