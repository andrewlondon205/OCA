package classdesign;

public class Static {

    private String name = "Static Class";
    public static void first() {}
    public static void second () {}

    public void third() {System.out.println(name);}

    public static void main(String[] args) {
        first();
        second();
        new Static().third();
    }
}
