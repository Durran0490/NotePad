package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable {
    private LocalDate date;
    boolean dismiss = false;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public void askInfo() {
        ValueInput in = new ValueInput();
        date = in.parseDate();
        super.askInfo();
    }

    @Override
    public boolean contains(String rec) {
        return super.contains(rec) || date.format(ValueInput.DATE_FORMAT).contains(rec);
    }

    @Override
    public String toString() {
        return "Reminder> " +
                "id: " + getId() +
                " Date: " + date.format(ValueInput.DATE_FORMAT) + '\'' +
                " Time: " + getTime().format(ValueInput.TIME_FORMAT) + '\'' +
                "note='" + getNote() + '\'' +
                '}';
    }

    @Override
    public boolean isExpired() {
        var dt = LocalDateTime.of(date, getTime());
        if (dismiss){
            return false;
        }
        return LocalDateTime.now().isAfter(dt);
    }

    @Override
    public void dismissRemind() {
        dismiss = true;
    }
}
