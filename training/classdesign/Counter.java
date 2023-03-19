package classdesign;

import java.util.ArrayList;

public class Counter {

    private static int count;
    private static final String MESSAGE = "hi there";
    private static final ArrayList<String> values = new ArrayList<>();
    public Counter () {count++;}

    public static void speak(StringBuilder s) {
        s.append(" & Orlando Bloom");
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);

        StringBuilder name = new StringBuilder("Katy Perry");
        speak(name);
        System.out.println(name);
        values.add("$");
    }
}
