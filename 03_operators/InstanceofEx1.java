class Parent {}

public class InstanceofEx1 extends Parent {

    /*
    -- instanceof comparison 

    - The instanceof operator is used for object refence varialbes only
    - Same type or same Parent type
    - example:      Child obj1  = new Child;
                    Parent obj2 = new Parent;

                    if (obj1 instanceof obj2)    // true
    */

    public static void main(String[] args) {
        
        String s = new String("foo");

        if (s instanceof String) {
            System.out.println("yes");
        }

    // ---------------------------------------------

    Parent myA = new Parent(); // Parent reference
    m2(myA);                   // run static method + input 
    }

    public static void m2(Parent a) {
        if (a instanceof InstanceofEx1)
            ((InstanceofEx1)a).doBstuff();  // downcasting an Parent reference
                                            // to a Child refernce
    }

    public static void doBstuff() {
       System.out.println("argument refers to Child class");
    }
}
