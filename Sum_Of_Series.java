import java.util.Scanner;

// S= 1-2+3-4+5-6....n
public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0)
                ans += i;
            else
                ans -= i;
        }
        System.out.println(ans);
    }
}
