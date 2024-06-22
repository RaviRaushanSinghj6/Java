public class BREAK {
    public static void main(String[] args) {
        for (int n = 1; ; n++) {
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.println(n);
                break;
            }
        }
    }
}
