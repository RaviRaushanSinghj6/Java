import java.util.Scanner;

public class ReadingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String Name = sc.next();
        System.out.println("Name is:" + Name);

        System.out.println("Enter Character");
        char ch = sc.next().charAt(4);
        System.out.println("Character is: " + ch);

    }
}