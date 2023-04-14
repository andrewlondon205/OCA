package c1;

public class Chick {

    private String name;
    private Double height;
    private Double weight;
    private Integer age;

    private String first = "Theodore";
    private String last = "Moose";
    private String full = first + last;

    {System.out.println("Setting fields");}

    public Chick (String name, Double height, Double weight, Integer age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Chick () {
        first = "Andrew";
        System.out.println("setting constructor");
    }

    public void Chick () {} //Not a constructor, but a method

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {

        Chick c1 = new Chick(); // A new object has been created.
        Chick c2 = new Chick("Quack",120.5,50.0,10);

        System.out.println(c2.getAge());
        System.out.println(c2.getHeight());
        System.out.println(c2.getWeight());
        System.out.println(c2.getName());

        System.out.println(c1.first);

        /**
         * Yields the following output:
         * - Setting fields
         * - setting constructor
         * - Andrew
         */

    }
}
