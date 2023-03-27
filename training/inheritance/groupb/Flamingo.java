package inheritance.groupb;

abstract class Being {
    public abstract String getName();
}

class Walrus extends Being {

    @Override
    public String getName() {
        return "Bird";
    }
}

public class Flamingo extends Being{
    public String getName() {
        return "Flamingo";
    }
}
