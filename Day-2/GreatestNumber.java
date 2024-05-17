//Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double greatest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
