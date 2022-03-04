/*
All arrays are objects regardless of whether they point to primitives or classes. 
That means both balls and scores are objects. 

Both are set to null so they are eligible for garbage collection. 
The balls array is initialized to all null references. There are no objects inside.
The scores array is initialized to all 0 values. Therefore, only two objects exist to be
eligible for garbage collection, and Option C is correct.
*/

public class Exercise23 {
    public static void main(String[] game) {
        
        String[] balls = new String[1];
        int[] scores = new int[1];
        
        balls = null;
        scores = null;
    }
}
