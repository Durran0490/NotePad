package com.company;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy MM dd");
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void askInfo() {
        System.out.print("Write your date>");
        String strDate = Main.scan.next();
        date = LocalDate.parse(strDate, DATE_FORMAT);
        super.askInfo();
    }

    @Override
    public boolean contains(String rec) {
        return super.contains(rec) || date.format(DATE_FORMAT).contains(rec);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id: " + getId() +
                " Date: " + date.format(DATE_FORMAT) + '\'' +
                " Time: " + getTime().format(TIME_FORMAT) + '\'' +
                "note='" + getNote() + '\'' +
                '}';
    }
}
