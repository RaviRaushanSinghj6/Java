package Arrays14;

public class ArrayExample {
    void Arr()
    {
        int[] ages = new int[5];
        // Type arrayname[] = new type[Size];
        // int[] array = {1,2,3,4,5,6,7,8,9};

        float [] Weight = new float[5];
        String [] Name = new String[5];

        ages[0] = 45;
        Weight[0] = 2.456F;
        Name[0] = "Ravi";

        System.out.println(ages[0]);
        System.out.println(Weight[0]);
        System.out.println(Name[0]);
    }

    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        ae.Arr();
    }
}
