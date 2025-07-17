import java.util.Arrays;
import java.util.Scanner;

class leetcode4 {
    public static Boolean kidsWithCandies(int[] candies, int extraCandies) {

        int high = 0;
        String ans[] = new String[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= high) {
                high = candies[i]; // get highest number of candy element
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (high <= sum) {
                ans[i] = "true";

            } else {
                ans[i] = "false";
            }
        }
        System.out.println(Arrays.toString(ans));
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// number of elements
        int coin = sc.nextInt(); // number of extracandy
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        kidsWithCandies(num, coin);
    }
}
