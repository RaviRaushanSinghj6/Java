package Arrays14;
import java.util.Scanner;

public class PrintingArray {
    public static void print_Array(int[] arr, int len){

        // Printing using FOREACH loop
        System.out.println("USING FOR EACH LOOP");
        for(int i : arr) System.out.print(i + " ");

        // Printing using for loop
        System.out.println("USING FOR LOOP");
        for (int i = 0; i< len; i++) System.out.print(arr[i] + " ");

        //Printing using WHILE Loop
        System.out.println("USING WHILE LOOP");
        int i=0;
        while(i < len) { System.out.print(arr[i] + " "); i++; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int [] Array = new int[n];
        System.out.println("Enter " +n+ " elements in Array");
        for (int i= 0; i<n; i++){
            Array[i] = sc.nextInt();
        }
        print_Array(Array ,n);
    }
}
