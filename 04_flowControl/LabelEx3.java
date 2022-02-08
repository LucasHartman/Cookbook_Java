public class LabelEx3 {

    public static void main(String[] args) {
        
        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
        RABBIT: for(int col = 0; col <3 ; col++) {
        if((col + row) % 2 == 0)
        
        //break BUNNY; // prints 1

    
        //break RABBIT;    // prints 2
        //continue BUNNY;  // prints 2
        //break;           // prints 2
        
        count++;
        }
        System.out.println(count); //2


    }
    
}
