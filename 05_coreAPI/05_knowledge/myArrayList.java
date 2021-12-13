import java.util.*;
import java.util.function.Function;

public class myArrayList {
    
    /**
     * 
     * 
     * 
     * 
     * =================================================================================================
     * 
     * var list = new ArrayList<String>();
     * list.add("one");
     * list.add(7);                     // incompatible
     * 
     * 
     * Arraylist() instead of ArrayList<String>() will generate un error
     */

     public static void main(String[] args) {



        // Creating ArrayList
        ArrayList list1 = new ArrayList();                  // containing space for the default number of elements
        ArrayList list2 = new ArrayList(10);                // specific number of slots
        ArrayList list3 = new ArrayList(list2);             // make a copy of another ArrayList
        ArrayList<String> list4 = new ArrayList<String>();  // String type
        var list5 = new ArrayList<>();                      // diamond operator<>: ArrayList<> = ArrayList<Object>



        // List
        // Since the left side does not define a generic type
        // its not an Interger type, Integer an Object replacement for primitive int values
        // use listElement.intValue() to cast an "Integer" to an "primitive int" value
        List list6 = new ArrayList<Integer>();    // List = List<Object>



        // add()
        ArrayList<String> list7 = new ArrayList<String>();
        list7.add("AB");



        // add() - add to a no type arrylist
        ArrayList list8 = new ArrayList(); // no type, so its an type Object, which includes everything except primitives
        list8.add("hawk");          // [hawk] add String
        list8.add(Boolean.TRUE);    // [hawk, true] add Boolean
        list8.add(77);              // add int?
        System.out.println(list8);  // [hawk, true]



        // add() by index
        ArrayList<String> list9 = new ArrayList<>();
        list9.add("hawk");            // [hawk]
        list9.add(1, "robin");        // [hawk, robin]
        list9.add(0, "blue jay");     // [blue jay, hawk, robin]
        list9.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin]
        System.out.println(list9);    // [blue jay, cardinal, hawk, robin]



        // remove()
        // remove by index
        list9.remove(1);

        

        // removeIf()
        // remove all of the elements of this ArrayList that satisfies a given predicate filter 
        // which is passed as a parameter to the method.
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
        Numbers.removeIf(n -> (n % 3 == 0)); // remove every elemet dividble by 3
        System.out.println("removeIf: " +Numbers.toString() ); // 23, 23



        // toString() - print list
        System.out.println(list9.toString());



        // size()
        // get list size
        System.out.println( list9.size() );



        // isEmpty()
        // check if list is empty
        ArrayList<String> list10 = new ArrayList<>();
        System.out.println(list10.isEmpty());     // true
        
        list10.add("fish");
        System.out.println(list10.isEmpty());     // false




        // clear()
        // clear whole list
        ArrayList<String> list11 = new ArrayList<>();
        list11.add("hawk");                    // [hawk]
        list11.add("hawk");                    // [hawk, hawk]
        list11.clear();                        // []



        // contains()
        // check if a element is in a list
        ArrayList<String> list12 = new ArrayList<>();
        list12.add("hawk");                           // [hawk]
        System.out.println(list12.contains("hawk"));  // true
        System.out.println(list12.contains("robin")); // false



        // equals()
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        System.out.println(one.equals(two));  // true



        // Sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]



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