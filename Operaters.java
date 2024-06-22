import java.util.Scanner;
public class Operaters {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number");
        int p = s.nextInt();
        System.out.println("Enter Second Number");
        int q = s.nextInt();

        System.out.println("Arithmetic Operators");
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        System.out.println("Relational Operator");
        System.out.println(p=q);
        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p>q);
        System.out.println(p<q);
        System.out.println(p<=q);
        System.out.println(p>=q);
        System.out.println("Logical Operators");
        System.out.println(p>q && p>=q);
        System.out.println(p>q || p<=q);
        System.out.println(!(p>q));
        System.out.println("Assignment Operators");
        p =5;
        q =10;
        System.out.println(p=q);
        System.out.println(p+=q);
        System.out.println(p-=q);
        System.out.println(p*=q);
        System.out.println(p/=q);
        System.out.println("Unary Operators");
        p = 10;
        System.out.println(+p);
        System.out.println(-p);
        System.out.println(++p);
        System.out.println(--p);
//        System.out.println(!p);


    }
}
