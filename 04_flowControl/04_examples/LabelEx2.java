public class LabelEx2 {
    public static void main(String[] args) {
        
        foreach:
        for (int j=0; j<5; j++) {
            for (int k=0; k<3; k++) {
                System.out.print(" " +j); // 0 1 1 1 2 3 3
                // l1: j=0 k=0  (j==0) break inner
                // l2: j=1 k=0
                // l3: j=1 k=1
                // l4: j=1 k=2  
                // l5: j=2 k=0 (j==2) beak inner
                // l6: j=3 k=0
                // l7: j=3 k=1 (j==3 && k==1) break foreach
                if(j==3 && k==1) break foreach;
                if(j==0 || j==2) break;
            } // end inner
        } // end outer (foreach)

    }
}
