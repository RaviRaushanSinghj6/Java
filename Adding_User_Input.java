import java.util.Scanner;

public class Adding_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num_1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num_2 = sc.nextInt();

        int result = num_1 + num_2;

        System.out.println("Sum = " + result);
    }
}