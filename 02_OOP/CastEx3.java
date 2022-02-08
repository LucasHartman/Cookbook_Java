
/*
--  final variable
-   blank final variable or uninitialized final variable.
-   It can be initialized in the constructor only.
-   The blank final variable can be static also which will be initialized in the static block only.


*/

abstract class Ball {
    protected final int size; // final variable
    public Ball(int size) { this.size = size;
    }
}



interface Equipment {}



public class CastEx3 extends Ball implements Equipment {
    public CastEx3() { super(5); }
    public Ball get() { return this; }



    public static void main(String[] passes) {
        Equipment equipment = (Equipment)(Ball) new CastEx3().get();
        System.out.print(((CastEx3)equipment).size); // result: 5
    }
}