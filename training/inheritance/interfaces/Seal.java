package inheritance.interfaces;

interface HasTail {
    public int getTailLength();
}

interface HasWhiskers {
    public int getNumberOfWhiskers ();
}

abstract class HarborSeal implements HasTail, HasWhiskers {
}
/*
class LeopardSeal implements HasWhiskers, HasTail {
   does not compile because there are no implementations for the abstract methods in this class.
}*/

public interface Seal extends HasTail, HasWhiskers{
}

