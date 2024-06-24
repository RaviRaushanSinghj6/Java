//Selects an element and puts it at its current position

package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] Array){
        int n = Array.length;
        for(int i = 0; i< n-1; i++){ //i represents current index

            //Find minimum element in unsorted part of array
            int min_index = i;
            for (int j= i+1; j<n;j++){
                if(Array[j]<Array[min_index]) {
                    min_index =j;
                }
            }
            //Swap current element & minimum element; current index 'i' will have current element
            int temp = Array[i];
            Array[i] = Array[min_index];
            Array[min_index]  =temp;
        }
    }

    public static void main(String[] args) {
        Array_Operation op = new Array_Operation();

        //Taking Input
        int []Array = op.Input_Array();
        System.out.println("Input array is");
        op.Print_Array(Array);

        //Sorting Array
        selectionSort(Array);
        System.out.println("Sorted Array is: ");
        op.Print_Array(Array);
    }
}
