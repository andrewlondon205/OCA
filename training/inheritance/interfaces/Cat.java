package inheritance.interfaces;

 interface Walk {
    public default int getSpeed () {
        return 5;
    }
}
 interface Run {
    public default int getSpeed () {
        return 10;
    }
}


public class Cat implements Walk, Run {

     public int getSpeed () {
         return 1;
     }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
