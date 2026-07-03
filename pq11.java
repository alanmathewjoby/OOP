import java.util.Scanner;

public class pq11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];


        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }


        int max = matrix[0][0]; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("\nLargest element in the matrix: " + max);

        int[][] transpose = new int[cols][rows];
        
        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
