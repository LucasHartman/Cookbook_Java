public class EqualsMethodEx2 {

    /*
    Enum Equals() & ==

    - An enum can be compared using either equals() or ==.

    */

    public static void main(String[] args) {
        
        Days d1 = Days.TH;
        Days d2 = Days.M;

        for(Days d : Days.values() ) {
            if (d.equals(Days.F)) break;
            d2 = d; // d2 = Days.F
        }
        System.out.println( (d1==d2) ?  "same old" : "newly new" );         // d1==d2 true 
        System.out.println( (d1.equals(d2)) ?  "same old" : "newly new" );  // 1.equals(d2) true
    }
    enum Days { M, T, W, TH, F, SA, SU };
    
}
