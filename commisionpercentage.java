import java.util.Scanner;

public class commisionpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double commission = sc.nextDouble();
        double total_amount = sc.nextDouble();
        System.out.println((commission * 100) / total_amount);
    }
}
