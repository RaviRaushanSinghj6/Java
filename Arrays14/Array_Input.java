package Arrays14;

import java.sql.Array;
import java.util.Scanner;

public class Array_Input
{
    //Printing Array
    static void Print_Array( int[] array){
        for(int i: array){
            System.out.println(i + " ");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter" +n+ "Elements of array");
        for(int i =0; i<n; i++){
            Array[i] = sc.nextInt();
        }
        Print_Array(Array);
    }


}
