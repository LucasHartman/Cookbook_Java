/*
--  this() VS return this VS this parameter VS this.myMethod()
Source: https://www.geeksforgeeks.org/this-reference-in-java/
this(10 ,20);       Invoke constructor inside a constructor.
return this;        return the current class instance in a method
myMethod(this)      input class instance method or constructor
this.myMethod();    Invoke method inside a method
*/

public class Main {
    int x; // instance variable
  
    // Constructor with a parameter
    public Main(int x) {
      this.x = x; // local/instance variable
    }
}

public class thisEx1 {
    public static void main(String[] args) {

        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);
    }
}