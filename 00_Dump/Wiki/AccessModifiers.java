interface Parent {
    void doStuff();
}

class Child implements Parent {
    @Override
    public doStuff() {} // access must be the same of broader
}

public class AccessModifiers {
    
}
