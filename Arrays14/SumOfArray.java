package Arrays14;

import java.util.Scanner;

public class SumOfArray {

    static int Sum(int []Array, int Length){
        int sum = 0;
        for(int i =0; i<Length;i++){
            sum += Array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = sc.nextInt();
        int[] Array = new int[len];
        System.out.println("Enter "+len+" Elements into Array");
        for(int i=0; i<len; i++){
            Array[i] = sc.nextInt();
        }
        int ans = Sum(Array, len);
        System.out.println("Sum of Array Elements is: " +ans);
    }
}
