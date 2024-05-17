import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonusAmount = (yearsOfService > 5) ? (salary * 0.05) : 0;

        System.out.println("Net bonus amount: $" + bonusAmount);

        scanner.close();
    }
}
