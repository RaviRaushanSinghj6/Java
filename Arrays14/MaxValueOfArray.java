package Arrays14;

import java.util.Scanner;

public class MaxValueOfArray {
    static int max_val(int[] Array){
        int ans = 0;
        for(int i: Array){
            if(i > ans){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int [] Array = new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0; i<n; i++) Array[i] = sc.nextInt();

        System.out.println("Max value present in array is: ");
        int ans = max_val(Array);
        System.out.println(ans);
    }
}
