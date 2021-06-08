package br.com.abreu.companytests;

public class Exiger {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 4, 6, 2, 3, 6, 7, 4, 6, 7, 8},
                {1, 3, 4, 6, 2, 3, 6, 7, 4, 6, 7, 8}
            };
        System.out.println(findNumberinMatrix(matrix, 9));
    }

    public static boolean findNumberinMatrix(int[][] matrix, int numberToFind){
        boolean isFoundend = false;
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == numberToFind){
                   return true;
                }
                isFoundend = findNumber(matrix, i, j, numberToFind);
            }

        }
        return isFoundend;
    }

    private static boolean findNumber(int[][] matrix, int i, int j, int numberToFind){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length || matrix[i][j] != numberToFind) return false;

        boolean isFounded = true;
        isFounded = isFounded
                & findNumber(matrix,i + 1, j, numberToFind)
                & findNumber(matrix, i, j +1, numberToFind)
                & findNumber(matrix, i -1, j, numberToFind)
                & findNumber(matrix, i, j -1, numberToFind);

        return isFounded;
    }


}
