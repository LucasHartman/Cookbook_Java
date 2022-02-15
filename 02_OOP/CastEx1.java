/*
--  Typecast Objects
-   The casting of object references depends on the relationship of the classes involved in the same hierarchy

--  downcast
--  root class -> child class
-   cast a reference along the class hierarchy in a direction from the root class towards the children or subclasses

--  upcast
-   child class -> root class
-   cast a reference along the class hierarchy in a direction from the sub classes towards the root

-- Implicit Casting ( automatically )
-    A reference variable whose type is the same as the class from which the object was instantiated.
-   An Object as Object is a super class of every Class.
-   A reference variable whose type is a super class of the class from which the object was instantiated.
-   A reference variable whose type is an interface that is implemented by the class from which the object was instantiated.
-   A reference variable whose type is an interface that is implemented by a super class of the class from which the object was instantiated.

--  Explicit Casting
-   Name of the new “type” inside a pair of matched parentheses.
-   
*/


interface Vehicle {
}


class Car implements Vehicle {
}


public class CastEx1 extends Car {

    public static void main(String[] args) {

        // implicit ------------------------------------------------------------------------------------------------------------

        // // illegal - Vehicle interface reference
        //Vehicle v1 = new Vehicle(); 

        // A "Reference Variable" whose "Object Type" is an "Interface" that is implemented by the class from which the object was instantiated.
        Vehicle v2 = new Car();

        // A "Reference Variable" whose "Object Type" is the same as the class from which the object was instantiated.
        Car c1 = new Car();

        // A "Reference Variable" whose "Object Type" is a "Super Class" of the class from which the object was instantiated.
        Car c2 = new CastEx1();

        // A "Reference Variable" whose "Object Type" is an "Interface" that is implemented by a super class of the class from which the object was instantiated.
        Vehicle v3 = new CastEx1(); 

        // A "Reference Variable" whose "Object Type" is the same as the class from which the object was instantiated.
        CastEx1 c3 = new CastEx1();
    }
}