import java.util.*;

public class pq15 {

    // Displaying grid

    public static void displayGrid(String[][] grid) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2)
                    System.out.print(grid[i][j] + "|");
                else
                    System.out.print(grid[i][j]);
            }

            System.out.println();
	    if (i <2 )
            	System.out.println("-----------");
        }
    }


    public static boolean checkWin(String[][] grid, String player) {
        for (int i = 0; i < 3; i++) {

            if (grid[i][0].equals(player) && grid[i][1].equals(player) && grid[i][2].equals(player)) return true;

            if (grid[0][i].equals(player) && grid[1][i].equals(player) && grid[2][i].equals(player)) return true;
        }

        if (grid[0][0].equals(player) && grid[1][1].equals(player) && grid[2][2].equals(player)) return true;
        if (grid[0][2].equals(player) && grid[1][1].equals(player) && grid[2][0].equals(player)) return true;

        return false;
    }


    public static boolean isValid(int x, int not_available[]) {

        if (x < 1 || x > 9) {
            System.out.println("Invalid input! Please choose a cell between 1 and 9.");
            return false;
        }


        for (int i = 0; i < not_available.length; i++) {
            if (not_available[i] == x) {
                System.out.println("Position already taken! Choose another cell.");
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Tic-Tac-Toe model

        String[][] grid = {
            {"   ", "   ", "   "},
            {"   ", "   ", "   "},
            {"   ", "   ", "   "}
        };
        
        displayGrid(grid);
        
        int not_available[] = new int[9];
        
        for (int i = 0; i < 9; i++) {
            System.out.println("");

            if (i % 2 == 0) {

                System.out.println("Enter 'X' position: ");
                int x = scan.nextInt();

                if (isValid(x, not_available)) {
                    grid[(x - 1) / 3][(x - 1) % 3] = " X ";
                    not_available[i] = x;

                } else {
                    i--; 
                    continue;
                }

                displayGrid(grid);

                if (checkWin(grid, " X ")) {
                    System.out.println("Player X Wins!");
                    break;
                }
            } 
            else if (i % 2 != 0) {

                System.out.println("Enter 'O' position: ");
                int x = scan.nextInt();

                if (isValid(x, not_available)) {
                    grid[(x - 1) / 3][(x - 1) % 3] = " O ";
                    not_available[i] = x;

                } else {
                    i--;
                    continue;
                }

                displayGrid(grid);

                if (checkWin(grid, " O ")) {
                    System.out.println("Player O Wins!");
                    break;
                }
            }
            

            if (i == 8) {
                System.out.println("It's a draw!");
            }
        }
    }
}
