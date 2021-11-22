import java.util.*;
import java.util.function.Function;


public class myArray {


    public static void main(String[] args) {



        // create array
        int[] array1 = new int[3];              // 3 memory slots
        int[] array2 = {6, -4, 12, 0, -10 };    // initial values
        int[] array3 = array2;

        // Create arrays of Integer, Double and Character
       Integer[] intArray = { 1, 2, 3, 4, 5 };
       Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
       Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };



        // anonymous array
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];
        


        //  multidimensional array
        int[][] scores = new int[5][]; // specify  a size, it is legal to leave out the size for later dimensions of a multidimensional array, the first one is required.
        Object[][][] cubbies = new Object[3][0][5]; // specify  sizes
        java.util.Date[] dates[] = new java.util.Date[2][]; // import from Data class



        // length
        char[] c = new char[2];
        System.out.println(c.length); 



        // Arrays.asList 
        // Using this method, we can convert from an array to a fixed-size List object. 
        // This List is just a wrapper that makes the array available as a list. 
        // No data is copied or created.
        List<Integer> list1 = Arrays.asList(10, 4, -1, 5);



        // equals()
        System.out.println(array3.equals(array2)); // true



        // sort()
        Arrays.sort(array2);
        for (int i : array2) System.out.print(i +" "); // -10 -4 0 6 12

        

        // binarySearch()
        // Its a search alagrithm, that only work on a sorted list
        // it seraches by cutting the list in half, intai it  find the target
        // returns the index
        System.out.println(Arrays.binarySearch(array2, -10));   // 0
        System.out.println(Arrays.binarySearch(array2, 12));    // 4
        System.out.println(Arrays.binarySearch(array2, 6));     // 3




        //----------------------------------------------------------------------------
        // Convert ArrayList to a Array
        //----------------------------------------------------------------------------

        // Convert ArrayList to an Array
        Function< String[], ArrayList<String> > arrayToArrayList = (list) -> { 
            ArrayList<String> result = new ArrayList<String>();
            for (int i=0; i<list.length; i++) { 
                result.add(list[i]); };
            return result; };

        // input Array into Function Interface
        String[] words = {"a", "b", "c" };
        ArrayList<String> newWords = new ArrayList<String>(arrayToArrayList.apply(words));
        System.out.println("Array -> ArrayList: "+newWords);


        



        
    }   
}
