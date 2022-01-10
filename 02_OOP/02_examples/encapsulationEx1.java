
/*
--  Encapsulation
-   supports flexibility and maintainability and extensibility
-   

--  Rules
1.  Keep instance variables hidden (with an access modifier, often private)
2.  Make public accessor methods, and force calling code to use those methods rather than
    directly accessing the instance variable. 
    These so-called accessor methods allow users of your
    class to set a variable’s value or get a variable’s value.
3.  For these accessor methods, use the most common naming convention of 
    set<SomeProperty> and get<SomeProperty>.

--  Access Methods
-    getters and setters, other terms accessors and mutators
-   The point is, you can change your mind later 
    and add more code to your methods without breaking your API. <----------------
*/

public class EncapsulationEx1 {

    // instance variable hidden
    private String name;

    // accessor method, getter
    public String getName() {
        return name;
   }

   // accessor method - setter
    public void setName(String newName) {
        // add more code in the future without breaken your API
        name = newName;
    }



    public static void main(String[] args) {

    }
}