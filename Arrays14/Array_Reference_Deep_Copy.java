package Arrays14;

public class Array_Reference_Deep_Copy {
    static void Print_Array(int[] Array){
        for(int i: Array) System.out.println(i);
    }

    public static void main(String[] args) {
        int[] Array_1 = new int[3];
        Array_1[0] = 3;
        Array_1[1] = 4;
        Array_1[2] = 5;
        System.out.println("Original Array is:");
        Print_Array(Array_1);

        //Deep Coping Array
        int[] Array_2 = Array_1.clone();
        System.out.println("Copied Array without changes");
        Print_Array(Array_2);

        Array_2[0] =10;
        Array_2[1] = 100;
        System.out.println("Original Array after changes:");
        Print_Array(Array_1);
        System.out.println("Copied Array after changes:");
        Print_Array(Array_2);
    }
}
