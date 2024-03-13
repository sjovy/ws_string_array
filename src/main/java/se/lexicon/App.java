package se.lexicon;


import java.util.Scanner;

public class App {
    static String[] names = {"Erik Svensson"};

    public static void main( String[] args ) {
        //String[] names = new String[1];
        //names[0] = "Erik Svensson";
        //System.out.println(names[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to search: ");
        String name = scanner.nextLine();
        find(name);
    }

    public static String find(final String fullName) {
        String nameFound = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                nameFound = names[i];
                System.out.println(nameFound);
            } else {
                nameFound = null;
                System.out.println("Name not found");
            }
        }
        return nameFound;
    }
}
