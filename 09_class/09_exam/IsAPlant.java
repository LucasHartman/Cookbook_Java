public abstract interface Herbivore {
    int amount = 10;

    public void eatGrass();

    // ERROR: Abstract method can't have a body
    public abstract int chew() {retun 13; }
}

// ERROR: Can't extend a Interface, must be inplented
abstract class IsAPlant extends Herbivore {
    Object eatGrass(int seaons) {
        return null;
    }
}