import java.time.LocalDateTime; // information about days, months, years, hours, minutes, seconds, and fractions of seconds.

import java.time.LocalDate; // accurate only to days.
import java.time.LocalTime; // refer only to hours, minutes, seconds, and fractions of seconds

import java.time.format.DateTimeFormatter; // format date/time objects for output and to parse input strings and convert them to date/time objects.

import  java.time.Period; // period of time, for example, "one year, two months, and three days."


public class CalendarEx2 {


    public static void main(String[] args) {

        LocalDate d = LocalDate.of(2018, 8, 15); // 2018-8-15
        d = d.plusDays(1);      // 2018-8-16

        LocalDate d2 = d.plusDays(1); // 2018-8-17
        
        LocalDate d3 = d2;      // 2018-8-17
        d2 = d2.plusDays(1);    // 2018-8-18

        System.out.println(d +" " +d2 +" " +d3); // 2018-8-16   2018-8-18   2018-8-17      




    }
}