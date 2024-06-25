import java.util.Scanner;

public class DOWHILE { // More descriptive class name

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");

        // Read the integer entered by the user
        int limit = scanner.nextInt();

        // Variable to store the sum of even numbers
        int sumOfEvenNumbers = 0;

        // Variable to iterate through even numbers (starts at 0)
        int currentEvenNumber = 0;

        // Use do-while loop to ensure at least one iteration
        do {
            // Print the current even number
            System.out.println(currentEvenNumber);

            // Add the current even number to the sum
            sumOfEvenNumbers += currentEvenNumber;

            // Increment the current even number by 2 (for next iteration)
            currentEvenNumber += 2;

        } while (currentEvenNumber <= limit); // Loop continues until currentEvenNumber exceeds limit

        // Close the scanner object (optional but good practice)
        scanner.close();

        // Print the final sum
        System.out.println("Sum of the first " + limit + " even numbers is: " + sumOfEvenNumbers);
    }
}
