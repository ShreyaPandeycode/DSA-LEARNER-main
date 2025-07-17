import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P2799 {
    public int countCompleteSubarrays(int[] nums) {
        // Step 1: Find all distinct elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int k = set.size(); // number of distinct elements
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int result = 0;

        for (int r = 0; r < nums.length; r++) {
            // Step 2: Add right element to map
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Step 3: Check if we have all distinct elements
            while (map.size() == k) {
                // Count all subarrays from l to end that start at l and include r
                result += nums.length - r;

                // ✅ Print the subarrays
                for (int end = r; end < nums.length; end++) {
                    System.out.print("[");
                    for (int i = l; i <= end; i++) {
                        System.out.print(nums[i]);
                        if (i < end) System.out.print(", ");
                    }
                    System.out.println("]");
                }

                // Step 4: Shrink the window
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        P2799 sol = new P2799();
        int[] nums = {1, 2, 1, 3};
        System.out.println("Total complete subarrays: " + sol.countCompleteSubarrays(nums));
    }
}
