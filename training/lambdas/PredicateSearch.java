package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));

        print(animals, a -> a.canHop());

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);

        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
