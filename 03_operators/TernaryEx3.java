

public class TernaryEx3 {

    public static void main(String[] args) {

        int x = 10, y = 5;
        boolean w = true, z = false;

        x = w ? y++ : y--;  // 5++
        w = !z;             // true 
        
        System.out.print( (x+y) +" " +(w ? 5 : 10)); // 11 5
        // (x+y)    (6+5=11)
        // w=true   5

    }

}