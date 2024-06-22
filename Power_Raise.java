import java.util.Scanner;

public class Power_Raise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base number");
        int a = s.nextInt();
        System.out.println("Enter power number");
        int b = s.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
