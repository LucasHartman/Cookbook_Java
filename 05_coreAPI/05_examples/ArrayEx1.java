/*
--  Arrays
-   Arrays are objects in Java that store multiple variables of the same type.
-   Arrays can hold either primitives or object references

--  constructing an array
-   Constructing an array means creating the array object on the heap (where all objects live)
-   arrays must always be given a size at the time they are constructed.
-   with each element containing an int with a default value of 0


--  Initializing an Array
-   Initializing an array means putting things into it
-   they’re either primitive values (2, x, false, and so on) or objects referred 
*/

public class ArrayEx1 {
    public static void main(String[] args) {


        // Declaring an Array
        int[] key1;
        int key2 [];            // legal
        String[][][] mdarray;   // three-dimensional array
        String[] mdarray2 [];   // legal


        // Constructing an Array
        int[] testScores;           // declare
        testScores = new int[4];    // construct
        int[] tester = new int[4]; // declare & construct
        int[][] myArray = new int[3][]; // declaring & construct 2D array


        // Initializing an Array
        Animal [] pets = new Animal[3]; // declare & construct
        pets[0] = new Animal();         // putting things into it
        pets[1] = new Animal();
        pets[2] = new Animal();
        int[] dots = {6,7,8};   // declaring, constructing, initializing
        int[][] scores = {{5,2,4,7}, {9,2}, {3,4}}; // // declaring, constructing, initializing 2D-array

    }
}