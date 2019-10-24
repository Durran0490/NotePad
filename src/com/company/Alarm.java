package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarm extends Note {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH mm");
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean contains(String rec) {
        return super.contains(rec) || time.format(TIME_FORMAT).contains(rec);
    }

    @Override
    public void askInfo() {
        System.out.print("Write your time> ");
        String strTime = Main.scan.next();
        time = LocalTime.parse(strTime, TIME_FORMAT);
        super.askInfo();

    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id: " + getId() +
                " time='" + time.format(TIME_FORMAT) + '\'' +
                "note='" + getNote() + '\'' +
                '}';
    }
}
