import java.util.ArrayList;


/**
 * 
 * 
 * Valid lambdas
                    ()                      ->   true                               0 parameters

                    a                       ->   a.startsWith("test")               1 parameters

                    (String a)              ->   a.startsWith("test")               1 parameters    shows type

                    (a, b)                  ->   a.startsWith("test")               2 parameters    

                    (String a, String b)    ->   a.startsWith("test")               2 parameters    shows type

                    a                       ->   { return a.startsWith("test"); }   1 paramters     semicolon{}, which requires return keyword
 */

 // 1. Create Function Interface
interface StringFunction {
    String run(String str);
  }



public class myLambda {

    // 3. method which takes a lambda expression as a parameter
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }



    public static void main(String[] args) {


        // forEach( lambda expression )
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (Integer n) -> { System.out.println(n); });    // long version
        numbers.forEach( (n) -> { System.out.println(n); }  );
        numbers.forEach( n ->  System.out.println(n)        );          // short version

        //---------------------------------------------------------------------------------------------

        // list.forEach( lambda expression )
        List list = List.of(1, 2, 3);
        list.forEach(x -> System.out.println(x));

        // set.forEach( lambda expression )
        Set set = Set.of(1, 2, 3);
        set.forEach(x -> System.out.println(x)); // not in order

        // map.forEach( lambda expression )
        Map map = Map.of(1, 2, 3, 4);
        map.keySet().forEach(x -> System.out.println(x));
        map.values().forEach(x -> System.out.println(x));

        //---------------------------------------------------------------------------------------------

        // 2. Variable ( lambda expression )
        StringFunction exclaim = (s) -> s + "!";    // Type_Interface variableName = Lambda Expression
        StringFunction ask = (s) -> s + "?";

        // 4. Method (input lambda expression)
        printFormatted("Hello", exclaim);           // run method
        printFormatted("Hello", aks);               // run method

        //---------------------------------------------------------------------------------------------

    } 
}
