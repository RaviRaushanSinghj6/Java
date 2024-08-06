package Arrays14;

import java.util.Scanner;

public class Count_Greater_Values_Than_X {
    public static int count(int[] array, int len, int value){
        int count = 0;
        for (int i =0; i<len; i++){
            if (array[i]>value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int len = sc.nextInt();
        int[] Array = new int[len];
        System.out.println("Enter "+len+ " elements in array:");
        for (int i = 0; i<len; i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter Value of X:");
        int x = sc.nextInt();
        int Ans = count(Array,len,x);
        System.out.println("Number of elements greater than " + x + ": " + Ans);
    }
}
