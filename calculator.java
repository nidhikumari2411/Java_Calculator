import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        // Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input.
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        // Prompt the user for the operation they want to perform.
        System.out.println("Enter the operation you want to perform (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Try to perform the arithmetic operation.
        int result;
        try {
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return;
        }

        // Display the result to the user.
        System.out.println("The result is: " + result);
    }
}