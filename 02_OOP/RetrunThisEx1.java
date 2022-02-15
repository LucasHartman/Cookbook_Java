
class Student {
    private String name;
    private int age;

    Student SetValues() {
        String name = "lulu";
        int age = 23;

        this.name = name;
        this.age = age;

        return this; // return Student Class
    }

    public void display() {
    	System.out.println("name: " +name);       
        System.out.println("age:  " +age);        
    }
}


public class RetrunThisEx1 extends Student {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.SetValues();
        obj.display();
    }
}