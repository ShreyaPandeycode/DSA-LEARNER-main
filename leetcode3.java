import java.util.Scanner;

class leetcode3 {
    public static int maximumWealth(int[][] accounts) {

        int large = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int r = 0; r < accounts[i].length; r++) {// traverse each column
                sum += accounts[i][r];
            }

            large = Math.max(large, sum);// find largest element in each column //
            // change them as per need
            sum = 0;
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] account = new int[m][n];
        System.out.println("enter the elements");
        for (int i = 0; i < account.length; i++) {
            for (int j = 0; j < account[i].length; j++) {
                account[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("maxWealth    " + (maximumWealth(account)));
        sc.close();

    }
}