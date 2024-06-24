package Sorting;

public class Bubble {
    public static void bubble(int [] Array){
        int n = Array.length;
        for (int i = 0; i < (n - 1); i++){
            for (int j = 0; j < n-i-1; j++){
                if (Array[j] > Array[j+1])
                {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Array_Operation op = new Array_Operation();

        int [] Array = op.Input_Array();
        System.out.println("Input Array is:");
        op.Print_Array(Array);

        System.out.println("Sorted Array is:");
        bubble(Array);
        op.Print_Array(Array);


    }
}
