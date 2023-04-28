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
        } catch (IOException e) {
            System.out.print("M");
        } finally {
            System.out.print("N");
        }
    }

}

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
    public static void log() {
        System.out.println("Log");
    }
}

class MyLogger extends Log implements ILog {}
