package com.company;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        Record.counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }


    public abstract void askInfo();

    public  boolean contains(String rec){
        return Integer.toString(id).contains(rec);
    }

}




