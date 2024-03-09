package com.example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.Month.*;

public class DepartArrive {

    public static void main(String[] args) {
        // Using the following information:
        //   * Use America/New_York as the time zone for Boston Logan Airport(BOS).
        //   * Use America/Los_Angeles as the time zone for San Francisco Airport (SFO).
        //   * Use Asia/Calcutta as the time zone for Bangalore's Bengaluru International Airport (BLR)
        ZoneId BOS = ZoneId.of("America/New_York");
        ZoneId SFO = ZoneId.of("America/Los_Angeles");
        ZoneId BLR = ZoneId.of("Asia/Calcutta");

        // 1) Flight 123, San Francisco to  Boston, leaves SFO at 10:30 PM June 13, 2014
        // The flight is 5 hours 30 minutes
        LocalDateTime departLocalSFO = LocalDateTime.of(2014, JUNE, 13, 22, 30);
        ZonedDateTime departZonedSFO = ZonedDateTime.of(departLocalSFO, SFO);

        //   What is the local time in Boston when the flight takes off?
        System.out.println("Flight 123 departs SFO at = " + departZonedSFO);

        ZonedDateTime departTimeAtBOS = departZonedSFO.toOffsetDateTime().atZoneSameInstant(BOS);
        System.out.println("Local time in Boston when flight departs SFO = " + departTimeAtBOS);

        //   What is the local time at Boston Logan airport when the flight arrives?
        System.out.println("\nFlight time = 5h30min\n");
        ZonedDateTime arriveBOS = departZonedSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
        System.out.println("Flight 123 arrives in BOS on: " + arriveBOS);

        //   What is the local time in San Francisco when the flight arrives?
        ZonedDateTime arriveTimeAtSFO = arriveBOS.toOffsetDateTime().atZoneSameInstant(SFO);
        System.out.println("Local time in SFO when flight arrives in Boston = " + arriveTimeAtSFO);
        //
        //
        //
        //
        //
        // 2) Flight 456, San Francisco to Bangalore, India, leaves SFO at Saturday, 10:30 PM June 28, 2014
        // The flight time is 22 hours
        //   Will the traveler make a meeting in Bangalore Monday at 9 AM local time?
        //   Can the traveler call her husband at a reasonable time when she arrives?

        System.out.println("\n===================================================================================================");

        LocalDateTime departLocalSFO2 = LocalDateTime.of(2014, JUNE, 28, 22, 30);
        ZonedDateTime departZonedSFO2 = ZonedDateTime.of(departLocalSFO2, SFO);
        System.out.println("\nFlight 456 leaves SFO on = " + departZonedSFO2);

        ZonedDateTime departTimeAtBLR = departZonedSFO2.toOffsetDateTime().atZoneSameInstant(BLR);
        System.out.println("Local time in BLR at departure from SFO = " + departTimeAtBLR);

        System.out.println("\nFlight time: 22h \n");

        ZonedDateTime arriveBLR = departZonedSFO2.plusHours(22).toOffsetDateTime().atZoneSameInstant(BLR);
        System.out.println("Flight 456 arrives in BLR on: " + arriveBLR);
        System.out.println("The passenger arrives on: " + arriveBLR.getDayOfWeek() + ", so he will be late for his meeting but he can call his wife at a reasonable time.");

        ZonedDateTime arriveTimeSFO = arriveBLR.toOffsetDateTime().atZoneSameInstant(SFO);
        System.out.println("Local time at SFO when flight arrives in BLR = " + arriveTimeSFO);

        System.out.println("\n===================================================================================================");

        // 3) Flight 123, San Francisco to Boston, leaves SFO at 10:30 PM Saturday, November 1st, 2014
        // Flight time is 5 hours 30 minutes.
        //   What day and time does the flight arrive in Boston?
        //   What happened?
        LocalDateTime departure = LocalDateTime.of(2014, NOVEMBER, 1, 22, 30);
        ZonedDateTime departSFO = ZonedDateTime.of(departure, SFO);

        System.out.println("\nFlight 123 departs SFO at : " + departSFO);

        ZonedDateTime departTimeAtBOS2 = departSFO.toOffsetDateTime().atZoneSameInstant(BOS);
        System.out.println("Local time in BOS when flight departs SFO: " + departTimeAtBOS2);

        System.out.println("\nFlight time: 5h30min\n");

        ZonedDateTime arriveBOS2 = departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
        System.out.println("Delayed Flight 123 arrives in BOS on = " + arriveBOS2);
        
        ZonedDateTime arriveTimeAtBOS = arriveBOS2.toOffsetDateTime().atZoneSameInstant(SFO);
        System.out.println("Local time at SFO when delayed flight arrives in Boston = " + arriveTimeAtBOS);
    }

}
