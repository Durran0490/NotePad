package com.company;

public class Person {
    private static int counter = 0;
    private int id;
    private String name;
    private String surname;
    private String phone;

    public Person() {
        Person.counter++;
        this.id = counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }
}
