package com.company;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void askInfo(){
        System.out.println("Write your note> ");
        note = Main.scan.next();
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                "note='" + note + '\'' +
                '}';
    }
}
