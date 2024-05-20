import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        
        // Read the input from the user
        int year = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the entered year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // But not divisible by 100 unless it is also divisible by 400
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
