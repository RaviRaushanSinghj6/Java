import java.util.Scanner;

public class Count_Digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = sc.nextInt();
        int Original =number;
        int c = 0;
        while(number>0)
        {
            number /=10;
            c++;
        }
        System.out.println("The number of digits in "+Original+ " = "+c);

    }
}
