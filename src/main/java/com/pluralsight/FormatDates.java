package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        //Get current date and time
        LocalDateTime now = LocalDateTime.now();

        //Format 1: MM/dd/yyyy
        String format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy").format(now);
        System.out.println("Format 1: " + format1);

        //Format 2: yyyy-MM-dd
        String format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(now);
        System.out.println("Format 2: " + format2);

        //Format 3: MMMM d, yyyy
        String format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy").format(now);
        System.out.println("Format 3: " + format3);

        //Format 4: EEEE, MMM, yyyy HH:mm (GMT)
        String format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm").withZone(ZoneId.of("GMT")).format(now);
        System.out.println("Format 4: " + format4);

        //Format 5: Local time (h:mm) on dd-MMM-yyyy
        ZonedDateTime localTime = now.atZone(ZoneId.systemDefault());
        String format5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy").format(localTime);
        System.out.println("Format 5: " + format5);
    }
}
