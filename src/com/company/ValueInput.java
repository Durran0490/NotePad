package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class ValueInput {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH.mm");
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("uuuu.M.dd");
    private static final Scanner scan = new Scanner(System.in);

    static {
        scan.useDelimiter("\n");
    }

    public static String askString(String msg) {
        System.out.println(msg + "> ");
        return scan.next();
    }

    public static int askInt(String msg) {
        System.out.println(msg + "> ");
        int num = scan.nextInt();
        return num;
               //try{

               //}catch ()
    }

    public LocalTime parseTime() {
        while (true) {
            System.out.print("Write your time> ");
            try {
                String date = scan.next();
                return LocalTime.parse(date, TIME_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.printf("Please input in %s format\n", TIME_FORMAT);
            }
        }
    }

    public LocalDate parseDate() {
        while (true) {
            System.out.print("Write your date> ");
            try {
                String date = scan.next();
                return LocalDate.parse(date, DATE_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.printf("Please input in %s format\n", DATE_FORMAT);
            }
        }
    }

}
