import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int radius = sc.nextInt();
        double pi = 3.1415926;
        double area = pi * (radius * radius);
        System.out.println("Area= " + area);
    }
}