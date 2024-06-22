import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter day number");
        int day = s.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Unexpected value: " + day);
        }
    }
}
