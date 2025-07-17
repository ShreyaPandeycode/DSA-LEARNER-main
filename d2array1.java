import java.util.Scanner;

public class d2array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaring a 2d array
        /*
         * int[][] arr1 = { // ***we cannot use same name for declaration and
         * intialization of 2d array
         * { 1, 2, 3 }, // indexing starts from zero
         * { 7, 4 },
         * { 3 } };// semicolon is important
         */
        int[][] arr1 = new int[3][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) { // this will give the value of length of each array
                arr1[i][j] = sc.nextInt();
            }
            // System.out.println();// next line will print each row in diff slides
        }
        for (int i = 0; i < arr1.length; i++) { // i-> row
            for (int j = 0; j < arr1[i].length; j++) { // this will give the value of length of each array
                System.out.print(arr1[i][j] + " "); // j->cols
            }
            System.out.println();// next line will print each row in diff slides
        }

    }
}
