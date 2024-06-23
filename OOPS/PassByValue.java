package OOPS;
/*
*Copies Va;ue of Actual Parameter.
* Called function creates its own copies.
*/
public class PassByValue
{
    static void ChangeValue(int a){
        a*=100;
        System.out.println("Inside change Value " +a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Changing Value " +a);
        ChangeValue(a);
        System.out.println("After Changing Value " +a);
    }
}
