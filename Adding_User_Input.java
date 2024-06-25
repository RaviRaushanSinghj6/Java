import java.util.Scanner;  // Import the Scanner class

public class Adding_User_Input {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user for the first number
        System.out.println("Enter First Number");
        int num_1 = sc.nextInt();  // Read user input and save it as an integer

        // Ask the user for the second number
        System.out.println("Enter Second Number");
        int num_2 = sc.nextInt();  // Read user input and save it as an integer

        // Add the two numbers
        int result = num_1 + num_2;

        // Print the result
        System.out.println("Sum = " + result);
    }
}