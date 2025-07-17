import java.util.Scanner;

public class largestinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 0;
        while (true) {
            n = sc.nextInt();
            if (n != 0) {
                if (n > max) {
                    max = n;
                } else {
                    continue;
                }
            } else {
                System.out.println(max);
                break;
            }
        }
        sc.close();
    }
}
