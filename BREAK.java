public class BREAK {
    public static void main(String[] args) {
        // Start an infinite loop
        for (int n = 1; ; n++) {
            // Check if the number is divisible by both 5 and 7
            if (n % 5 == 0 && n % 7 == 0) {
                // If so, print the number and break the loop
                System.out.println(n);
                break;
            }
        }
    }
}