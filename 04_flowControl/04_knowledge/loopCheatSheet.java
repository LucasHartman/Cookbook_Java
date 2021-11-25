import java.util.ArrayList;

public class loopCheatSheet {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }


        /*
         - The loop will always be executed at least once,
           even if the condition is false, because the code block 
           is executed before the condition is tested
        */
        int z = 0;
        do {
        System.out.println(i);
        z++;
        }
        while (z < 5);


        /*
        - When you know exactly how many times you want to loop through a block of code, 
        use the for loop instead of a while loop
        */
        for (int y = 0; i < 5; y++) {
            System.out.println(y);
          }


        /*
        - which is used exclusively to loop through elements in an array
        */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String j : cars) {
            System.out.println(j);
        }


        // forEach( lambda expression )
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (Integer n) -> { System.out.println(n); });    // long version
        numbers.forEach( (n) -> { System.out.println(n); }  );
        numbers.forEach( n ->  System.out.println(n)        );          // short version

          





    }
}
