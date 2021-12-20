public class ArrayEx2 {

    int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};

    public static void main(String[] args) {

        ArrayEx2 [] da = new ArrayEx2[3];   // comes with its own "int array" object *3
        da[0] = new ArrayEx2();             // comes with its own "int array" object
        ArrayEx2 d = new ArrayEx2();        // comes with its own "int array" object

        da[1] = d;                      // equals ArrayEx2 ojbect
        d = null;                       // equals null (GC)
        da[1] = null;                   // equals null (GC)
        // do stuff

        // Five objects were created
        // Two objects are eligible for GC
        // garbage collection when there are no more reachable references to it.

    }
}