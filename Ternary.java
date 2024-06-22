import java.util.Scanner;

public class Ternary
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        String Ans;
        Ans = (num%2 ==0)?"Even":"Odd";
        System.out.println(Ans);
    }
}

