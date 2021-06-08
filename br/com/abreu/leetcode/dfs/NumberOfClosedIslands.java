package br.com.abreu.leetcode.dfs;

/**
 * Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
 *
 * Return the number of closed islands.
 */

public class NumberOfClosedIslands {

    public static int closedIsland(int[][] grid) {
        int closedIsland = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(grid[i][j] == 0 && isClosed(grid, i, j, row, column)) {
                    closedIsland++;
                }
            }
        }
        return closedIsland;
    }

    public static boolean isClosed(int[][] grid, int i, int j, int r, int c){
        if(i< 0 || i >= r || j < 0 || j >=c ) {
            return false;
        }

        if (grid[i][j] == 1){
            return true;
        }

        grid[i][j] = 1;
        boolean isClosed = true;

        isClosed = isClosed
                & isClosed(grid, i - 1 , j, r, c)
                & isClosed(grid, i , j -1, r, c)
                & isClosed(grid, i +1 , j, r, c)
                & isClosed(grid, i , j+1, r, c);
        return isClosed;
    }
}

