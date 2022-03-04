import java.util.List;
import java.util.Arrays;

public class Exercise13 {

    public static void main(String[] args) {
        
        List<String> drinks = Arrays.asList("can", "cup");

        //        container = 2;
        for ( int container = drinks.size(); container > 0; container++ ) {
            System.out.println(drinks.get(container-1) +",");
            // index 2-1 = cup
            // index 3-1 = ArrayIndexOutOfBoundsException 
        }
    }
    
}
