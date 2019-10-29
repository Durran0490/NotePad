package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alarm extends Note implements Expirable{
    private LocalTime time;
    private LocalDate dismissedAt;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }



    @Override
    public boolean contains(String rec) {
        return super.contains(rec) || time.format(ValueInput.TIME_FORMAT).contains(rec);
    }

    @Override
    public void askInfo() {
        //System.out.print("Write your time> ");
        //String strTime = Main.scan.next();
        //time = LocalTime.parse(strTime, TIME_FORMAT);

        ValueInput in = new ValueInput();
        time = in.parseTime();
        super.askInfo();

    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id: " + getId() +
                " time='" + time.format(ValueInput.TIME_FORMAT) + '\'' +
                "note='" + getNote() + '\'' +
                '}';
    }

    @Override
    public boolean isExpired() {
        if ( LocalDate.now().equals(dismissedAt)) {
            return false;
        }
        return LocalTime.now().isAfter(time);
    }

    @Override
    public void  dismissRemind() {
        dismissedAt = LocalDate.now();
    }
}
