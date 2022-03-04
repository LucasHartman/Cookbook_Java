/*

Given the application below, what data types can be inserted into the blank that would
allow the code to print 3? (Choose three


A. boolean
B. short        // true     data type short matches our message signature.
C. int                      int and long are larger than short and will trigger different overloaded versions of drive() to be called
D. byte         // true
E. long
F. float        // true -    float can be implicitly converted to double

B, D, F. 

The compiler will broaden the data type on a numeric value until it finds a compatible signature. 

There are two versions of the drive() methods that return a value of 3, one that
takes a short and one that takes a double. 

Option A is incorrect because boolean cannot be
converted to either of these types and trying to do so triggers a compiler error. 

Option B is cor-
rect because the data type short matches our message signature. Options C and E are incorrect.
Remember that int and long are larger than short and will trigger different overloaded ver-
sions of drive() to be called, one that returns 5 and one that returns 2, respectively. Option D
is correct. The byte value can be implicitly converted to short, and there are no other matching
method signatures that take a byte value. Finally, Option F is correct because float can be
implicitly converted to double, and there is no other version of drive() that takes a float value.

*/

public class Exercise10 {
    public int drive(long car) { return 2; }
    public int drive(double car) { return 3; }
    public int drive(int car) { return 5; }
    public int drive(short car) { return 3; }
public static void main(String[] gears) {
    ____ value = 5;
    System.out.print(new Exercise10().drive(value));
    }
}

