import java.util.Scanner;

/**
 * Exercise 1: Simple Calculator
 * -----------------------------
 * 
 * Objective: Create a simple command-line calculator that takes two integers as
 * input and performs basic arithmetic operations (addition, subtraction,
 * multiplication, and division).
 * 
 * Instructions:
 * 1. Prompt the user to enter two integers.
 * 2. Ask the user which operation they want to perform: add, subtract,
 * multiply, or divide.
 * 3. Use Scanner to read the user's input.
 * 4. Perform the chosen operation and display the result.
 * 5. Handle potential errors, such as division by zero or invalid inputs.
 */

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        scanner.close();

        int result = 0;
        boolean err = false;

        char operand = ' ';

        switch (operation) {
            case "":
                System.out.println("Error: please provide an operation type");
                err = true;
                break;
            case "add":
                result = add(number1, number2);
                operand = '+';
                break;
            case "subtract":
                result = subtract(number1, number2);
                operand = '-';
                break;
            case "multiply":
                result = multiply(number1, number2);
                operand = '*';
                break;
            case "divide":
                if (number2 == 0) {
                    System.out.println("Error: Division by zero");
                    err = true;
                    break;
                }
                result = divide(number1, number2);
                operand = '/';
                break;
            default:
                System.out.println("Error: invalid operation type");
                err = true;
                break;
        }

        if (!err) {
            System.out.println("Result: " + number1 + " " + operand + " " + number2 + " = " + result);
        } else {
            System.out.println("An error crashed the calculation");
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}