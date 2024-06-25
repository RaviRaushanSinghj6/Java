public class CONTINUE {

    public static void main(String[] args) {
        // This variable will store the numbers to be iterated through
        int number = 1;

        // Loop through numbers from 1 to 20 (inclusive)
        while (number <= 20) {
            // Check if the current number is divisible by 3
            if (number % 3 == 0) {
                // If it's divisible by 3, skip to the next number without printing
                number++;
                continue;
            }

            // If not divisible by 3, print the current number
            System.out.println(number);

            // Increment the number for the next iteration
            number++;
        }
    }
}
