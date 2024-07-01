package Arrays14;

import java.util.Scanner;

public class MaxOfArray {
    static int Max(int[]Array){
        int max = 0;
        for (int i: Array)
            if (i > max) {
                max = i;
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int len = sc.nextInt();
        int [] Array = new int[len];
        System.out.println("Enter Array Elements");
        for (int i = 0; i< len; i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Max value in Array is: ");
        System.out.println(Max(Array));
    }
}