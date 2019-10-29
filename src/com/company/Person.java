package com.company;


public class Person extends Record {
    private String name;
    private String surname;
    private String phone;
    private String email;


    @Override
    public void askInfo() {
        name = ValueInput.askString("Name");
        surname = ValueInput.askString("surname");
        phone = ValueInput.askString("Phone");
        email = ValueInput.askString("E-Mail");
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
    public boolean contains(String rec) {
        return super.contains(rec)
                || name.contains(rec)
                || surname.contains(rec)
                || phone.contains(rec)
                || email.contains(rec);

    }

    @Override
    public String toString() {
        return "Person> " +
                "id: " + getId() +
                " name:'" + name + '\'' +
                " surname:'" + surname + '\'' +
                " phone:'" + phone + '\'' +
                " email:'" + email + '\'';
    }


}
