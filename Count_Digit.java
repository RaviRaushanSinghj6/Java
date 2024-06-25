import java.util.Scanner;

public class Count_Digit { // More descriptive class name
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter an integer number: ");

        // Read the integer entered by the user
        int number = scanner.nextInt();

        // Store the original number for output message
        int originalNumber = number;

        // Variable to count the number of digits
        int digitCount = 0;

        // Loop until the number becomes 0 (no more digits)
        while (number > 0) {
            // Remove the last digit by integer division
            number /= 10;

            // Increment the digit count for each iteration
            digitCount++;
        }

        // Close the scanner object (optional but good practice)
        scanner.close();

        // Print the final result with the original number
        System.out.println("The number of digits in " + originalNumber + " is: " + digitCount);
    }
}
