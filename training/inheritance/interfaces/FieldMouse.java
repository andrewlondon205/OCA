package inheritance.interfaces;

interface canBurrow {
    int MINIMUM_DEPTH = 2;
    int getMinimumDepth();
}

public class FieldMouse implements canBurrow{

    @Override
    public int getMinimumDepth() {
        return 10;
    }
}
