package inheritance;

class Creature {
    public int length = 2;
}

public class Jellyfish extends Creature {

    public int length = 5;
    public static void main(String[] args) {

        Jellyfish jellyfish = new Jellyfish();
        Creature creature = new Jellyfish();

        System.out.println(jellyfish.length);
        System.out.println(creature.length);
    }
}
