import java.util.Scanner;

/**
 * Exercise 2: Word Counter
 * Objective:
 * Create a program that reads multiple lines of text from the user
 * and counts the total number of words entered.
 * 
 * Instructions:
 * 1. Prompt the user to enter text line by line.
 * 2. Continue reading input until the user enters an empty line (just presses
 * "Enter").
 * 3. For each line, count the number of words.
 * 4. After the user finishes input, display the total word count.
 * 
 * Sample Output:
 * -------------------------------------
 * Enter a line of text: Hello world
 * Enter a line of text: This is a test
 * Enter a line of text:
 * Total word count: 5
 * -------------------------------------
 * 
 * Hints:
 * - Use scanner.nextLine() to read each line.
 * - Split the input into words using the split(" ") method.
 * - Stop the loop when the user enters an empty string ("").
 */

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = "NULL";
        String words = "";

        while (lineInput != "") {
            words += " ";

            System.out.print("Enter a line of text: ");
            lineInput = scanner.nextLine();

            words += lineInput;
        }

        scanner.close();

        String[] wordList = words.split(" ");

        System.out.printf("Total Word count: %d\n", (wordList.length - 1));
    }
}
