import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;



public class decisionsExam {

    // iterarte list
    private void print(int[] weather) {
        for ( int i=weather.length-1; i>=0; i-- ) { 
            System.out.println(weather[i]);
        }
    }

    //  compile-time constant(final), 
    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch(otherDay ){
            default:
            //case 1: continue; 
            // continue cannot be used inside a switch statement. 
            
            //case thursday: return DayOfWeek.THURSDAY;
            /* While the thursday variable is marked final,
               it is not a compiletime constant required for a switch statement, 
               as any int value can be passed in at runtime. */
            
            case 2: break;
            // break is compatible with switch statements.

            //case Sunday: return DayOfWeek.SUNDAY;
            // ?

            //case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
            // MONDAY is not a int(primitive) value
            // Switch do support Enum, but must have the wsame data type             
        }
        return DayOfWeek.FRIDAY;
    }


    // while loop, do/while loop, for loop
    private void countAttendies() {
        int participants=4, animals=2, performers=-1;

        while((participants = participants+1) <10){} // one: 5<10=true      two: 6<10=true three:7<10=truefour: 8<10=true five 9<10=true, six 10<10=false (loop 5 time, 6 loop does not run) 
        do {} while (animals++ <=1);                 // one: 2<=1=false     do/while loop, it executes at least once.      
        for( ; performers<2; performers+=2) {}       // one:-1<2 true 3     two: 3<2=false 

        System.out.println(participants);   // 10
        System.out.println(animals);        // 3
        System.out.println(performers);     // 3
    }






    public static void main(String[] args) {



        // if statement
        int temperature = 4;
        long humidity = -temperature + temperature * 3; // -4 + 12 = 8 
        if (temperature >= 4) // true
        if (humidity < 6) System.out.println("Too Low"); // flase
        else System.out.println("Just Right"); // output
        else System.out.println("Too High"); // this is part of the first if statement



        //  for-each loop
        List<Integer> myFavoriteNumbers = new ArrayList <>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for ( var a: myFavoriteNumbers) {
            System.out.println(a +", ");
            break;
        }
        for (int b : myFavoriteNumbers) {   // myFavoriteNumbers is Integer, they can be easily unboxed to int
            continue;                       // skiping out of the for each loop
            //System.out.print(b + ", ");     //  the print() statement is not reachable
        }
        for (Object c : myFavoriteNumbers)
        System.out.print(c + ", ");


        /* - for-each loop can be executed on any Collections object 
           that implements java.lang.Iterable, such as List or Set,
           but not all Collections classes, such as Map

           - The body of a do/while loop is executed one or more times, 
           whilt ethe body iof a while loop is executed  zero of more times

           - The conditional expression of for loops is evaluted at the start of the loop execution,
           meaning the for loops is evaluted at the start of the loop executions,
           meaning th3e for loop may execute zero or more times.

           - A default statement is not required in a switch statement. 
           if no case statements match and there is no defalut statement.
           If no case stament match and there is no default statement, 
           then the application will exit the switch statement withoud executiong any branches.

           - Each if statments together, but each else statemnet requires a new if statement
        */

        // nested Loop, conditional expression, labels
        int count =0;
        BUNNY:  for ( int row = 1; row <=3; row++) {

        RABBIT: for (int col = 0; col <3; col++ ) {     // nested loop
            if ((col + row) % 2 == 0);                  //  x % 2 == 0
            count++; // incremented
        }
        System.out.println(count);
        }




        // while loop, incremental--,  Assignment operators+=
        int sing=8, squawk=2, notes=0;
        while(sing > squawk) {          // i1: 8>2=true, i2:2:7>4=true      i3:6>6=false
            sing--;                     // i1:7,         i2:6
            squawk += 2;                // i1:4          i2:6
            notes += sing + squawk;     // i1:7+4=11,    i2:11+6+6=23 
        }
        System.out.println(notes);// 23


        // do-while loop
        boolean keepGoing = true;
        int result = 15, meters =10;
        do {
            meters--; // one: 10,        two: 9
            if(meters==8) keepGoing=false;
            result -=2; // one: 13      two: 11
        } while (keepGoing);
        System.out.println("result: " +result); // 11



        // var, data types
        for(var penguin : new int[2])        // data type int, penguin is int 
            System.out.println(penguin);

        var ostrich = new Character[3];     // data type Charqacter, ostrich is Character
            for(var emu : ostrich)
                System.out.println(emu);

        List parrots = new ArrayList();     // data type List, parrots is Object type
        for (var macaw : parrots)
        System.out.println(macaw);



        // Switch
        final char a = 'A', e ='E'; // compile-time Constants (finla)
        char grade = 'B'; // char type
        switch (grade) { // switch statement
            default: // does not do anything
            case a: // if var a, does not run
            case 'B': System.out.println("great"); // RUNS
            case 'D': System.out.print("good"); break;
            case e:
            case 'F': System.out.print("not good ");
        }

        System.out.println("");


        // Print Array Reverse
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};

        int q = wolf.length;
        for ( ; ; ) {
            System.out.print(wolf[--q]); // ybbew
            if (q==0) break; //  break add the end of the list
        }

        for (int m=wolf.length-1; m>=0; --m)
            System.out.print(wolf[m]); // ybbew

        //for(int z=0; z<wolf.length; z++)
           // System.out.print(wolf[wolf.length-z]); // out of bound
        /*
        int x = wolf.length-1;
        for(int j=0; x>=0 && j==0; x--)
            System.out.print(wolf[x]);

        final int r = wolf.length;
        for(int w=r-1; r>-1; w=r-1)
            System.out.print(wolf[w]);

        for(int i=wolf.length; i>0; --i)
            System.out.print(wolf[i]);
        */

    
        // do/while
        double iguana=0;
        int snake =1;
        do {
            System.out.print(snake++ +" "); // one: 1   two:2    three:3     four:4      five:5 
            iguana--;                       // one:0    two:-1   three:-2   -3    -4
        } while (snake <= 5);
        System.out.println(iguana); // -5.0


        // loop
        int height=1;
        L1: while(height++ <10) { 
            long humiditya = 12;
        L2: do {
            if(humiditya-- % 12 == 0) break ;
                int temperaturea = 30;
        L3: for ( ; ; ) {
            temperaturea++;
            if(temperaturea>50) break;
            }
            } while (humidity > 4);
        }

        // var in Swithc, pre-incremental
        var tailFeathers = 3;
        final var one=1;
        switch (tailFeathers) {
            case one: System.out.print(3 +" "); // ingore
            default: case3: System.out.print(5 + " "); // print 5
        }
        while (tailFeathers > 1) {
            System.out.print(--tailFeathers + " "); // one:2     two:1   three:Fasle
        }


        // if/else, 
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle; // true
        if (older = true) System.out.println("Success"); // true
        else System.out.println("Failure");
        //else if (penguin != 50) System.out.print("Other");


        /* 
        - The right side of a for-each statement must be primitive array
          or any class that implements java.lang.Iterable,
          which includes the Collection interface, although not all Collections Framewrk classes
        
        - Map does not implement Collection nor Iterable, since it is not a list of itms, but a mapping of items to other items.
        */


        // switch, incremental
        String insturment = "violin";
        final String CELLO = "cello";
        String viola = "viola"; // never used
        int p = -1;

        switch(insturment){ // = "violin"
            case "bass" : break;    // pass
            case CELLO : p++;       // pass
            default: p++;           // the default branch of the switch statement is executed at runtime.
            case "VIOLIN" : p++;    // pass
            case "viola" : ++p; break; // true: ++p=
        }
        System.out.print(p); // 2?


        // loops
        int w = 0, r=1;
        String name = "";
        while(w<2) { // one: 0<2    two:
            name += "A";
        do {
            name+= "B";
            if(name.length()>0) name += "C";
            else break;
        } while (r <=1);
        r++; w++; }
        System.out.print(name);






        



        
        
    









        
        
    
    
       
        
        
    }
    
}
