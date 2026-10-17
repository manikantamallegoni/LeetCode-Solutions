
import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        Integer[] index = new Integer[n];

        // Step 1: Calculate digit sums
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int s = 0;

            while (num > 0) {
                s += num % 10;
                num /= 10;
            }

            sum[i] = s;
            index[i] = i;
        }

        // Step 2: Sort indices by digit sum, then by number
        Arrays.sort(index, (a, b) -> {
            if (sum[a] != sum[b]) {
                return Integer.compare(sum[a], sum[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        // Step 3: Count minimum swaps using cycles
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || index[i] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = index[j];
                cycleSize++;
            }

            count += cycleSize - 1;
        }

        return count;
    }
}

