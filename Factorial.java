import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt(), ans = 1;

        for (int i = 1; i <= num; i++) {

            ans *= i;
            System.out.println("Factorial of " + i + " is " + ans);
        }
    }
}
