import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ch!=0
        int n, t = 0, u = 0, s = 0;
        System.out.println("enter numbers");

        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                s += n;
            } else if (n > 0 && n % 2 == 0) {
                t += n;
            } else {
                u += n;
            }
        }
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        sc.close();
    }
}
