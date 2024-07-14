/* Search the given target element x in Array. If present then return index else -1 */
package Arrays14;

import java.util.Scanner;

public class SearchInArray {
    static int search(int[] array,int len, int target){
        for (int i = 0; i < len; i++) {
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n;i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter Element to search");
        int target = sc.nextInt();
        int ans  = search(Array,n, target);
        System.out.println("Target element is present at:" +ans);
    }
}
