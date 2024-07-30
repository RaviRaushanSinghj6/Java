package Arrays14;

import java.util.Scanner;

public class Array_Reference_Shallow_Copy {
    static void Print_Array(int[] arr){
        for(int i: arr){
            System.out.println(i +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array: ");
        int len = sc.nextInt();
        int[] Array = new int[len];
        System.out.println("Enter "+len+" Elements in array");
        for (int i=0; i<len;i++){
            Array[i] =sc.nextInt();
        }
        System.out.println("Input Array is: ");
        Print_Array(Array);

        System.out.println("Copied Array is: ");
        int[] Array2 =Array;
        Print_Array(Array2);
    }
}
