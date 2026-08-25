class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        int num = k;

        while (set.contains(num)) {
            num += k;
        }

        return num;
    }
}