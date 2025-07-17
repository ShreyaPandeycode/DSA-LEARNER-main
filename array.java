import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 65, 87, 8, 45, 76, 89 };
        for (int num : arr) {// for each loop
            System.out.println(num); // here num is representing the elements of array
        }
        System.out.println(Arrays.toString(arr));
    }
}
