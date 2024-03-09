package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

    public static void main(String[] args) {

        // 1) Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
        LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
        LocalDate abeDies = LocalDate.of(1855, APRIL, 15);

        //   How old when he died?
        System.out.println("Abe died at the age of: " + abeBorn.until(abeDies, YEARS));

        //   How many days did he live?  
        System.out.println("Abe lived for " + abeBorn.until(abeDies, DAYS) + " days.");
        //
        //
        //
        // 2) Bennedict Cumberbatch, July 19, 1976
        LocalDate bennedict = LocalDate.of(1976, JULY, 19);

        //   Born in a leap year?
        System.out.println("\nWas Bennedict born in a leap year? Answer = " + bennedict.isLeapYear());

        //   How many days in the year he was born?
        System.out.println("How many days in the year Bennedict was born? Answer = " + bennedict.lengthOfYear());

        //   How many decades old is he?
        LocalDate now = LocalDate.now();
        System.out.println("Bennedict is " + bennedict.until(now, DECADES) + " decades old now.");

        //   What was the day of the week on his 21st birthday?
        System.out.println("It was a " + bennedict.plusYears(21).getDayOfWeek() + " on his 21st birthday.");
        //
        //
        //
        // 3) Train departs Boston at 1:45PM and arrives New York 7:25PM
        LocalTime departBoston = LocalTime.of(13, 45);
        LocalTime arriveNYC = LocalTime.of(19, 25);

        //   How many minutes long is the train ride?
        System.out.println("\nPlanned Travel time = " + departBoston.until(arriveNYC, MINUTES) + " minutes." );
        
        //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
        System.out.println("Delayed arrival time = " + arriveNYC.plusHours(1).plusMinutes(19));
        //
        //
        //
      
        // 4)Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
        LocalDateTime leaveBoston = LocalDateTime.of(2014, MARCH, 24, 21, 15);
        LocalDateTime arriveMiami = leaveBoston.plusHours(4).plusMinutes(15);
        
        //   When does it arrive in Miami?
        System.out.println("\nFlight arrives in Miami on: " + arriveMiami);
        
        //   When does it arrive if the flight is delays 4 hours 27 minutes?
        System.out.println("Delayed arrival = " + arriveMiami.plusHours(4).plusMinutes(27));
        //
        //
        //
        
        // 5) School semester starts the second Tuesday of September of this year.
        //   Hint: Look at the TemporalAdjusters class
        int excludeWeeks = 5; //(2 weeks off in December. 2 other vac weeks. school starts 2nd tuesday of September)
        LocalDate schoolStarts = LocalDate.of(2014, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY)).with(TemporalAdjusters.next(TUESDAY));
        LocalDate endOfFirstWeek = schoolStarts.with(TemporalAdjusters.next(FRIDAY));
        
        long firstWeekDays = schoolStarts.until(endOfFirstWeek, DAYS)+ 1;
        
        //   What is the date?
        System.out.println("\nSchool starts on: " + schoolStarts );
        
        //   School summer vacation starts June 25th
        //   Assuming:
        //     *  Two weeks off in December
        //     *  Two other vacation weeks
        //     *  School is taught Monday - Friday
        LocalDate schoolEnds = LocalDate.of(2015, JUNE, 25);
        System.out.println("School ends on: " + schoolEnds);
        
        long lastWeeksDays = 0;
        
        if (schoolEnds.getDayOfWeek() != MONDAY) {
            LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
            lastWeeksDays = lastWeekStart.until(schoolEnds, DAYS) + 1;
            excludeWeeks++;
        }
        
        
        //   How many days of school are there?
        //   Hint: keep track of the short weeks also
        long days = ((schoolStarts.until(schoolEnds, WEEKS) - excludeWeeks) * 5);
        days = days + firstWeekDays + lastWeeksDays;
        System.out.println("Number of school days = " + days);
        //
        //
        //
        // 6) A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
        LocalTime meetingTime = LocalTime.of(13, 30);
        LocalDate meetingDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
        
        LocalDateTime meeting = LocalDateTime.of(meetingDate, meetingTime);
        
        //   What is the time of the week's meetings?
        System.out.println("The meeting time is: " + meeting);
    }

}
