
interface Parent {
}

interface StepDad {
}

// Interface can extend multiple interfaces
interface StepMam extends Parent, StepDad {
}

// ---------------------------------------------------------------

// Implement Interface
public class ImplementInherited implements CanHop {
    public static void main(String[] args) {
        ImplementInherited obj0 = new ImplementInherited();

        ImplementInherited obj1 = new Child1();
        ImplementInherited obj5 = new Child2();

        Child1 obj2 = new Child1();
        Child2 obj3 = new Child2();

        Object obj7 = new ImplementInherited();
        Object obj4 = new Child1();
        Object obj6 = new Child2();

    }
}

// ---------------------------------------------------------------

// Inherid Class
class Child1 extends ImplementInherited {
}

// Inherid Class
class Child2 extends ImplementInherited {
}
