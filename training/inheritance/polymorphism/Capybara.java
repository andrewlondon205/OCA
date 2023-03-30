package inheritance.polymorphism;

class Rodent {

}


public class Capybara extends Rodent{

    public static void main(String[] args) {

        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent;
    }

}
