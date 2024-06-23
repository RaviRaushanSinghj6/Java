// PRINTING RECTANGLE


//public class Patterns {
//    public static void main(String[] args) {
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=6;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//PRINTING EMPTY RECTANGLE
//public class Patterns {
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++) {
//            for (int j=1;j<=4;j++) {
//                if (i==1||i==4||j==1||j==4) {
//                    System.out.print("*");
//                } else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

//PRINTING RECTANGLE

public class Patterns {
    public static void main(String[] args) {
        for (int r = 8; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}