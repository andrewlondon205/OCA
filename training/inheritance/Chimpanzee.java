package inheritance;

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}


public class Chimpanzee extends Ape {

    public Chimpanzee () {
        super();
        System.out.println("I am a chimpanzee");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
