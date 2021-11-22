import java.util.function.*;
import java.util.*;


interface Climb {
    boolean isTooHigh( int height, int limit);
}

public class functionExam {

    int age;
    private static void check (functionExam panda, Predicate<functionExam> pred) { // ????
        String result = pred.test(panda) ? "match" : "not match"; // 4. panda = p1      pred =  p.age < 5 = true
        System.out.println(result); // match
    }


    
    
    private static void check(Climb climb, int height) { // function arg1 Interface, arg2 height
        if (climb.isTooHigh(height, 10))    // if interface.function = true/false  
            System.out.println("too high"); // print
        else
            System.out.println("ok");       // or print
    }


    
    public void methodOuter() {
        methodInner(   (var x) -> {}, (var x, var y) -> 0    );
    }
    public void methodInner(Consumer<String> x,Comparator<Boolean> y) {}
   

    // input list if condition meth, remove characer from list
    public void remove(List<Character> chars) { // method ( arg1: Character list )
        char end = 'z';                         // local variable
        chars.removeIf(c -> {                   // list.method(lambda)
            char start = 'a';                   // local variable
            return start <= c && c <= end; });  // return condition: true/false
            //char start = 'a';
    }



    public void remove1(List<Character> chars) { // method input list
        char end = 'z';
        chars = null;
        chars.removeIf(c -> { // list.remove if condition is met
            char start = 'a'; return start <= c && c <= end; });
    }


    
    public static void main(String[] args) {

        // Predicate in an argument
        functionExam p1 = new functionExam(); // 1. create class construction
        p1.age = 1; // 2. declare field
         check(p1, p -> p.age < 5); // 3. run function: arg1 class, arg2 Predicate


        // method inputs a Functional Interface
        //check((h,m) -> h.append(m).isEmpty(), 5); // function ( arg1: lambda, arg2: 5 )


        List<String> list1 = new ArrayList<>();  // empyty arraylist
        list1.removeIf( s -> s.isEmpty() ); 
        // list          selected ArrayList
        // removeIf      function to remove elements base on predicate filter, lambda
        // s             selected element
        // s.isEmpty     check if elemet is empty'
    

        /*
        List list = List.of(1, 2, 3);
        Set set = Set.of(11, 22, 33); 
        Map map = Map.of(1, 2, 3, 4);
        list.forEach(x -> System.out.println(x));
        set.forEach(x -> System.out.println(x));
        map.keySet().forEach(x -> System.out.println(x));
        map.values().forEach(x -> System.out.println(x));



        Set<String> set2 = Set.of("mickey", "minnie");
        List<String> list2 = new ArrayList<>(set);
        set2.forEach(s -> System.out.println(s));
        list2.forEach(s -> System.out.println(s));
        */


        List<String> cats = new ArrayList<>();
        cats.add("leo");
        cats.add("Olivia");
        cats.sort((c1, c2) -> -c1.compareTo(c2));
        System.out.println(cats);




        //Predicate<Set<Double>> first = () -> Set.of(1.23);
        Predicate<Set<Double>> second = x -> true;



        int length = 3;
        for (int i = 0; i<3; i++) { // 3 loop
            if (i%2 == 0) { // if ( 0, 2 == true)
                Supplier<Integer> supplier = () -> length;  // 
                System.out.println(supplier.get()); // 3   3
            } else {
                int j = i; // 1
                Supplier<Integer> supplier = () -> j;
                System.out.println(supplier.get()); // 1
            }
        }



        





        



       






    }
}
