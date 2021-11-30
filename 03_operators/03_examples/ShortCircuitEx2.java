public class ShortCircuitEx2 {

    public static void main(String[] args) {
        
        int ph = 7, vis = 2;
        boolean safe = (vis>2) && (ph++ >1);
        // (vis>2 = false) && (this side is not evaluated)
        // conclusion ph++ never happens
        System.out.println(safe); // false
        System.out.println(ph); // 7


        boolean taste = (3>2) || (ph++ >1);
        // (3>2 =ture) || (this side is not evaluated, 
        // OR found true on the left side)
        System.out.println(taste); // true
        System.out.println(ph); // 7



    }
    
}
