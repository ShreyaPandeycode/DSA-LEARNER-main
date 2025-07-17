import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    System.out.println(i + "");
                    break;
                } else {
                    System.out.println(i + " " + n / i);
                }
            }
        }

        sc.close();
    }
}
