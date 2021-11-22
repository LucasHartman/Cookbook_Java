interface Walk {
    public List move();
}

interface Run extends Walk {
    public ArrayList move();
}

public class Leopard {
    public Integer move() { // X
        return null;
    }
}

public class Panther implements Run {
    public ArrayList move() { // Z
        return null;
    }
}