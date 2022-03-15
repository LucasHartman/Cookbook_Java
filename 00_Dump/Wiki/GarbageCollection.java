/*
-- Garbage collection (GC)
-   Source: https://www.geeksforgeeks.org/garbage-collection-java/
-   Automatic memory management.
-   Object of created on the heap, a potion of memory dedicated to the program.
-   Eventually, some object wound be needed.
-   The garbage collector, destroying unreachable objects.

-- in-use object
-   An in-use object, or a referenced object,
    means that some part of your program still maintains a 
    pointer to that object.

-- Make an object eligible for Garbage Collector
1.  Nullifying the reference variable
2.  Re-assigning the reference variable
3.  An object created inside the method
4.  Island of Isolation

-- Ways for requesting JVM to run Garbage Collector
-   Once we make an object eligible for garbage collection, 
    it may not destroy immediately by the garbage collector. 
    Whenever JVM runs the Garbage Collector program, then only the object will be destroyed. 
    But when JVM runs Garbage Collector, we can not expect.
    We can also request JVM to run Garbage Collector. 
    There are two ways to do it : 
-   Using System.gc() method: System class contain static method gc() for requesting JVM to run Garbage Collector.
-   Using Runtime.getRuntime().gc() method: 
    Runtime class allows the application to interface with the JVM in which the application is running. 
    Hence by using its gc() method, we can request JVM to run Garbage Collector.
-   There is no guarantee that any of the above two methods will run Garbage Collector.
-   The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc()

*/

public class GarbageCollection {
    public static void main(String[] fruits) {
        String shoe1 = new String("sandal");    // there are no references to "sandal"
        String shoe2 = new String("flip flop");
        String shoe3 = new String("croc");
        
        shoe1 = shoe2;  // point to "flip flop"
        shoe2 = shoe3;  // point to "croc"
        shoe3 = shoe1;  // point to "flip flop"
        }
}