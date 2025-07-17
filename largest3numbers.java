import java.util.Scanner;

public class largest3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        /*
         * if (a > b) {
         * max = a;
         * } else {
         * max = b;
         * }
         * if (c > max) {// here max can be a and b
         * max = c;
         * }
         */
        double max = Math.max(c, Math.max(a, b));
        System.out.println("largest number" + max);
        sc.close();
    }
}
