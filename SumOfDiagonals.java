/* 15. Write a java program to Compute the Sum of the Principal and Secondary 
Diagonals elements of a Matrix */

public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Sum of diagonals: " + sumOfDiagonals(matrix));
    }

    static int sumOfDiagonals(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Principal diagonal
            sum += matrix[i][matrix.length - 1 - i]; // Secondary diagonal
        }
        return sum;
    }
}