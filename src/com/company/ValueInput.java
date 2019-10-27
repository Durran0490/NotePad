package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class ValueInput {

    public LocalTime parseTime() {
        while (true) {
            try {
                System.out.print("Write your time> ");
                String date = Main.scan.next();
                return LocalTime.parse(date, Reminder.TIME_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.printf("Please input in %s format\n", Reminder.TIME_FORMAT);
            }
        }
    }

    public LocalDate parseDate() {
        while (true) {
            try {
                System.out.print("Write your date> ");
                String date = Main.scan.next();
                return LocalDate.parse(date, Reminder.DATE_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.printf("Please input in %s format\n", Reminder.DATE_FORMAT);
            }
        }
    }

}
