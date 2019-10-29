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
        return super.contains(rec)
                || note.contains(rec);

        }


    @Override
    public void askInfo() {
        note = ValueInput.askString("Write your note");
    }

    @Override
    public String toString() {
        return "Note>" +
                "id: " + getId() +
                " note='" + note + '\'' +
                '}';
    }
}
