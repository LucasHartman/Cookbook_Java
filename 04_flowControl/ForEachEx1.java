public class ForEachEx1 {

    public static void main(String[] args) {
        
                // Create ArrayList
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                numbers.add(5);
                numbers.add(9);
                numbers.add(8);
                numbers.add(1);

                // Example: forEach Loop
                numbers.forEach( (Integer n) ->     { System.out.println(n); });    // long version
                numbers.forEach( (n) ->             { System.out.println(n); });
                numbers.forEach( n ->                 System.out.println(n));       // short version
    
        
    }
    
}
