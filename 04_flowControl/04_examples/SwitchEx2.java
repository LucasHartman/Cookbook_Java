public class SwitchEx2 {
    
    static int x = 7;

    public static void main(String[] args) {
        
        String s = "";

        for(int y=0; y<3; y++) {
            x++; 
            switch(x) { 
                case 8: s += "8 ";
                case 9: s += "9 "; // 1st
                case 10: { s += "10 "; break; } // 2nd 3rd
                default: s += "d "; // 4rd
                case 13: s += "13 "; // 4rd
            }
        }
        System.out.println(s);  // 9 10 10 d 13
        // loop 1: 7 x++ x++    = 9
        // loop 2: 9 x++        = 10 
        // loop 3: 10           = 10 ???
        // loop4:  10 x++       = 11
    }
    static { x++; } // <--- static initializer block goes first
}
