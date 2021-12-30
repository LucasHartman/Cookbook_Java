
/*
--  HAS-A
-   HAS-A relationships are based on use, rather than inheritance.
-   Example:    A Horse IS-A Animal. A Horse HAS-A Halter.
-   HAS-A relationships allow you to design classes that follow good OO practices 
    by not having monolithic classes that do a gazillion different things.
-   “Specialized classes can actually help reduce bugs.” 
-   the more likely it is that you can reuse the class in other applications. 

Learn more: Design Patterns
Source:     https://www.javatpoint.com/design-patterns-in-java

*/

class Animal { }

class HasAEx1 extends Animal {  // HasAEx1 Is-A Animal
    
    // instance variable
    private Halter myHalter;    // Has A Halter
}