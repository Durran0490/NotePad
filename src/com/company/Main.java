package com.company;

import java.util.*;

public class Main {


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
                case "find":
                    find();
                    break;
                case "delete":
                    deleteId();
                    break;
                case "expired":
                    listExpired();
                    break;
                case "dismiss":
                    dismissTime();
                    break;
                //case "clean":
                //    findAndClean();
                //    break;
                default:
                    System.out.println("Invalid message!");
            }
        } while (!cmd.equals("exit"));
    }

   /* private static void findAndClean() {
        String rec = ValueInput.askString("delete by name");
        Iterator i = list.iterator();
        while (i.hasNext())
            if (i.next().contains(rec)) {
                //System.out.printf("You removed record: %s with word: %s\n", i.getId(), rec);
                i.remove();
            }
        //for (int i = 0; i < list.size(); i++) {
        //    Record r = list.get(i);
        //}
    }
    */

    private static void dismissTime() {
        int num = ValueInput.askInt("dismiss ID");
        for (int i = 0; i < list.size(); i++) {
            Record r = list.get(i);
            if (r instanceof Expirable && num == r.getId()) {
                Expirable e = (Expirable) r;
                System.out.printf("You dismissed record: %s with ID: %d\n", i, num);
                e.dismissRemind();
            } else {
                System.out.printf("Record: %s with ID: %d can't be dismissed\n", i, num);
            }
        }
    }

    private static void listExpired() {
        for (Record r : list) {
            if (r instanceof Expirable) {
                Expirable e = (Expirable) r;
                if (e.isExpired()) {
                    System.out.println(r);
                }
            }
        }
    }

    private static void deleteId() {
        int num = ValueInput.askInt("delete ID");
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
        String str = ValueInput.askString("find");
        for (Record r : list) {
            if (r.contains(str)) {
                System.out.printf("yep this contains %s \n ", str);
            }
        }
    }

    private static void createRecord() {
        String type = ValueInput.askString("create");
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
