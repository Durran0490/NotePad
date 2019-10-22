package com.company;

public class Alarm extends Note {
    private String time;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean contains(String rec) {
        return super.contains(rec) || time.contains(rec);
    }

    @Override
    public void askInfo() {
        System.out.print("Write your alarm> ");
        time = Main.scan.next();
        super.askInfo();

    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id: " + getId() +
                "time='" + time + '\'' +
                "note='" + getNote() + '\'' +
                '}';
    }
}
