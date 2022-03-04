interface Parent {

    public default int myMethod(int x) throws RuntimeException {
        return x;
    }

}

class Child implements Parent {
    
    public int myMethod(int x) throws IndexOutOfBoundsException {
        return x;
    }


    private int aMethod(int x) {
        return x;
    }

}

public class OverrideEx1 extends Child {

    public int aMethod(int x) throws IndexOutOfBoundsException {
        return x;
    }

}
