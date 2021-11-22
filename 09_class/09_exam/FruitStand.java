interface Apple {
}

interface Orange {
}

class Gala implements Apple {
}

class Tangerine implements Orange {
}

final class Citrus extends Tangerine {
}

public class FruitStand {
    public static void main(String[] args) {
        Gala g = new Gala();
        Tangerine t = new Tangerine();
        Citrus c = new Citrus();

        System.out.print(t instanceof Gala); // ERROR: Tangerine and Gala are unrelated types
        System.out.print(c instanceof Tangerine);
        System.out.print(g instanceof Apple);
        System.out.print(t instanceof Apple);
        System.out.print(c instanceof Apple);
    }
}
