import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        while (true) {
            if(num1 < 0 || num2 < 0){
                break;
            }else{
                double sum=  num1+ num2;
                System.out.println("The sum of two numbers is: " + sum);
                break;
            }
        }
    }
}
