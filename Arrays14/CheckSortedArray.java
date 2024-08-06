package Arrays14;

import java.util.Scanner;

public class CheckSortedArray {

    static boolean isSorted(int[] array, int length) {
        for (int i = 1; i < length; i++) {
            if (array[i] < array[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.println("Enter " + length + " elements in the array: ");
        for (int i = length - 1; i >= 0; i--) {
            array[i] = sc.nextInt();
        }

        boolean isSorted = isSorted(array, length);

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
