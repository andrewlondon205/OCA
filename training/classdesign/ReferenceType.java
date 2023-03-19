package classdesign;

public class ReferenceType {

    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object");
    }


    public static void main(String[] args) {
        ReferenceType r = new ReferenceType();
        r.fly("test");
        r.fly(120);
    }
}
