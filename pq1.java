import java.util.Scanner;

public class pq1{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius length: \t");
        double r = scan.nextInt();
        
        double area = 3.14 * Math.pow(r, 2);
        System.out.println("Area of circle is: " + area);
        
        
        
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




