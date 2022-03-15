public class Exercise38 {
    public static void main(String[] args) {
        Days d1 = Days.TH;
        Days d2 = Days.M;

        for(Days d : Days.values()) {
            if (d.equals(Days.F)) break; // break at F, so d2 is never changed to F
            d2 = d; // M T W TH
        }
        System.out.println( (d1==d2) ? "same old" : "newly new"); // d1 = TH    d2 = TH
        
    }

    enum Days {M,T,W,TH,F,SA,SU};
    
}
