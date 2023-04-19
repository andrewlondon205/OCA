package c2;

public class NumericPromotion {

    public static void main(String[] args) {

        int x = 1;
        long y = 33;
        long r = x * y;
        //int r = (x * y); does not compile, unless explicit casting is applied

        double a = 39.21;
        float  b = 2.1f;
        double c = a * b;
        //float f = (a * b); does not compile, unless explicit casting is applied

        short k = 10;
        short f = 3;
        int op = k / f;
        // short op1 = k / f; does not compile without explicit casting
        // byte op2 = k / f ; does not compile without explicit casting

        short j = 14;
        float i = 13;
        double z = 30;
        double rp = j * i / z;
        // int rk = j * i / k; does not compile without explicit casting
        // byte rk = j * i / k; does not compile without explicit casting


    }
}

class UnaryOperators {
    public static void main(String[] args) throws Exception {

        // logical complement operator
        boolean x = false;
        System.out.println(x); //false
        x = !x;
        System.out.println(x); // true

        //negation operator
        double f = 1.21;
        System.out.println(f); // 1.21
        f = -f;
        System.out.println(f); // -1.21
        f = -f;
        System.out.println(f); // 1.21

        // int x = !5; // DOES NOT COMPILE
        // boolean y = -true; // DOES NOT COMPILE
        // boolean z = !0; // DOES NOT COMPILE

    }
}

class IncrementDecrement {
    public static void main(String[] args) {

        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x is " + x);
        System.out.println("y is " + y);

        //int x = 1.0; // DOES NOT COMPILE
       // short y = 1921222; // DOES NOT COMPILE
       // int z = 9f; // DOES NOT COMPILE
      //  long t = 192301398193810323; // DOES NOT COMPILE
    }

    public static void casting () {
        int x = (int) 1.0;
        short y = (short) 1921222;
        int z = (int) 9l;
        long t = 192301398193810323L;

        short a = 10;
        short b = 3;
        int d = a * b;
        short res = (short) (a*b); // alternative option
        // short c = a * b; does not compile without explicit casting

        // COMPOUND ASSIGNMENT CASTING

        long var1 = 10;
        int var2 = 5;
        // var2 = var2 * var1; does not compile
        var2 *= var1; // statement does compile
    }
}
