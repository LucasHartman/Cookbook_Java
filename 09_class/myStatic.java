
/*
Static Keyworkd
Is used for memory management mainly

We can apply static keword with variables, methods, blocks and nested classes

It makes your program memory efficient (it saves memory)


Static Variable
If you delcare any variable as static, it is know as static variable

The static variable can be used to refer to the common property of all objects 
(which is NOT UNIQUE for each object), 
for example, the company name of employees, college ane of students, etc.

The static variable gets memory only once in the class area at the time of class loading.
*/
import static java.lang.Integer.MAX_VALUE;

class Student {

    int rollno; // instance variable
    String name;

    static String college = "KSE"; // static variable

    // constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // method to dispaly the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}

public class myStatic {

    static {
        System.out.println("executed before the main method at the time of classloading");
    }

    public static void main(String[] args) {

        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        // There are 2 instances of a class, but only one static variable in memory
        Student.college = "SintLucas";

        s1.display();
        s2.display();

        // Example static import
        System.out.println(Integer.MAX_VALUE);
    }
}