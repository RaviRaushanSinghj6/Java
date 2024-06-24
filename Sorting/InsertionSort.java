//Take one element from unsorted part, iterate through sorted part and find the correct position of this element

package Sorting;

public class InsertionSort {
    static void insertionSort(int [] Array){
       int n = Array.length;
        for (int i = 0; i<n; i++){
            int j = i;
           while (j>0 && Array[j]< Array[j-1]) //Insert array[i] into sorted part
           {
                int temp = Array[j];
                Array[j] = Array[j-1];
                Array[j-1] = temp;
                j--;
           }
        }
    }

    public static void main(String[] args) {
        Array_Operation op = new Array_Operation();

        //Taking input
        int [] Arr = op.Input_Array();
        System.out.println("Input Array is:");
        op.Print_Array(Arr);

        //Sorting
        insertionSort(Arr);
        System.out.println("Sorted Array is:");
        op.Print_Array(Arr);
    }
}