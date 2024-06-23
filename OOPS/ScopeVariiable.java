package OOPS;

public class ScopeVariiable { 
    int a = 10;
    int b = 45;
    
    int add()
    {
        return a+b;
    }

    public static void main(String[] args) {
        ScopeVariiable sv = new ScopeVariiable();
        System.out.println(sv.add());
    }
}
