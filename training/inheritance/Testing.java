package inheritance;

interface Alpha {
    public default int height (){
        return 5;
    }
}

interface Betha extends Alpha {
    public default int height () {
        return 20;
    }
}


public class Testing implements Alpha, Betha {

    public static void main(String[] args) {
        Alpha a = new Testing();
        System.out.println(a.height());
    }
}
