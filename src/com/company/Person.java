package com.company;

public class Person extends Record{
    private String name;
    private String surname;
    private String phone;
    private String email;


    public void askInfo(){
        System.out.println("Name> ");
        name = Main.scan.next();
        System.out.println("surname> ");
        surname = Main.scan.next();
        System.out.println("Phone> ");
        phone = Main.scan.next();
        System.out.println("E-Mail >");
        email = Main.scan.next();

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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
