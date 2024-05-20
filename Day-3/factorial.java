//Write a java  program to find the factorial value of any number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long findFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * findFactorial(n - 1);
    }
}
