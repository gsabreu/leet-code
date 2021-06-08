package br.com.abreu.leetcode.dfs;

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
 * You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 */

public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea =0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int tmplen = countDFS(grid, i, j, m, n);
                    maxArea = Math.max(maxArea, tmplen);
                }
            }
        }
        return  maxArea;
    }

    public static int countDFS (int[][] grid, int i, int j, int m, int n){
        if (i < 0 || i >= m || j < 0  || j >= n || grid[i][j] ==0) return 0;
        else {
            grid[i][j] =0;
            //return 1 + count for directions
            return 1
                    + countDFS(grid, i+1 , j, m , n)
                    + countDFS(grid, i -1, j, m ,n)
                    + countDFS(grid, i , j + 1, m, n)
                    + countDFS(grid, i, j- 1, m, n);
        }
    }

}
