package Arrays14;//package Arrays14;
//
//public class Last_Occurrence_of_element {
//    public static void main(String[] args) {
//        int Last = -1;
//        int Search_element = 1;
//        int []Array = {1,2,3,4,5,6,1,2,3,41,2,3,1,2};
//        for(int i=0; i<Array.length;i++)
//            if(Array[i] == Search_element)
//                Last = i;
//        System.out.println("Last occurrence of "+Search_element+" is: "+Last);
//    }
//}


import java.util.Scanner;

//TAKING INPUT
public class Last_Occurrence_of_element {
    static int Last_occurrence(int[]Array, int S_element){
        int Last_index = -1;
        for(int i=0; i<Array.length; i++)
            if(Array[i] == S_element)
                Last_index = i;
        return Last_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = sc.nextInt();
        int[] Array = new int[len];
        System.out.println("Enter "+len+" Elements in array: ");
        for (int i = 0; i<len; i++) Array[i] = sc.nextInt();
        System.out.println("Enter search element: ");
        int search = sc.nextInt();
        System.out.println("Last occurrence of search element:"+Last_occurrence(Array,search));
    }

}