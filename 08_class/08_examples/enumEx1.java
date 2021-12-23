/*
--  Enum
-   An enum is a special "class" that represents a group of constants 
    (unchangeable variables, like final variables).

Below are two examples of initializing a enum variable in the same and a different class
*/

public class Size {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
      }
    
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM; // Variable Type Enum
        System.out.println(myVar); // MEDIUM
    }
  }



  public class enumEx1 {
    public static void main(String[] args) {
      Size.Level myVar = Size.Level.MEDIUM; // Variable Type Class.Enum
      System.out.println(myVar); // MEDIUM
    }
  }


