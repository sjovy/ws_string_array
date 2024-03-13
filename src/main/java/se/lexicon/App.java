package se.lexicon;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    static String[] names = {"Erik Svensson"};

    public static void main( String[] args ) {

        int action;
        String name;
        Scanner scanner;

        System.out.println("Do you want to... ");
        System.out.println("search for name, press 1. ");
        System.out.println("add new name, press 2. ");

        scanner = new Scanner(System.in);
        action = scanner.nextInt();
        System.out.println("Enter name: ");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();

        switch (action) {
            case 1:
                findName(name);
                break;
            case 2:
                addName(name);
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }
        System.out.println(names.length);
        System.out.println("Thank You");
    }

    public static String findName(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                System.out.println(fullName);
                return fullName;
            }
        }
        System.out.println("null");
        return null;
    }

    public static boolean addName(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                System.out.println("Name already exists");
                return false;
            }
        }
        String[] tempNames = Arrays.copyOf(names, names.length + 1);
        tempNames[tempNames.length - 1] = fullName;
        names = tempNames;
        System.out.println("Name added");
        return true;
    }

}
