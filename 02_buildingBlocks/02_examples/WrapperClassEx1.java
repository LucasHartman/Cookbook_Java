/*


-- Wrapper Classes
-   Source: https://www.w3schools.com/java/java_wrapper_classes.asp
-   Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
-   Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used
-   You can use certain methods to get information about the specific object:
        intValue(), 
        byteValue(), 
        shortValue(), 
        longValue(), 
        floatValue(), 
        doubleValue(), 
        charValue(), 
        booleanValue(), 
        toString()


-- Primitive -> Wrapper Class
- Convert primitive to a wrapper class is automated
-   Example
    Interger var = 5;


-- Wrapper Class  -> Primitive
-   Convert wrapper class to a primitive use methods
-   Example
    Interger myInt = 5;
    myInt.intValue())


--  Instance Method
    int i = new Integer(4);               // int type (no a Integer)
    System.out.print(i.byteValue());      // converts the given number(wrapper class) into a primitive byte 
-   does not allow calling an instance method on a primitive. 


--  parseInt() vs valueOf()
    int val1        = Integer.parseInt("5");
    Integer val2    = Interger.valueOf("5");
-   The parseInt() methods  input String,               return a primitive
-   The valueOf() methods   input Primitive or String,  return a wrapper class object.
*/

public class WrapperClassEx1 {

    public static void main(String[] args) {

      Integer myInt = 5;
      Double myDouble = 5.99;
      Character myChar = 'A';

      System.out.println(myInt);
      System.out.println(myDouble);
      System.out.println(myChar);
    }
  }
  