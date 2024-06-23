package OOPS;

public class ScopeVariable {
    //Class Level Scope
    int a = 10;
    int b = 45;
    int add()
    {
        return a+b;
    }

    //Method level scope
    int Add(){
        int p = 100;
        int q = 40;
        return  p+q;
    }

    //Block Level Scope
    int ADD(){
        int a = 10;
        {
            int b = 45;
        }
        System.out.println(a);
        System.out.println(b);
        return a;
    }
    public static void main(String[] args) {
        ScopeVariable sv = new ScopeVariable();
        System.out.println(sv.add());
        System.out.println(sv.Add());
        System.out.println(sv.ADD());
    }
}
