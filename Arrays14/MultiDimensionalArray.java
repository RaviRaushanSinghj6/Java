package Arrays14;

public class MultiDimensionalArray {
    void multiArrays() {
        int[][] arr1 = new int[2][2];
        arr1[0][1] = 42; // Assigning a value to arr1[0][1]
        int[][] arr2 = { {5, 7, 9}, {5, 7, 8}, {8, 5, 1} };

        // Accessing elements
        System.out.println("Element at arr1[0][1]: " + arr1[0][1]);
        System.out.println("Element at arr2[2][1]: " + arr2[2][1]); //Index 0,1,2

        // Printing arr1 using for-each loop
        System.out.println("Array arr1:");
        for (int[] innerArray : arr1) {
            for (int num : innerArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Printing arr2 using for loop
        System.out.println("Array arr2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MultiDimensionalArray md = new MultiDimensionalArray();
        md.multiArrays();
    }
}
