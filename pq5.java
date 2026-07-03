import java.util.Scanner;

public class pq5{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
		
		int array[] = [2, 3, 4, 3, 6]
		
		int duplicate = 0;

		for (int i=0, i=array.length; i++){
			for (int j=0; j=array.length; j++){
				if (array[i]==array[j])
					System.out.println("Duplicate is: " + array[i] + "; found at index: " + i);
			}
		}
		
    }
}

