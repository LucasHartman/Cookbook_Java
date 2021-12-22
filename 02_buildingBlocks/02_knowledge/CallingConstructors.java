/** 
 * Create & Call a Constrcutor
 * - The purpose of a constructor is to initialize fields
 * - Construcotyr don't have return
 * - For most classes, you don’t have to code a constructor—the compiler will supply a “do nothing” default constructor for you. 
 * - 
 * 
 * 
*/
public class CallingConstructors {

    public CallingConstructors() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        
        // type name = new constructor();
        CallingConstructors obj = new CallingConstructors();

    }
    
}
