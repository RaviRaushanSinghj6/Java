import java.util.Scanner;

public class Factorial { // More descriptive class name

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.println("Enter a non-negative integer: ");

        // Read the integer entered by the user
        int number = scanner.nextInt();

        // Validate user input (optional, but good practice for factorials)
        if (number < 0) {
            System.err.println("Error: Factorial is not defined for negative numbers.");
            return; // Exit the program if input is invalid
        }

        // Variable to store the factorial result
        int factorial = 1;

        // Loop to calculate factorial iteratively
        for (int i = 1; i <= number; i++) {
            // Multiply the factorial with the current loop counter (i)
            factorial *= i;

            // Print the factorial result for each iteration (optional)
            System.out.println("Factorial of " + i + " is " + factorial);
        }

        // Close the scanner object (optional but good practice)
        scanner.close();

        // Print the final factorial result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
