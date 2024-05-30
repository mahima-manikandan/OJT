import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                System.out.println("Ignoring negative number.");
                continue;
            }

            sum += num;
        }

        System.out.println("The sum of positive integers is: " + sum);

        scanner.close();
    }
}
