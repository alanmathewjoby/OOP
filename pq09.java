public class pq09{
    public static void main(String[] args) {
        int[] numbers = {34, 64, 25, 12, 22, 11, 90};

        int smallest = numbers[0];
        int largest = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}
