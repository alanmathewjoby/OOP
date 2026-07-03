import java.util.Scanner;

public class pq07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.next();

        int len = word.length();
        char[] letters = new char[len];
        for (int i = 0; i < len; i++) {
            letters[i] = word.charAt(i);
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {

                if (letters[j] > letters[j + 1]) {
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                }
            }
        }


        System.out.print("Alphabetically sorted word: ");
        for (int i = 0; i < len; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();

    }
}
