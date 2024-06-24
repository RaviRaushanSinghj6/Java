package Sorting; //Calling Package Sorting

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // Change < to > for ascending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Array_Operation op = new Array_Operation(); //Creating object of Array operation class

        // Input array from user
        int[] Array = op.Input_Array(); //Accessing Input Array Method from Array_Operation
        System.out.println("User Input Array is :");
        op.Print_Array(Array);

        // Sort the user input array
        bubbleSort(Array);
        System.out.println("Sorted User Input Array:");
        op.Print_Array(Array);
    }
}

