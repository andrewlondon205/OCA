package pond.duck;

public class MotherDuck {

    String noise = "quack";
    void quack () {
        System.out.println(noise);
    }

    private void makeNoise() {
        quack();
    }
}
