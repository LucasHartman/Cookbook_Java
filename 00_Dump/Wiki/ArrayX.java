/*
-- Arrays
-   Source: https://www.geeksforgeeks.org/arrays-in-java/
-   Array is a group of like-typed variables
-   dynamically allocated:  
-   array is an object
-   array variable are declared with []
-   array have index beginning from 0
-   array can be a static field, local variable, or method parameter
-   Size must be specified by int or short value and not long
-   Superclass of an array type is Object
-   Array can contain primitives and object

-- Declare
-   int intArray[];
-   int[] intArray;

-- Instantiating
-   If an array is not initialized, it will throw a NullPointException
-   intArray = new int[20];
-   int[][][] intArray = new int[10][5][2];

-- Array Literal
-   In a situation where the size of the array and variables 
    of the array are already known, array literals can be used. 
-   int[] intArray = new int[] {1,2,3,4,5};
*/

import java.util.*;

public class ArrayX {
    
    public static void main(String[] args) {
        

        // int[][] arr1 = new int[][];  // error dimension missing
        int[][] arr2 = new int[1][1];
        

        // append values
        arr2[0][0] = 3;


        // catch NullPointerException
        try {
            System.out.println(arr2[0][0]);
        } catch( NullPointerException e) {
            System.out.println("caught NullPointerException");   
        }

        // Cannot convert int[][] to un int[]
        //int[] arr3 = arr2;

        // Array converted to fixed-size List
        String[] array = {"Natural", "Science", "Art" }; // unmutable
        List<String> list = Arrays.asList(array);   // unmutable

        // Array converted to ArrayList
        List<String> arraylist = new ArrayList<>(Arrays.asList(array)); // mutable
        arraylist.remove(2);
        arraylist.add("Space");

        System.out.println(array);      // print address: [Ljava.lang.String;@5acf9800
        System.out.println(Arrays.toString(array)); // [Natural, Science, Art]
        System.out.println(list);       // print list: [Natural, Science, Art]
        System.out.println(arraylist);  // [Natural, Science, Space]
  

        // Sort & Search
        int[] intArray = {22, 55, 33, 11};
        Arrays.sort(intArray); // 11, 22, 33, 55
        int result = Arrays.binarySearch(intArray, 55); // return index pos
        System.out.println(result); // index 3 

        
    }
}
