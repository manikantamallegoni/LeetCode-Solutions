class Solution {
    public int reverseDegree(String s) {
        return multiRe(s);
    }

    int multiRe(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int val = 'z' - c + 1;

            ans += val * (i + 1);
        }

        return ans;
    }
}