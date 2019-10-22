package com.company;

import java.lang.StringBuffer;

public class Person extends Record {
    private String name;
    private String surname;
    private String phone;
    private String email;


    public void askInfo() {
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

    //private String nameSpaces = ""+addSpaces(name);
    //private String surnameSpaces = ""+addSpaces(surname);

    @Override
    public String toString() {
        return "Person> " +
                "id: " + getId() +
                " name:'" + name +/*nameSpaces+*/ '\'' +
                " surname:'" + surname +/*surnameSpaces+*/ '\'' +
                " phone:'" + phone + '\'' +
                " email:'" + email + '\'';
    }

    /*private StringBuffer addSpaces(String name) {
        StringBuffer strBuff = new StringBuffer();
        for (int i = 0; i < (6 - name.length()); i++) {
            strBuff.insert(name.length()+i, " ");
        }
        return strBuff;
    }
    }*/
}
