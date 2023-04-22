package c4.modifiers.pond.duck;

import c4.modifiers.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        // goose.floatInWater(); does not compile
    }
}
