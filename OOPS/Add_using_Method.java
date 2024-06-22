package OOPS;

import java.util.Scanner;

public class Add_using_Method {
    int Add(int a, int b)
    {
        int ans = a+b;
        return ans;
    }
}
class Main
{
    public static void main(String[] args) {
        Add_using_Method obj = new Add_using_Method();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Sum of input numbers is: ");
        int ans = obj.Add(a,b);
        System.out.println(ans);
    }
}
