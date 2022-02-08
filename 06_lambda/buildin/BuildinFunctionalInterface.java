import java.util.function.Predicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.Random;

    /**
     * In this file we build a functional interfaces, 
     * imported from java.util.function package
     * Each functional interface need to be declare inside a Lambda expression
     * Check what type of argument and return value each Functional Interface has.
     * 
     * Full List:
     * https://www.educative.io/edpresso/a-list-of-all-the-functional-interfaces-in-java
     * 
     * -------------------------------------------------------------------------------------
     *                                      Predicate
     * -------------------------------------------------------------------------------------
     * The Predicate interface has an abstract method test
     * gives a Boolean value as a result
     * 
     * Abstract Method Name:   test 
     * argument:                any type
     * return:                  boolean type
     * 
     * public interface Predicate {
     *      public boolean test(T  t); }
     * 
     * -------------------------------------------------------------------------------------
     *                                      BinaryOperator
     * -------------------------------------------------------------------------------------
     * The BinaryOperator interface has an abstract method
     * apply which takes two argument and return a result of same type.
     * 
     * Abstract Method Name:    apply
     * Argument;                2 any types
     * return:                  same as argument
     * 
     * public interface BinaryOperator {
     *      public T apply(T x, T y);
     * } 
     * 
     * -------------------------------------------------------------------------------------
     *                                      Function 
     * -------------------------------------------------------------------------------------
     * The Function interface has an abstract method apply which takes argument of 
     * type T and returns a result of type R.
     * 
     * Abstract Method Name:    apply
     * Argument;                any
     * return:                  any
     * 
     * -------------------------------------------------------------------------------------
     *                                      Supplier 
     * -------------------------------------------------------------------------------------
     * The Supplier functional interface has an abstract method "get"
     * Supplier is a functional interface; it takes no arguments and returns a result.
     * 
     * Abstract Method Name:    get
     * Argument;                none
     * return:                  any
     * 
     * public interface Supplier<T> {
     *      T get();
     * }
     * 
     * -------------------------------------------------------------------------------------
     *                                      Consumer 
     * -------------------------------------------------------------------------------------
     * The Consumer functional interface has an abstract method "accept"
     * Consumer is a functional interface; it takes one arguments and returns nothing.
     * Often uses for print a message
     * 
     * Abstract Method Name:    accept
     * Argument;                any
     * return:                  none
     * 
     * public interface Consumer {
     *      void accept(T t)
     * }
     * 
     * 
     *  -------------------------------------------------------------------------------------
     *                                      MORE 
     * -------------------------------------------------------------------------------------
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */

class BuildinFunctionalInterface {
    public static void main(String args[]) {

        /*-------------------------------------------------------------------------------------
                                           Predicate
        -------------------------------------------------------------------------------------*/
        // Predicate (Declare)
        // argument "s":     String type
        // method:           check in the argument starts with a "G"
        // return:           boolean
        Predicate<String> predicateLambda = (s)->s.startsWith("G");

        // Predicate (Initialize)
        System.out.println( "Predicate: " +predicateLambda.test("Great")); // true


        /*-------------------------------------------------------------------------------------
                                           BinaryOperator
        -------------------------------------------------------------------------------------*/
        // BinaryOperator (Declare)
        // argument "x1", x2:       Integer type
        // method:                  add up 2 arguments
        // return:                  Integer
        BinaryOperator<Integer> BinaryLambda = (x1, x2) -> x1 + x2;

        // BinaryOperator (Initialize)
        Integer result2 = BinaryLambda.apply(2, 3);
        System.out.println("BinaryOperator: " +result2); // 5


        /*-------------------------------------------------------------------------------------
                                           Function
        -------------------------------------------------------------------------------------*/
        // Function (Declare)
        // argument x:              String
        // method:                  get String length
        // return:                  Integer
        Function<String, Integer> functionLambda = x -> x.length();

        // Function (Initialize)
        Integer result3 = functionLambda.apply("mkyong");   
        System.out.println("Function: " +result3); // 6


        /*-------------------------------------------------------------------------------------
                                            Supplier
        -------------------------------------------------------------------------------------*/
        // Supplier (Declare)
        // argument:                non
        // method:                  generate random number
        // return:                  Integer
        Supplier<Integer> supplierLambda = () ->  new Random().nextInt();

        // Supplier (Initialize)
        Integer result4 = supplierLambda.get();
        System.out.println("Supplier: " +result4);


        /*-------------------------------------------------------------------------------------
                                           Consumer
        -------------------------------------------------------------------------------------*/
         // Consumer (Declare)
        // argument:                any
        // method:                  print message
        // return:                  non
        Consumer<String> consumerLambda = x -> System.out.println("Consumer: "+x +" the dog and Finn the Human");

        // Conumser (Initialize)
        consumerLambda.accept("Jake");





        


        /*-------------------------------------------------------------------------------------
                                                Runnable
        ---------------------------------------------------------------------------------------
            method: run()
            arg:    0
            return: void
        -------------------------------------------------------------------------------------*/
        Runnable runnable = () -> { System.out.println("Lambda Runnable running"); };
        runnable.run();

        /*-------------------------------------------------------------------------------------
                                                BiConsumer
        ---------------------------------------------------------------------------------------
            method: accept()
            arg:    2
            return: void
        -------------------------------------------------------------------------------------*/
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);    // 3

        /*-------------------------------------------------------------------------------------
                                                BiFunction
        ---------------------------------------------------------------------------------------
            method: apply()
            arg:    2
            return: any
        -------------------------------------------------------------------------------------*/
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result); // 5



    }
}