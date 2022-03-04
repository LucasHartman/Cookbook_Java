import java.util.*;
import java.util.function.*;

/*
A. This is a correct example of using lambdas. The code creates an ArrayList with three
elements. The print() method loops through and checks for negative numbers. Option A
is correct.
*/
 
public class PredicateEx1 {
 
public static void main(String[] args) {

    // The code creates an ArrayList with three elements.
    List<Integer> list= new ArrayList<>();
    list.add(-5);
    list.add(0);
    list.add(5);

    // The print() method loops through and checks for negative numbers.
    print(list, e -> e < 0);
}

// input List & Lambda Expression
public static void print(List<Integer> list, Predicate<Integer> p) {
    for (Integer num : list)            // get number from list
        if (p.test(num))                // lambda inputs num, is true
            System.out.println(num);    //-5
    }
}

