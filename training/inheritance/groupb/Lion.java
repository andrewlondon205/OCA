package inheritance.groupb;

abstract class Beast {
    public abstract String getName();
    public abstract int getAge();
}

 abstract class BigCat extends Beast {
  //  public abstract void roar();

    public String getName () {
        return "BigCat!";
    }

    public int getAge() {
        return 102;
    }

}


public class Lion extends BigCat{
    public void roar () {
        System.out.println("ROAR");
    }

}
