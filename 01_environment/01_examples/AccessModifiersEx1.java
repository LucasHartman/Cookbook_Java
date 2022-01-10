
/*
-- Access Modifiers

-- public
-

-- protected
-   The protected and default access control levels are almost identical, but with one critical difference.
-    protected member can be accessed (through inheritance) by a subclass 
    even if the subclass is in a different package. 

-- default
-   Default protection is what you get when you DON'T type an access modifier 
    in the member declaration.
-   A default member may be accessed only if the class accessing the member belongs to the same package
-   The default and protected access control types have almost identical behavior, 
    except for one difference

- private
*/

public class AccessModifiersEx1 {

    void testStuff();       // no modifier make its default (accessed by classes within the same package)

    protected Dostuff();   // protected (accessed by subclass, through inheritcance)


    
    public static void main(String[] args) {

    }
}