import java.util.Scanner;

public class pq2{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
            
        int number = scan.nextInt();
        int sum = 0;
        
        while (number>0)
        {
            int lastDigit = number%10;
            sum += lastDigit;
            number = number/10;
        }
		
		
    }
}