import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int absoluteValue = Math.abs(number);
        System.out.println("The absolute value is: " + absoluteValue);
        scanner.close();
    }
}
