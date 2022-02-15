/**
 * Reading and Writing Member Fields
 * - It’s possible to read and write instance variables directly from the caller. 
 * - Reading a variable is known as getting it.
 * - Writing to a variable is known as setting it. 
 * 
 * 
 */

public class MemberFields {

    int numberEggs;                            // instance variable


    public static void main(String[] args) {
        
        MemberFields mother = new MemberFields();
        mother.numberEggs = 1;                  // set variable
        System.out.println(mother.numberEggs);  // read variable
     }
    
}
