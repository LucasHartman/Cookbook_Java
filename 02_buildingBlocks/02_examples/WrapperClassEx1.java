/*

--  Wrapper Class
-   use the wrapper class instead of the primitive typ
-   Since you're now working with objects, 
    you can use certain methods to get information about the specific object:
        intValue(), 
        byteValue(), 
        shortValue(), 
        longValue(), 
        floatValue(), 
        doubleValue(), 
        charValue(), 
        booleanValue(), 
        toString()
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
  