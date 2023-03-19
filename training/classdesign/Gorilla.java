package classdesign;

public class Gorilla {
    private String name = "King kong";
    private static Integer age = 20;
    private static String gender = "M";
    private static Integer count;
    private Integer total;

    public Gorilla(String name) {
        this.name = name;
    }

    public Gorilla () {}

    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void first() { }
    public static void second() { }

    public String getName() {
        return name;
    }

    public static void announceBabiesToEveryone() { addGorilla();
        // babyGorilla(); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        first();
        second();
    }
}
