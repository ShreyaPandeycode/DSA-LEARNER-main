import java.util.Scanner;

public class electricity {
    static int N = 4;// static variable

    public static int electricity_bill(int n) {
        int charge[] = { 10, 15, 20, 25 };
        int range[] = { 100, 200, 300, Integer.MAX_VALUE };
        int bill = 0;
        for (int i = 0; i < N; i++) {
            if (n >= 100) {// if n is greater or equal to 100
                bill += 100 * charge[i];// divide each part in 100
                n = n - 100;
            } else {
                bill = bill + n * charge[i];
                break;
            }
        }
        return bill;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        System.out.println(electricity_bill(unit));
    }
}
