/*
-- Method Chaining
-   Source: https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/
-   Syntax: obj.method1().method2().method3(); 
-   Method Chaining is the practice of calling different methods in a single line
-   Each method in chaining returns an object.
-   If we have on object and we call methods on that object one after another
*/

public class MethodChainEx1 {

    private int id;      
    private String name;  
    private int age;  
    private int std;
    

    public MethodChainEx1 setId(int id) {  
        this.id = id;  
        return this;  
    }

    public MethodChainEx1 setName(String name) {  
        this.name = name;  
        return this;  
    }

    public MethodChainEx1 setAge(int age) {  
        this.age = age;  
        return this;  
    }

    public MethodChainEx1 setStd(int std) {  
        this.std = std;  
        return this;  
    }

    public void detail() {  
        System.out.println("Student Detail is:\n");  
        System.out.println("Id: "+id+ "\nName: "+name+"\nAge: "+age+ "\nStandard: "+std);  
    }  



    public static void main(String[] args) {

        MethodChainEx1 student = new MethodChainEx1();  
        student.setId(1183).setName("Herry Tangri").setAge(17).setStd(9).detail();   //method chaining
    }
}