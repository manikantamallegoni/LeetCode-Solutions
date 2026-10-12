class Solution {
public int maxSum(List<Integer> nums, int k) {
long MOD = 1_000_000_007L;
int[] bits = new int[31];


    // Step 1: Count set bits
    for (int num : nums) {
        for (int b = 0; b < 31; b++) {
            if ((num & (1 << b)) != 0) {
                bits[b]++;
            }
        }
    }

    long ans = 0;

    // Step 2: Construct k maximum numbers
    for (int i = 0; i < k; i++) {
        long num = 0;

        for (int b = 0; b < 31; b++) {
            if (bits[b] > 0) {
                num |= (1L << b);
                bits[b]--;
            }
        }

        // Step 3: Add square modulo MOD
        ans = (ans + num * num) % MOD;
    }

    return (int) ans;
}


}
