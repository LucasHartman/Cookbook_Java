class X { void do1() {} }

class Y extends X { void do2() {} }

public class Exercise37 {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // .do2();      // reference parent class, which has no do2() method
        // (Y)x2.do2(); // not a statement
        ((Y)x2).do2();  // is a statement (NarrowCast to subClass, witch has the do2() method)
    } 
    
}
