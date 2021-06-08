package br.com.abreu.leetcode.dfs;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */

public class NumberOfIsland {

    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j, row, column);
                    count++;
                }
            }
        }
        return count;
    }


    private static void dfs(char[][] grid, int i, int j, int r, int c){
        //if out of bounds or already visited or '0'
        if (i < 0 || i >= r || j < 0 || j>=c || grid[i][j]== '$' || grid[i][j] == '0') return;

        //mark the current cell
        grid[i][j] = '$';

        //dfs in all four direction
        dfs(grid, i+1, j, r, c);
        dfs(grid, i-1, j, r, c);
        dfs(grid, i, j+ 1, r, c);
        dfs(grid, i, j-1, r, c);
    }


}
