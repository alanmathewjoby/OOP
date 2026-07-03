import java.util.Scanner;

public class pq4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = scan.nextLine();


        System.out.print("Enter character to search: ");
        char target = scan.next().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency: " + count);

    }
}