import java.util.Scanner;

public class pq13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int totalElements = rows * cols;
        int[] tempArray = new int[totalElements];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tempArray[index] = matrix[i][j];
                index++;
            }
        }


        for (int i = 0; i < totalElements - 1; i++) {
            for (int j = 0; j < totalElements - i - 1; j++) {
                if (tempArray[j] > tempArray[j + 1]) {
                    int temp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }


        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = tempArray[index];
                index++;
            }
        }


        System.out.println("\nSorted Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
