package inheritance.interfaces;

public interface IsWarmBlooded {

    boolean hasScales ();
    public default double getTemperature () {
        return 10.0;
    }
}
