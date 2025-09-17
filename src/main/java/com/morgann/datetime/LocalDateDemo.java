package com.morgann.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {
        // Conversion String en LocalDate
        String dtString = "1964/04/27";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(dtString, dtf);
        System.out.println(localDate.toString());
    }
}
