import java.util.Scanner;

public class areaissoceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();// base
        int a = sc.nextInt();// other side
        double area = (Math.sqrt((4 * a * a - b * b) / 4));
        // formila to calculate the area of issoceles triangle
        System.out.println(area);
    }
}
