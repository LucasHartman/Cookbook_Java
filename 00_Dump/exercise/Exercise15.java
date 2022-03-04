/*
A. Line h1
B. Line h2
C. Line h3
D. Line h4
E. Line h5
F. Line h6

A, B, C. All of the compilation issues with this code involve access modifiers. 

First, all interface methods are implicitly public, and explicitly setting an interface method to pro-
tected causes a compilation error on line h1, making Option A correct. 

Next, lines h2 and h3 both override the interface method with the package-private access modifier. Since this
reduces the implied visibility of public, the overrides are invalid and neither line compiles.
Therefore, Options B and C are also correct. 

Note that the RuntimeException is allowed
in an overridden method even though it is not in the parent method signature because only
new checked exceptions in overridden methods cause compilation errors. Line h4 is valid.
An object can be implicitly cast to a superclass or inherited interface. Finally, lines h5 and
h6 will compile without issue but independently throw a ClassCastException and a
NullPointerException at runtime, respectively. Since the question only asks about compi-
lation problems, neither of these are correct answers.

*/

interface Friend {
    String getName(); // h1 can't use protected inside a interface
}
    
class Cat implements Friend {
        
    String getName() {  //  h2 override the interface method with the (default) package-private access modifier. 
                        //  Since this reduces the implied visibility of public, the overrides are invalid
        return "Kitty";
    }
}
        
public class Exercise15 implements Friend {

    String getName() throws RuntimeException { // h3
        return "Doggy";
    }

    public static void main(String[] adoption) {
        Friend friend = new Dog(); // h4
        System.out.print(((Cat)friend).getName()); // h5
        System.out.print(((Exercise15)null).getName()); // h6
        }
    }