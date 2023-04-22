package c4.modifiers.pond.duck;

public class MotherDuck {
    String noise = "quack";
    void quack () {
        System.out.println(noise); // default access works
    }

    private void makeNoise() {
        quack(); // default access works
    }
}
