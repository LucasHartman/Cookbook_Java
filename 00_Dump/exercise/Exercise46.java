public class Exercise46 {
    public static void main(String[] args) {
        int[] ia = {1,3,5,7,9};

        for(int x: ia) {                    // 1 1  3 3         9 9
            for(int j=0; j<3; j++) {        //
                if(x>4 && x<8) continue;    // stop cycle if condition is meth       
                System.out.print(" " +x);   // 
                if(j==1) break;             // stop inner loop
                continue;
            }
        continue;
        }
    }
}
