import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }

        System.out.println(n);
    }
}
