/* 

??????????????????????????????????????????????/

This is a correct example of code that uses a lambda. 
The interface has a single abstract method. 
The lambda correctly takes one double parameter and returns a boolean. This 
matches the interface. The lambda syntax is correct. Since 45 is greater than 5
*/

public class LambdaEx2 {

    interface Target {                      // The interface has a single abstract method.
      
        // 1. declare
        boolean needToAim(double angle);
    }

    // 2. construct
    static void prepare(double angle, Target t) {
       boolean ready = t.needToAim(angle);
       System.out.println(ready);
   }

   public static void main(String[] args) {
    // 3. initialize
    prepare(45, d -> d > 5 || d < -5);   // The lambda syntax is correct. Since 45 is greater than 5    true
 }
}