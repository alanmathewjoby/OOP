public class pq06 {


	public static void display(int array[]){
		for (int i=0; i<array.length; i++){
			System.out.print(array[i]+"  ");
		}
	
	}
    public static void main(String[] args) {

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: ");
		display(numbers);
        System.out.println();		
		

        // Bubble Sort Algorithm
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
		display(numbers);
    }
}
