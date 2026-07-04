public class pq10 {

    public static void main(String[] args) {

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

   
        int[][] result = multiplyMatrices(matrixA, matrixB);


        if (result != null) {
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

   
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied: Columns of A must equal Rows of B.");
            return null;
        }

 
        int[][] result = new int[rowsA][colsB];

  
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
	
	// for (element : dataset) seems to me an efficient way instead of looping i

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
