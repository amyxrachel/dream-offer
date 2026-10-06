class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int len = n * m;

        int[][] grid2 = new int[n][m];
        for (int i = 0; i < len; i++) {
            int index = (i + k) % len;
            grid2[index / m][index % m] = grid[i / m][i % m];
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(grid2[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}