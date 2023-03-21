package classdesign;

public class Mouse {
    private int numTeeth;
    private int numWhishkers;
    private int weight;

    public Mouse(int weight) {
        this(weight,16);
    }

    public Mouse(int weight, int numTeeth) {
        this(weight,numTeeth,6);
    }

    public Mouse(int weight, int numTeeth, int numWhishkers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhishkers = numWhishkers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhishkers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}
