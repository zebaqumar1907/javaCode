package alculator.java;
import java.util.Scanner;

public class Calculator {
    
    // Scanner instance to read user input
    private static Scanner scan = new Scanner(System.in);
    
    // Method to start the calculation process
    public void getValues(Scanner scan) {
        char repeat;
        do {
            System.out.println("Enter the first number:");
            int firstValue = scan.nextInt();
            
            System.out.println("Enter the second number:");
            int secondValue = scan.nextInt();
            
            System.out.println("Choose the operation to perform:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            int operator = scan.nextInt();
            
            // Perform calculation and get the result
            String result = calculate(firstValue, secondValue, operator);
            System.out.println(result);
            
            System.out.println("Do you want to try again? (y/n)");
            repeat = scan.next().charAt(0);
        } while (repeat == 'y');
        
        System.out.println("Calculator program ended.");
    }
    
    // Method to perform calculation based on operator
    public String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        String operation = "";
        
        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                operation = "+";
                break;
            case 2:
                result = firstValue - secondValue;
                operation = "-";
                break;
            case 3:
                result = firstValue * secondValue;
                operation = "*";
                break;
            case 4:
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                    operation = "/";
                } else {
                    return "Error: Division by zero.";
                }
                break;
            default:
                return "Invalid operator: " + operator;
        }
        
        return firstValue + " " + operation + " " + secondValue + " = " + result;
    }
    
    // Main method to start the program
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getValues(scan);
        scan.close(); // Close the scanner after use
    }
}

