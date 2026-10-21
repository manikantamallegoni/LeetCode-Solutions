class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // 1. Check if already sorted
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            return 0;
        }
        
        // 2. If length is 2 and not sorted, it's impossible
        if (n == 2) {
            return -1;
        }
        
        // Find minimum and maximum characters
        char mn = s.charAt(0);
        char mx = s.charAt(0);
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < mn) mn = c;
            if (c > mx) mx = c;
        }
        
        int minIdx = s.indexOf(mn);
        int maxIdx = s.lastIndexOf(mx);
        
        // 3. One operation is enough if min is at the start or max is at the end
        if (minIdx == 0 || maxIdx == n - 1) {
            return 1;
        }
        
        // 4. If min is at the very end and max is at the very start
        if (minIdx == n - 1 && maxIdx == 0) {
            return 3;
        }
        
        // 5. Otherwise, it takes 2 operations
        return 2;
    }
}