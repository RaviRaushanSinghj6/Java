package Sorting;

import java.util.Random;
import java.util.Scanner;

public class Array_Operation {
    public void Print_Array(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] Input_Array() {
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    // Method to generate an array with random integers
    public int[] Random_Array(int size, int bound) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i : array) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }
}
