/*
-- JavaBeans
-   Source: https://www.tutorialspoint.com/jsp/jsp_java_beans.htm
-   specially constructed Java class written in the Java
-   1. It provides a default, no-argument constructor.
-   2. It may have a number of "getter" and "setter" methods for the properties.
-   3. Implements java.io.Serializable
-   Example:
    public class Employee implements java.io.Serializable{  
        private int id;  
        public Employee(){}  
        public void setId(int id){this.id=id;}  
        public int getId(){return id;}  
    }  
*/

public class javaBeanEx1 {

    private String desc;

    // getter
    public String getDescription() {
        return desc;
    }

    // setter
    public void setDescritpion(String d) {
        desc=d; // Initialize class variable
    }

    public static void modifyDesc(javaBeanEx1 item, String desc) {
        item = new javaBeanEx1(); // parameter variable = new Object
        item.setDescritpion(desc); // Initialize method in method
    }

    public static void main(String[] args) {
        javaBeanEx1 it = new javaBeanEx1();
        it.setDescritpion("Gobstopper");

        javaBeanEx1 it2 = new javaBeanEx1();
        it2.setDescritpion("Fizzylifting");

        System.out.println(it.getDescription());    // Gobstopper
        System.out.println(it2.getDescription());   // Fizzylifting
    }
}