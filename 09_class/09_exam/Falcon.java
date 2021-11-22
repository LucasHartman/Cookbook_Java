interface CanFly {

    int fly();

    String fly(int distance);
}

interface HasWings {
    abstract String fly();

    public abstract Object getWingSpan();
}

// Cant ovrride 2 fly methods
public abstract class Falcon implements CanFly, HasWings {
}