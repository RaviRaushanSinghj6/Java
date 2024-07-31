package Arrays14;

import java.util.Scanner;

public class Counting_Occurrences_of_Target_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter "+n+" elements in array:");
        for (int i=0; i<n;i++)
            Array[i] = sc.nextInt();
        int count = 0;
        System.out.println("Enter target number:");
        int target = sc.nextInt();
        for(int j:Array) {
            if (j != target) {
                continue;
            }
            count++;
        }
        System.out.println("Occurrences of target number in input number is: "+count);
    }
}
