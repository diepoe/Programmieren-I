import java.util.Scanner;

/**
 * Exception Handling Exercise:
 * 
 * Create a method named divideNumbers(int a, int b) that takes two integers as
 * input and returns the result of dividing a by b. Handle any potential
 * exceptions that may occur during the division operation and display
 * appropriate error messages to the user.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("invalid division " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
