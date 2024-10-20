import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * Excercise 1: Easy Exercise: Create a List of Fruits
         * ---------------------------------------------------
         * FruitList fl = new FruitList();
         * 
         * fl.createFruitList();
         */

        /*
         * Excercise 2: Moderate Difficulty Exercise: Implement a Student Management
         * System
         * -----------------------------------------------------------------------------
         * ---
         * StudentManagment sm = new StudentManagment();
         * sm.manageStudents();
         */

        /*
         * Exercise 3: Using Collection Classes
         * ------------------------------------
         */

        List<String> guestList = new LinkedList<String>();
        guestList.add("Christophe");
        guestList.add("Bob");
        guestList.add("Juergen");
        guestList.add("Alice");

        printGuestList("Guest List:", guestList);

        // removing a guest
        System.out.println("Removing guest 2: " + guestList.get(1));
        guestList.remove(1);
        printGuestList("New Guest List:", guestList);

        // checking, if Bob is on the list
        if (guestList.contains("Bob")) {
            System.out.println("Bob is on the party :D");
        } else {
            System.out.println("Bob is missing :/");
        }
    }

    private static void printGuestList(String msg, List<String> gl) {
        System.out.println(msg);
        for (String guest : gl) {
            System.out.println(guest);
        }
        System.out.println();
    }
}
