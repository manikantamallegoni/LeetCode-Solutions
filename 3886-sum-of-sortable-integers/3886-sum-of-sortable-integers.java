class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int totalSum = 0; // Changed back to int to match the driver signature

        // Iterate through all possible divisors k of n
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            if (isSortable(nums, k)) {
                totalSum += k;
            }
        }
        return totalSum;
    }

    private boolean isSortable(int[] nums, int k) {
        int n = nums.length;
        int prevMax = -1; // To check that block[i] max <= block[i+1] min

        for (int i = 0; i < n; i += k) {
            // Count drops inside the current block of size k (circular check)
            int drops = 0;
            for (int j = 0; j < k; j++) {
                int curr = nums[i + j];
                int next = nums[i + (j + 1) % k]; 
                if (curr > next) {
                    drops++;
                }
            }

            // A block can be cyclically rotated into sorted order iff it has <= 1 drop
            if (drops > 1) return false;

            // Find the min and max of this block
            int minVal = nums[i];
            int maxVal = nums[i];
            for (int j = 0; j < k; j++) {
                minVal = Math.min(minVal, nums[i + j]);
                maxVal = Math.max(maxVal, nums[i + j]);
            }

            // Ensure the blocks are non-decreasing relative to each other
            if (prevMax > minVal) {
                return false;
            }
            prevMax = maxVal;
        }

        return true;
    }
}