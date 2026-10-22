
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nums;
    public List<List<Integer>> subsets;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        this.subsets = new ArrayList<>();
        backtrack(0, new ArrayList<>());
        return subsets;
    }

    void backtrack(int i, List<Integer> ans) {
        if (i >= nums.length) {
            subsets.add(new ArrayList<>(ans));
            return;
        } else {
            // Option 1: Don't pick nums[i]
            backtrack(i + 1, ans);

            // Option 2: Pick nums[i]
            ans.add(nums[i]);
            backtrack(i + 1, ans);

            // Backtrack (Un-choose)
            ans.remove(ans.size() - 1);
        }
    }
}