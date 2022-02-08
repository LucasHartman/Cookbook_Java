public class WhileEx2 {

    public static void main(String[] args) {
        
        int sing = 8, squawk = 2, notes = 0;
        
        while(sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes); // 23
        /*
                l1  l2
        ------------------
        sing    7   6       
        squak   4   6
        notes   11  23
        */

    }
    
}
