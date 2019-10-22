package com.company;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean contains(String rec) {
        System.out.print("Find in note> ");
        return super.contains(rec);

        }


    @Override
    public void askInfo() {
        System.out.print("Write your note> ");
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
