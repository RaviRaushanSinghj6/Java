import java.util.Scanner;

public class FOR {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int a = 0;
            int n=1;                //declaring outside for loop

//            for (int n=1;n<=num;n=n+2)
            for(;;)
            {
                System.out.println(n);
                n=n+2;              //declaring outside for loop
                a += n;
                if (n>num)          //declaring outside for loop
                    break;

            }
            System.out.println("The sum of odd number up to "+num+" is "+a);

        }
    }