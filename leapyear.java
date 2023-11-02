import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a year
        System.out.println("Enter a year to check if it's a leap year: ");
 
        // Read the input year from the user
        int year = scanner.nextInt();

        // Close the scanner as the input is complete
        scanner.close();

        // Check if the entered year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it's divisible by 4
        // But if the year is divisible by 100, it must also be divisible by 400 to be a leap year
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
