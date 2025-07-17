import java.util.Scanner;

// not using third variable
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + "," + b);
        int i = 2;
        while (i <= n) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;
            i++;
        }
        sc.close();
    }
}