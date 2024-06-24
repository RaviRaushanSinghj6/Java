/*
 Given an integer array arr, move all 0's to the end of it while maintaining the relative order of non-zero elements.
Note that you must do it this in place without making copy of array.
 input: 0 5 0 3 4 2
 output: 5 3 4 2 0 0
*/
package Sorting;

public class Bubble_Sort_MoveZeros_problem_40 {
    public static void main(String[] args) {
        Array_Operation op = new Array_Operation();
        int[] a = op.Input_Array();
        System.out.println("Input array is: ");
        op.Print_Array(a);

        int n = a.length;
        for (int i = 0; i<n- 1; i++){
            for (int j=0; j< n-i-1;j++){

                if(a[j] ==0 && a[j+1] != 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is");
        op.Print_Array(a);
    }
}