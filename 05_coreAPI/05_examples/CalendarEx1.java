import java.time.LocalDateTime; // information about days, months, years, hours, minutes, seconds, and fractions of seconds.

import java.time.LocalDate; // accurate only to days.
import java.time.LocalTime; // refer only to hours, minutes, seconds, and fractions of seconds

import java.time.format.DateTimeFormatter; // format date/time objects for output and to parse input strings and convert them to date/time objects.

import  java.time.Period; // period of time, for example, "one year, two months, and three days."


public class CalendarEx1 {

    /*
    --  calendar object
    -   "calendar object," which we use to refer to objects of one of the several types of calendar-related classes
    -   most of the calendar- related objects you’ll create are immutable. Just like String objects!
    */

    public static void main(String[] args) {

        // 1.get current time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now()             "+currentDateTime); // 2021-12-14T11:21:29.930865400

        // 2. describe a format
        //DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");  // AM / PM
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   // 24 hour
        
        // 3. current time + format
        String formatDateTime = currentDateTime.format(f);
        System.out.println("currentDateTime.format(f)       "+formatDateTime); 





        // Set Data
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMM uuuu"); // format
        LocalDate bday = LocalDate.parse("22 Mar 2025", f2);               // parse
        System.out.println("bday :                          "+bday.toString());        // print 2022-03-22
        
        // Calcualte Period 
        Period p1 = Period.between(LocalDate.now(), bday);
        System.out.println("get period days only:           "+p1.getDays());
        System.out.println("get period months only:         "+p1.getMonths());
        System.out.println("geat period years only:         "+p1.getYears());


    }
}