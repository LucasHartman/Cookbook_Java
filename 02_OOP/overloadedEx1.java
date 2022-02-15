
/*
--  Overloaded
-   method overloading is not much more than name reuse
-   Overloaded methods MUST change the argument list.
-   Overloaded methods CAN change the return type.
-   Overloaded methods CAN change the access modifier.
-   Overloaded methods CAN declare new or broader checked exceptions.
-   A method can be overloaded in the subtype (child class)
*/

class Parent {

    public int myMethod(int x) {
        System.out.println("myMethod returns int");
        return x;
    }

    // changed argument list & return type
    public String myMethod(String x) {
        System.out.println("myMethod returns String");
        return x;
    }

    // changed argument list & retrun type & acces modifier
    protected float myMethod(float x) {
        System.out.println("myMethod returns float");
        return x;
    }

    // changed argument list & retrun type & acces modifier & broade checked exception
    protected double myMethod(double x) throws RuntimeException {
        System.out.println("myMethod retruns double, throws exception");
        return x;
    }

}






public class overloadedEx1 extends Parent {

        // SAME name, SAME argument list SAME return type  
        @Overide
        public int myMethod(int x) {
            System.out.println("myMethod returns int");
            return x;
        }

        // changed argument list & retrun type & in another subtype (child class)
        public String myMethod(String x, int y) {
            System.out.println("myMethod 2 arguments");
            return x;
        }






        public static void main(String[] args) {
            overloadedEx1 obj1 = new overloadedEx1();

            obj1.myMethod(1);
            obj1.myMethod("String");
            obj1.myMethod(1.1f);
            obj1.myMethod(2.2);
            obj1.myMethod("String", 1);
        }
}