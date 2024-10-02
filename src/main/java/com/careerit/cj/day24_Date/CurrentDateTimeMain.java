package com.careerit.cj.day24_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeMain {

        public static void main(String[] args) {
            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println("Hello World !!! " + " Current date and time is : " + dateTime);
            System.out.println("Formatting the date and time");
            System.out.println(dateTime.getDayOfMonth() + "-" + dateTime.getMonthValue() + "-" + dateTime.getYear() + " "
                    + dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDateTime = dateTime.format(formatter);
            System.out.println("Formatted date and time : " + formattedDateTime);
        }
}
