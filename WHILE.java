import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int n=1,a=0;

        while(n<=num)
        {
            System.out.println(n);
            a += n;
            n += 1;

        }
        System.out.println("The sum of "+num+" natural number is "+a);

    }
}
