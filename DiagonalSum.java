public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            principalDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }
        
        System.out.println("Sum of Principal Diagonal: " + principalDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }
}
