package com.company;

import java.util.*;

public class Main {


    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> list = new ArrayList<>();

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
                    showList();
                    break;
                default:
                    System.out.println("Invalid message!");
            }
        } while (!cmd.equals("exit"));
    }


    private static void showList() {
        for (Record l : list) {
            System.out.println(l);
        }
    }

    private static void createRecord() {
        System.out.print("create>");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            case "note":
                createNote();
                break;
            default:
                System.out.println("Invalid message");
        }
    }

    private static void createNote() {
        Note p = new Note();
        p.askInfo();
        list.add(p);
    }

    private static void createPerson() {
        Person p = new Person();
        p.askInfo();
        list.add(p);

    }

    static void showHelp() {
        System.out.println("HELP! (Useful stuff will be added later eventually)");
    }

    }
