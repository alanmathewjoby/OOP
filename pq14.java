import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Calculator ===");

        while (keepRunning) {
            System.out.println("\nAvailable Operations:");
            System.out.println("  + : Addition");
            System.out.println("  - : Subtraction");
            System.out.println("  * : Multiplication");
            System.out.println("  / : Division");
            System.out.println("  E : Exit Program");
            
            System.out.print("Choose an operator or 'E' to exit: ");
            char operator = scan.next().toUpperCase().charAt(0);

            if (operator == 'E') {
                keepRunning = false;
                System.out.println("Program stopped.");
                break;
            }

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator selected.. try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            double result = 0;
            boolean validCalculation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
				
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        validCalculation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }

            if (validCalculation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }

    }
}
