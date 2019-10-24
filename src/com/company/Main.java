package com.company;

import java.util.*;

public class Main {


    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> list = new ArrayList<>();

    public static void main(String[] args) {
        scan.useDelimiter("\n");
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
                case "find":
                    find();
                    break;
                default:
                    System.out.println("Invalid message!");
            }
        } while (!cmd.equals("exit"));
    }

    private static void find() {
        System.out.print("find> ");
        String str = scan.next();
        for(Record r :list) {
            if(r.contains(str)){
                System.out.printf("yep this contains %s \n ", str);
            }
        }
            }


    private static void createRecord() {
        System.out.print("create>");
        String type = scan.next();
        switch (type) {
            case "person":
                createRecord(new Person());
                break;
            case "note":
                createRecord(new Note());
                break;
            case "alarm":
                createRecord(new Alarm());
                break;
            default:
                System.out.println("Invalid message");
        }
    }


    private static void createRecord(Record r) {
        r.askInfo();
        list.add(r);
    }

    private static void showList() {
        for (Record l : list) {
            System.out.println(l);
        }
    }

    private static void showHelp() {
        System.out.println("HELP! (Useful stuff will be added later eventually)");
    }

}
