package com.example.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String... args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 1, 4);

        System.out.println(start.until(end, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(start, end));
    }

}
