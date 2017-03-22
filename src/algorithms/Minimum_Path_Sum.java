package algorithms;

/**
 * Created by wangjinzhao on 2017/3/22.
 */
public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i + 1 < row && j + 1 >= col) {
                    grid[i][j] += grid[i + 1][j];
                } else if (i + 1 >= row && j + 1 < col) {
                    grid[i][j] += grid[i][j + 1];
                } else if (i + 1 < row && j + 1 < col) {
                    grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
                }
            }
        }
        return grid[0][0];
    }
}
