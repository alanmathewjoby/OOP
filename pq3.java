import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total count of numbers (n): ");
        int n = scan.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.print("Reversed sequence: ");
        
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

    }
}
