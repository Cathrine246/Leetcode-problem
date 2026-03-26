class Solution {
    public void dfs(int[][] grid, int[][] time, int i, int j, int day) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length 
            || grid[i][j] == 0 || time[i][j] <= day) {
            return;
        }
        time[i][j] = day;
        dfs(grid, time, i + 1, j, day + 1);
        dfs(grid, time, i - 1, j, day + 1);
        dfs(grid, time, i, j + 1, day + 1);
        dfs(grid, time, i, j - 1, day + 1);
    }

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] time = new int[row][col];

        for (int i = 0; i < row; i++) {
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, time, i, j, 0);
                }
            }
        }

        int dayCount = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (time[i][j] == Integer.MAX_VALUE) {
                        return -1; 
                    }
                    dayCount = Math.max(dayCount, time[i][j]);
                }
            }
        }
        return dayCount;
    }
}
