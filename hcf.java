import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            System.out.println(b);
        } else if (b == 0)
            System.out.println(a);
        else if (a % b == 0) {
            System.out.println(b);
        } else if (b % a == 0) {
            System.out.println(a);
        }
        if (a % b != 0 && b % a != 0) {
            while (a != 0 || b != 0) {
                if (a > b) {
                    if (a % b == 0) {
                        System.out.println(b);
                        break;// we get our output
                    } else {
                        a = a - b;
                        continue;
                    }
                } else {
                    if (b % a == 0) {
                        System.out.println(a);
                        break;
                    } else {
                        b = b - a;
                        continue;
                    }
                }
            }
        }
    }
}
