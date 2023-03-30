package inheritance;

class Canine {

    public double getAverageWeight () {
        return 50;
    }

}

public class Wolf extends Canine{

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());

    }
}
