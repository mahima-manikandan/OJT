import java.util.Scanner;

public class ShortPrime {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = scan.nextInt();
    for (int i = n + 1; ; i++)
      if (isPrime(i)) {
        System.out.println("First prime > " + n + " is: " + i);
        break;
      }
  }

  static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++)
      if (num % i == 0) return false;
    return true;
  }
}
