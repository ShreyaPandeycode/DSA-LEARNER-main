
import java.util.Scanner;

public class npr_ncr {
    public static int fact(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        return k;
    }

    public static double permutation(int n, int r) {
        return (fact(n) / fact(n - r));
    }

    public static double combination(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(permutation(n, r));
        System.out.println(combination(n, r));
        sc.close();
    }
}