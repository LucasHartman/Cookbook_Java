import java.util.*; 
import java.util.function.Predicate;

 /*
--  Lambda
-   Source: https://www.w3schools.com/java/java_lambda.asp
-   Syntax: 
            parameter -> expression
            (parameter1, parameter2) -> expression
            (parameter1, parameter2) -> {code block}
-   Lambda expressions are similar to methods,
    but they do not need a name and they can be implemented right in the body of a method
-   Lambdas use deferred execution:
    you can pass around so that it can be executed later, 
    just once or multiple times."
-   If the lambda expression needs to return a value, 
    the code block should have a return statement.
-   When creating a lambda with only one parameter, there are a few variants. 

    Predicate<String> pred1 = s -> false;               The pred1 approach shows the shortest way, 
                                                        where the type is omitted and the parentheses are omitted. 
    Predicate<String> pred2 = (s) -> false;             The pred2 approach is similar except it includes the parentheses. 
                                                        Both are legal. 
    Predicate<String> pred4 = (String s) -> false;      The  pred4 approach is the long way with both 
                                                        the parentheses and type specified.
    Predicate<String> pred3 = String s -> false;        The only one that doesn’t compile is pred3. 
                                                        The parentheses are required if including the type.
    Predicate pred4 = c -> c.equals("clear");           While it is common for a Predicate to have a generic type, 
                                                        it is not required.
*/
    
class Person {
    
    String name;
    int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



public class LambdaEx1 {

    // Declare Lambbda
    public static void checkAge(List <Person> list, Predicate < Person> predicate) {
        for (Person p : list) {
            if (predicate.test (p)) {
                System.out.println (p.name +" ");
            }
        }
    }


    public static void main(String[] args) {

        // Create a List from an Array
        List iList = Arrays.asList(
            new Person ("Hank", 45),
            new Person ("Charlie", 40),
            new Person ("Smith", 38));

        // initialize Lambda
        checkAge (iList, p -> p.getAge() > 40); // prints: Hank

    }
}