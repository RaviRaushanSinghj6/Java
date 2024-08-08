package Arrays14;

import java.util.Scanner;

public class SmallestAndSecondLargest {
    public  static void PrintingArray(int[] ans) { //Printing Array
        for ( int i: ans) System.out.println(i);
    }

    static int[] BubbleSort (int[] Array, int len) {   //Sorting array using bubble sort
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len -i- 1; j++)
                if (Array[j] > Array[j+1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
        return Array;
    }

    static int[] smallest_and_second_largest(int[]Array, int len){
        int[] Sorted = BubbleSort(Array,len);
        int[] ans = new int[2];
        ans[0] = Sorted[0];
        ans[1] = Sorted[len-2];
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = sc.nextInt();
        if (len >= 2) {
            int[] Array = new int[len];
            System.out.println("Enter " + len + " Elements in array: ");
            for (int i = 0; i < len; i++) {
                Array[i] = sc.nextInt();
            }

            int[] Ans = smallest_and_second_largest(Array, len);
            PrintingArray(Ans);
        } else {
            System.out.println("Array must contain at least two elements.");
        }
        sc.close();

    }
}

