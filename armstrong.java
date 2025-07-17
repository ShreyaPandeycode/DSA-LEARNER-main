import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int num = sc.nextInt();
        int n = num;
        int result = 0;
        while (num != 0) {
            s = num % 10;
            num = num / 10;
            result = (s * s * s) + result;
        }
        if (result == n) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
