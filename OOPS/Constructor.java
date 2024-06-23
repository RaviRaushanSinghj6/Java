package OOPS;

public class Constructor {
    int a;
    int b;

    Constructor(int x,int y)
    {
        System.out.println("Constructor of constructor class called");
        a = x;
        b = y;
    }
    int add()
    {
        return a+b;
    }
    int sub()
    {
        int ans;
        ans = a-b;
        return ans;
    }
}
class Calling_Constructor{
    public static void main(String[] args) {
        Constructor obj = new Constructor(5, 3);
        System.out.println("Sum of input number is : ");
        int ans = obj.add();
        System.out.println(ans);

        Constructor obj2 = new Constructor(2,5);
        System.out.println(obj2.sub());
    }
}
