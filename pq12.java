import java.util.Scanner;

public class pq12{
	
    public static void displayGrid(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j < grid.length-1)
                    System.out.print(grid[i][j] + " ");
                else
                    System.out.print(grid[i][j]);
            }

            System.out.println();
        }
    }
	
    public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r = scan.nextInt();
        System.out.println("Enter number of columns: ");
		int c = scan.nextInt();
		int arr[][] = new int[r][c];
		
		System.out.println("Enter the values: ");
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				int x = scan.nextInt();
				arr[i][j] = x;
			}
		}
		
		displayGrid(arr);
		
		int rc = r*c;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				if (i==j)
					sum1+=arr[i][j];
				if (i+j==r-1)
					sum2+=arr[i][j];
			}
		}
		
		System.out.println("Sum of first diagonal: " + sum1);
		System.out.println("Sum of second diagonal: " + sum2);		
		
		
    }
}