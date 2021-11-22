interface HasExoskeleton {
    double size = 2.0f;

    abstract int getNumberOfSection();
}

abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();
}

class Beetle extends Insect {

    int getNumberOfLegs() {
        return 6;
    }

    // adding int count makes it an overload method
    // it must me overriden to implement the abstract method
    int getNumberOfSections(int count) {
        return 1;
    }
}
