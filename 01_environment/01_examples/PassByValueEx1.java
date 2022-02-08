/*
-- Pass By Value
-   Source: https://blog.penjee.com/passing-by-value-vs-by-reference-java-graphical/
-   The term “passing a variable” is used when a function is called 
    with a variable you defined previously:
    int myAge = 14;
    calculateBirthYear(myAge);
    // declare
    int calculateBirthYear(int age) { return age+1; }


-- Pass by Reference
-   Pass by reference means a number (called an address) 
    is passed on which defines where the value is stored.
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