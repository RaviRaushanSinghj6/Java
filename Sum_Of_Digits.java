import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number");
        int Number = s.nextInt();
        int Ans = 0;

        while (Number>0)
        {
            Ans += Number%10;
            Number = Number/10;

        }
        System.out.println(+Ans);

    }
}
