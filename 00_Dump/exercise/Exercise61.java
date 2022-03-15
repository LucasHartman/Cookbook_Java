import java.util.*;

public class Exercise61 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(new Integer(5)); // add Integer
        myList.add(42); // int converted Integer
        //myList("113"); // can't change a String to an Integer
        myList.add(new Integer("7"));   // add Integer

        System.out.println(myList);
    }    
}
