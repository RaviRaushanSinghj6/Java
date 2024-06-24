package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] Array){
        int n = Array.length;
        for(int i = 0; i< n-1; i++){ //Outerloop upto n elements
            int min_index = i;
            for (int j= i =1; j<n;j++){
                if(Array[j]<Array[min_index]){

                    //Swap Operation
                    int temp = Array[i];
                    Array[i] = Array[min_index];
                    Array[min_index]  =temp;
                }
            }
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
