import java.util.Scanner;

public class diztance {
    public static double distance(int x1, int y1, int x2, int y2) {

        return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));// if double is return type then cannot
        // return a int value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = distance(3, 4, 4, 3);
        System.out.println(d);
        sc.close();
    }
}
