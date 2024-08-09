package Arrays14;

import java.util.Scanner;

public class FindPairSum {
    static int pairsum(int[]Array, int len, int target){
        int pair = 0;
        for (int i = 0; i<len; i++)
            for(int j = i+1; j<len;j++)
                if(Array[i]+Array[j]==target)
                    pair++;
        return pair;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = sc.nextInt();
        int  [] Array  =new int[len];
        System.out.println("Enter "+len+" elements in array: ");
        for (int i = 0; i<len; i++) Array[i] = sc.nextInt();
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int pair = pairsum(Array,len, target);
        System.out.println("Number of pairsums: "+pair);

    }
}
