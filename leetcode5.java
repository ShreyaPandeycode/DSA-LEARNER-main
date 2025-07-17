import java.util.Scanner;

class leetcode5 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[index.length];

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            j = index[i];
            if (target[j] == 0) {
                target[j] = nums[i];
            } else {
                while (target[j] != 0) {
                    target[j + 1] = target[j];
                    j++;
                }
                target[j] = nums[i];
            }
        }
        for (int i = 0; i < target.length; i++) {
            System.out.println(target[i]);
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] index = new int[n];
        System.out.println("enter element of array");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            // index[i] = sc.nextInt();
        }
        System.out.println("enter index array");
        for (int i = 0; i < n; i++) {
            // num[i] = sc.nextInt();
            index[i] = sc.nextInt();
        }
        createTargetArray(num, index);
    }
}
