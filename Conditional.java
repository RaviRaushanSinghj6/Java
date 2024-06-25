
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the user's input and store it in the 'number' variable
        int number = scanner.nextInt();

        // Check if the number is divisible by both 3 and 5 (most specific condition)
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Found! The number " + number + " is divisible by both 3 and 5.");
        } else if (number % 3 == 0 || number % 5 == 0) { // Check for divisibility by either 3 or 5
            System.out.println("The number " + number + " is divisible by either 3 or 5.");
        } else { // No need for a comment here, as the logic is clear
            System.out.println("The number " + number + " is not divisible by either 3 or 5.");
        }

        // Close the Scanner object (optional for basic usage)
        scanner.close();
    }
}
