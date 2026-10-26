class Solution {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int validIslandCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    // Start DFS to calculate the total value of the island
                    long islandSum = dfs(grid, i, j);
                    
                    if (islandSum % k == 0) {
                        validIslandCount++;
                    }
                }
            }
        }

        return validIslandCount;
    }

    private long dfs(int[][] grid, int r, int c) {
        int m = grid.length;
        int n = grid[0].length;

        // Base case: out of bounds or water (0) or already visited (marked as -1)
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] <= 0) {
            return 0;
        }

        long currentVal = grid[r][c];
        // Mark as visited by setting to -1
        grid[r][c] = -1;

        // Traverse all 4 directions
        for (int[] dir : DIRECTIONS) {
            currentVal += dfs(grid, r + dir[0], c + dir[1]);
        }

        return currentVal;
    }
}