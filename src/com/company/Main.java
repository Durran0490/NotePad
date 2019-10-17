package com.company;

import java.util.*;

public class Main {


    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome, Enter a command. Try 'help' for 'Help'");

        Scanner scan = new Scanner(System.in);
        String cmd;

        do {
            System.out.print("> ");
            cmd = scan.next();
            switch (cmd.toLowerCase()) {
                case "exit":
                    System.out.println("Bye Bye!");
                    return;
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    showPersonList();
                    break;
                default:
                    System.out.println("Invalid message!");
            }
        } while (cmd != "exit");
    }

    private static void showPersonList() {
        for (Person list : personList) {
            System.out.printf("%d %s %s %s\n",
                    list.getId(),
                    list.getName(),
                    list.getSurname(),
                    list.getPhone());
        }
    }

    private static void createRecord() {
        System.out.print("create>");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Invalid message");
        }
    }

    private static void createPerson() {
        System.out.println("Name> ");
        String name = scan.next();
        System.out.println("surname> ");
        String surname = scan.next();
        System.out.println("Phone> ");
        String phone = scan.next();

        Person p = new Person();
        p.setName(name);
        p.setSurname(surname);
        p.setPhone(phone);

        personList.add(p);

    }

    static void showHelp() {
        System.out.println("HELP! (Useful stuff will be added later eventually)");
    }

    /*static void addSpaces(String name){
        for (int i = 0; i < (10 -name.length()) ; i++) {
            System.out.print(" ");
        }
    }*/
}
