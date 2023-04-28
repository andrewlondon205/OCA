package resources;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Test {
    public static void main(String[] args) {
        Sub s = new Sub();
        try {
            s.m1();

        } catch (FileNotFoundException e) {
            System.out.println("X");
        }
        catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");
        }
    }

}

/*interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
    public static void log() {
        System.out.println("Log");
    }
}

class MyLogger extends Log implements ILog {}*/

class TestDriver {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
    public static void main(String[] args) {
   //     add(10.0, new Double(10.0));
    }
}
