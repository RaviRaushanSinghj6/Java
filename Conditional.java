import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur number");
        int num = s.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Found answer is divisible by 3 and 5:" + num);
        else if (num % 3 == 0 || num % 5 == 0)
            System.out.println("Divisible by Either 3 or 5");
        else
            System.out.println("Not divisible by 3 and 5");
    }
}
