import java.util.Scanner;

public class leetcode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            pro *= rem;
            n = n / 10;
        }
        System.out.println(pro - sum);
    }
}
