/*
--  pass by value
-   Java is strictly pass by value. There is no pass by reference in Java
-   In the pass by value concept, the method is called by passing a value. So, it is called pass by value. 
    It does not affect the original parameter.


--  Pass by Reference (NONT IN JAVA)
-   the method is called using an alias or reference of the actual parameter.
-    It forwards the unique identifier of the object to the method.
-   If we made changes to the parameter's instance member, it would affect the original value.


--  

*/

public class PassByValueEx1 {
    public static void main(String[] args) {
        int x = 5;

        change(x);
        
        System.out.println(x); // 5
    }




    public static void change(int x) {
        x = 10; // no effect
    }
}