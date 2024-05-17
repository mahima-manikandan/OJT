//Write a Java program that calculates the factorial of a given number using a while loop.
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        int factorial = 1;
        int i = 1;
        while (i <= N) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + N + " is: " + factorial);
    }
}
