/*

B. public Trouble()
C. public Trouble(int deep)
E. public Trouble(long deep)


B, C, E. The constructors declared by Options A, D, and F compile without issue. Option
B does not compile. 

Since there is no call to a parent constructor or constructor in the same
class, the compiler inserts a no-argument super() call as the first line of the
constructor.
Because Big does not have a no-argument constructor, the no-argument
constructor Trouble()does not compile.

Option C also does not compile because super()
and this() cannot be called in the same constructor. Note that if the super() state-
ment was removed, it would still not compile since this would be a recursive constructor
call.

Finally, Option E does not compile. There is no matching constructor that can take a
String followed by a long value.

If the input argument deep was an int in this construc-
tor, then it would match the constructor used in Option D and compile without issue.
*/

class Big {
    public Big(boolean stillIn) {
        super();
    }
}
     
class Trouble extends Big {

    public Trouble() {}
    /*  Since there is no call to a parent constructor or constructor in the same class, 
        the compiler inserts a no-argument super() call as the first line of the constructor.
        Because Big does not have a no-argument constructor, the no-argument constructor Trouble()does not compile. */
    
    public Trouble(int deep) {
        super(false);
        this(); // compile error 1
    }
    /*
    does not compile because super() and this() cannot be called in the same constructor. 
    Note that if the super() statement was removed, it would still not compile since this 
    would be a recursive constructor call.
    */
    
    public Trouble(String now, int... deep) {
        this(3);
    }

    public Trouble(long deep) {
        this("check",deep);
    }
    /* There is no matching constructor that can take a String followed by a long value. */

    public Trouble(double test) {
        super(test>5 ? true : false);
    }
}