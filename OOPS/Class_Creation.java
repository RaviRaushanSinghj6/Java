package OOPS;

class Class_Creation {
    String Name;
    int Roll_no;
    int age;
}

class Call_Class_Creation {
    public static void main(String[] args) {
        Class_Creation obj1 = new Class_Creation();
        obj1.Name = "Ravi";
        obj1.age = 20;
        obj1.Roll_no = 10;

        System.out.println(obj1.Name);
        System.out.println(obj1.Roll_no);
        System.out.println(obj1.age);
    }
}
