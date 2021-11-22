import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Function;

public class arrayCheatSheet {

    public static void main(String[] args) {

        // Array ---------------------------------------------------------------------------------------------

        // Array
        String[] array1 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Array: "+ Arrays.toString(array1));

        // 2D Array
        int[][] array2 = new int[5][3];
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        array2[0][0] = 10;
        array2[0][1] = 20;
        array2[0][2] = 30;
        System.out.println("\n3D Array: "+ Arrays.toString(array2[0])); // print frist array

        // 3D Array
        int[][][] array3 = new int[1][2][3];
        array3[0][0][0] = 0;
        array3[0][0][1] = 1;
        array3[0][0][2] = 1;
        System.out.println("\n3D Array: "+ Arrays.toString(array3[0][0])); // print frist array



        // ArrayList -------------------------------------------------------------------------------------------

        // ArrayList
        /*
         -  When an element is added, it is placed into the array. 
           If the array is not big enough, a new, 
           larger array is created to replace the old one and the old one is removed.
        */
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // Create an ArrayList object
        list1.add(23);
        list1.add(32);
        list1.add(45);
        System.out.println("\nArrayList: " +list1);

        // 2D ArrayList
        /*
        - Source: https://www.baeldung.com/java-multi-dimensional-arraylist
       
        */
        int vertexCount = 3;
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(vertexCount); // Intialize the arraylist
        for(int i=0; i < vertexCount; i++) { list2.add(new ArrayList<Integer>()); } // add inner arrays
        list2.get(0).add(1); // array5 and get the "inner array index" & add value
        list2.get(1).add(2);
        list2.get(2).add(0);
        System.out.println("\n2D ArrayList: " +list2);

        // 3D ArrayList
        /*
        - Source: https://www.baeldung.com/java-multi-dimensional-arraylist
        */
        int x_axis_length = 2; // number of slots
        int y_axis_length = 2;
        int z_axis_length = 2;	
        ArrayList<ArrayList<ArrayList<String>>> list3 = new ArrayList<>(x_axis_length); // create 3D array
        for (int i = 0; i < x_axis_length; i++) { list3.add(new ArrayList<ArrayList<String>>(y_axis_length)); // create Inner Arrays
            for (int j = 0; j < y_axis_length; j++) { list3.get(i).add(new ArrayList<String>(z_axis_length)); }} // create Innner-Inner Arrys
        list3.get(0).get(0).add(0,"Red"); // from array6 (X) get 1ste inner array (Y), get 1ste innner-inner array (Z) add value to index 0
        list3.get(0).get(0).add(1,"Red"); // from array6 (X) get 1ste inner array (Y), get 1ste innner-inner array (Z) add value to index 1
        list3.get(0).get(1).add(0,"Blue");
        list3.get(0).get(1).add(1,"Blue");
        System.out.println("\n3D ArrayList: "+list3);
        


        // List -------------------------------------------------------------------------------------------

        // LinkedList
        /*
        - contain many objects of the same type
        - same methods as the ArrayList class, because they both implement the List interface.
        - The LinkedList stores its items in "containers." 
          The list has a link to the first container and each container has a link to the next container in the list. 
        */
        LinkedList<String> list4 = new LinkedList<String>();
        list4.add("Volvo");
        list4.add("BMW");
        list4.add("Ford");
        list4.add("Mazda");
        System.out.println("\nLinkedList: "+list4);



        // Map -------------------------------------------------------------------------------------------

        // HashMap
        /*
        - Source: https://www.w3schools.com/java/java_hashmap.asp
        - HashMap however, store items in "key/value" pairs, 
          and you can access them by an index of another type (e.g. a String).
        */
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("England", "London"); // Add keys and values (Country, City)
        map1.put("Germany", "Berlin");
        map1.put("Norway", "Oslo");
        map1.put("USA", "Washington DC");
        System.out.println("\nHashMap: "+map1.get("England") ); // London


        // Set -------------------------------------------------------------------------------------------

        // HashSet
        /*
        - source: https://www.w3schools.com/java/java_hashset.asp
        - A HashSet is a collection of items where every item is unique
        */
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Volvo");
        set1.add("BMW");
        set1.add("Ford");
        set1.add("BMW");
        set1.add("Mazda");
        System.out.println("\nHashSet: "+set1);



        //----------------------------------------------------------------------------
        // Convert ArrayList to an Array
        //----------------------------------------------------------------------------
        
        // Create ArrayLIst
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(5); numbers1.add(9); numbers1.add(8); numbers1.add(1);

        // FUNCTION INTERFACE: Convert ArrayList to an Array
        Function< ArrayList<Integer>, int[]> arrayListToArray = (list) -> { 
            int[] result = new int[list.size()];  
            for (int i=0; i<list.size(); i++) {result[i] = list.get(i); };
            return result; };

        // input ArrayList into Function Interface
        int[] newList = arrayListToArray.apply(numbers1);
        System.out.println(newList[0]);



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
