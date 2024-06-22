import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle");
        float principle = sc.nextFloat();

        System.out.println("Enter Rate");
        float Rate = sc.nextFloat();

        System.out.println("Enter Time");
        float Time = sc.nextFloat();

        float SInterest = (principle * Rate * Time) / 100;

        System.out.println("Principle = " + principle);
        System.out.println("Rate = " + Rate);
        System.out.println("Time = " + Time);
        System.out.println("Simple Interest  = " + SInterest);
    }
}