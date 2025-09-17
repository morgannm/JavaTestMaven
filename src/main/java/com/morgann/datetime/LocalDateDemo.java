package com.morgann.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {
        // Conversion String en LocalDate
        String dtStringIn = "1964/04/27";
        DateTimeFormatter dtfin = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(dtStringIn, dtfin);
        System.out.println(localDate.toString());

        DateTimeFormatter dtout = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dtStringOut = localDate.format(dtout);
        System.out.println(dtStringOut);
    }
}
