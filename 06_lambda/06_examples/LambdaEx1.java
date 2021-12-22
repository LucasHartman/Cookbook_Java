import java.util.*; 
import java.util.function.Predicate;

 /*
    --  Lambda
    -   passing code (lambda) as an argument (method, if statement argument)

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