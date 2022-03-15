/*
-- JavaBean
-   Source: https://www.tutorialspoint.com/javabean-class-in-java
-   JavaBean is a specially constructed Java class, coded according to the JavaBeans API specification
-   1. It provides a default, no-argument constructor.
-   2. It should be serializable and that which can implement the Serializable interface
-   3. It may have a number of "getter" and "setter" methods for the properties (class variables).

-- java.io.Serializable (Interface)
-   Source:   https://www.geeksforgeeks.org/serializable-interface-in-java/
-   Does not have any methods and fields.
-   Class implement it if they want their instances to be Serialized or Deserialized.
-   Serialization is a mechanism of converting the state of an object into a byte steam.
-   Serialization is done using ObjectOutputStream
-   This mechanism is used to persist the object. 

-- byte steam
-   https://www.tutorialspoint.com/byte-streams-in-java
-   byte steam read/write data of 8 bits.
-   These can store characters, videos, audios, images. etc.

-- Java.io.ObjectOutputSteam Class
-   Source:   https://www.geeksforgeeks.org/java-io-objectoutputstream-class-java-set-1/
-   writes primitive data types and graphs of Java objects to an OutpustSTeam.
-   The objects can be read (reconstituted) using an ObjectInputSteam.

-- Valid/unValid signatures
A. public byte getNose(String nose)       -   // incorrect,   getter shout not take a value
B. public void setHead(int head)            // correct
C. public String getShoulders()             // correct
D. public long isMouth()                    // incorrect,   prefix "is" should only be with boolean values
E. public void gimmeEars()                  // incorrect,   just a method
F. public boolean isToes()                  // correct
*/

public class JavaBuinX implements java.io.Serializable {

    private int x;

    public void setter(int x) { this.x=x; }

    public int getter() { return x; }

    public boolean isser() { return x==0; }

    public static void main(String[] args) {
        JavaBuinX obj = new JavaBuinX();
        System.out.println(obj.isser()); // true
    }
    
}
