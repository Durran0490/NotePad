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
                case "delete":
                    deleteId();
                    break;
                case "clean":
                    findAndClean();
                    break;
                default:
                    System.out.println("Invalid message!");
            }
        } while (!cmd.equals("exit"));
    }

    private static void findAndClean() {
        System.out.print("delete by name> ");
        String rec = scan.next();
        for (int i = 0; i < list.size(); i++) {
            Record r = list.get(i);
            if (r.contains(rec)) {
                System.out.printf("You removed record: %s with word: %s\n", i, rec);
                list.remove(i);
            }
        }
    }

    private static void deleteId() {
        System.out.print("delete ID> ");
        int num = scan.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Record r = list.get(i);
            if (num == r.getId()) {
                System.out.printf("You removed record: %s with ID: %d\n", i, num);
                list.remove(i);
                break;
            }
        }
    }

    private static void find() {
        System.out.print("find> ");
        String str = scan.next();
        for (Record r : list) {
            if (r.contains(str)) {
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
            case "reminder":
                createRecord(new Reminder());
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
