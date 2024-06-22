import java.util.Scanner;

public class DOWHILE {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = S.nextInt();
        int a = 0;
        int n = 0;


        do {
            System.out.println(n);
            a = a + n;
            n += 2;

        }
        while (n <= num);
        System.out.println("Sum of first " + num + " even numbers is " + a);

    }
}