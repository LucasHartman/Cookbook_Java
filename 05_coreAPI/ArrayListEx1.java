/*
-- java.util.ArrayList
-   The Java API provides an extensive range of classes that support common data structures such as 
    Lists, Sets, Maps, and Queues. "The Collection API"
-   The ArrayList class is in the java.util package.
-   ArrayList implements the List interface.
-   ArrayLists hold only object references, not actual objects and not primitives.
    int is being autoboxed (converted) into an Integer object and then added to the ArrayList.


--  Autoboxing
-   Collections like ArrayList can hold objects but not primitives.
-   Wrapper classes (e.g., Integer, Float, Boolean, and so on)
-   Primitives still have to be wrapped before they can be
    added to ArrayLists, but autoboxing takes care of it for you.


--  List Reference Examples
    List frisbees = new  List ();       // wrong
    List frisbees = new  Object ();     // wrong
    List frisbees = new  ArrayList ();  // Right
-   List is an interface and not a class.
-   While Object is a concrete class, 
    it does not implement the List interface so it cannot be assigned to frisbees. 
-   Since List is an interface, objects cannot be created of the type list.
    We need a class implements th e

--  Reference Variable
-   Source: https://www.geeksforgeeks.org/reference-variable-in-java/
-   Syntax: Demo D1 = new Demo();
-   When we create an object (instance) of class the space is reserved in head memory.
-   how to access that space?
-   We create a Pointing element or simple called Reference variable,
    which simply points out the Object(the created space in a Heap Memory).

--  Heap memory
-   Source: https://www.javatpoint.com/java-heap
-   In Java, heap is a chunk of memory which is shared among all threads.
-   In a heap, all class instances and the array is allocated.
-   It is created when JVM starts-up.
-   An automatic storage management system reclaims head.

--  Object class
-   Source: https://www.javatpoint.com/object-class
-   The Object class is the parent class of all the classes in java by default.
-   The Object class is beneficial if you want to refer any object whose type you don't know.
-   Notice that parent class reference variable can refer the child class object, 
    know as upcasting.

--  List Interface
-   Source:    https://www.geeksforgeeks.org/list-interface-java-examples/
-   The List interface provides a way to store the ordered collection
-   List is a child interface of Collection
    ArrayList (Class) ---implements---> List (Interface) ---Extends---> Collection
-   It is an ordered collection of object in which duplicate values can be stored.
-   Since List preserves the insertion order, 
    it allow positional access and insertion of elements.

--  Generic Method
-   Source: https://www.javatpoint.com/generics-in-java
-   Generics mean parameterized types.
-   Type-safety:    We can hold only a single type of objects in generics. 
-   Without Generics, we can store any type of objects.
        List list = new ArrayList();
        list.add(10);       // integer
        list.add("10");     // String
-   With Generics, it is required to specify the type of object we need to store:
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add("10"); // compile-time error

--  Diamond Operator
-   Source:    https://www.baeldung.com/java-diamond-operator
-   Generics:   Which allowed us to parameterize the type arguments for classes.
-   Specify the parameterized type in the constructor:
    List<String> cars = new ArrayList<String>();
-   Most suitable constructor declaration:
    List<String> cars = new ArrayList<>();

--  Collections API
-   Source: https://www.geeksforgeeks.org/collections-in-java-2/
-   The API has a basic set of interfaces like Collection, Set, List, 
    or Map, all the classes (ArrayList, LinkedList, Vector, etc) 
    that implement these interfaces have some common set of methods.

--  Set Interface
-   Extends the Collection Interface
-   Methods:
1 	        add( )          Adds an object to the collection.
2 	        clear( )        Removes all objects from the collection.
3 	        contains( )     Returns true if a specified object is an element within the collection.
4 	        isEmpty( )      Returns true if the collection has no elements.
5 	        iterator( )     Returns an Iterator object for the collection, which may be used to retrieve an object.
6 	        remove( )       Removes a specified object from the collection.
7 	        size( )         Returns the number of elements in the collection.

-- List Interface
-   Extends the Collection Interface
-   Methods
1 	        void add(int index, Object obj)

            Inserts obj into the invoking list at the index passed in the index. 
            Any pre-existing elements at or beyond the point of insertion are shifted up. 
            Thus, no elements are overwritten.

2 	        boolean addAll(int index, Collection c)

            Inserts all elements of c into the invoking list at the index passed in the index. 
            Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, 
            no elements are overwritten. 
            Returns true if the invoking list changes and returns false otherwise.

3 	        Object get(int index)

            Returns the object stored at the specified index within the invoking collection.

4 	        int indexOf(Object obj)

            Returns the index of the first instance of obj in the invoking list. 

            If obj is not an element of the list, .1 is returned.

5 	        int lastIndexOf(Object obj)

            Returns the index of the last instance of obj in the invoking list. 
            If obj is not an element of the list, .1 is returned.
6 	        ListIterator listIterator( )
            Returns an iterator to the start of the invoking list.

7 	        ListIterator listIterator(int index)

            Returns an iterator to the invoking list that begins at the specified index.

8 	        Object remove(int index)

            Removes the element at position index from the invoking list and 
            returns the deleted element. The resulting list is compacted. 
            That is, the indexes of subsequent elements are decremented by one.

9 	        Object set(int index, Object obj)

            Assigns obj to the location specified by index within the invoking list.

10 	        List subList(int start, int end)

            Returns a list that includes elements from start to end.1 in the invoking list. 
            Elements in the returned list are also referenced by the invoking object.

*/


public class ArrayListEx1 {
    public static void main(String[] args) {

        // declare & construct
        List<String> c = new ArrayList<String>(); 


        // initilize
        c.add("Rome");
        c.add("Naples");
        c.add("Rome");


        // Methods
        c.add("Amsterdam");
        c.get(1);
        c.size();
        c.contains("Amsterdam");
        c.indexOf("Amsterdam");
        c.remove(1);
        c.revmoe("Amsterdam"); // first in list
        c.clear();


        // Wrap (autoboxing)
        Integer y = new Integer(555);   // wrap 
        int x = y.intValue();           // unwrap
    }
}