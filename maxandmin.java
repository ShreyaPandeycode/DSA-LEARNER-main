import java.util.Scanner;

public class maxandmin {
    static int max(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("max num " + max(a, b, c));
        System.out.println("min num " + min(a, b, c));
    }
}
