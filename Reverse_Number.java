import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to reverse it");
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(+ans);
    }
}
