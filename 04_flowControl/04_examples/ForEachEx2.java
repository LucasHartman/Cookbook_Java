import java.util.*;

public class ForEachEx2 {

    /*
    for-each statement must be:
        - primitive array
        - any class that implements java.lang.Iterable
        - set, int[], Collction
    */

    public static void main(String[] args) {
        
        for(var penguin : new int[2])   // type int
        System.out.println(penguin);    // 0 0 
        
        var ostrich = new Character[3]; // type Character
        for(var emu : ostrich)
        System.out.println(emu);        // null null null
        
        List parrots = new ArrayList(); // type Object
        for(var macaw : parrots)
        System.out.println(macaw);      //

    }
    
}
