package lambdas;

public class CheckIfHoper implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }


}
