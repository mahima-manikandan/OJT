
import java.util.Scanner;
public class SumOfIntegers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a series of integers, enter a negative number to stop: ");
        while (true) {
            int number=sc.nextInt();
            if (number<0){
                break;   
            }
            sum+=number;    
        }
        System.out.println("The sum of the numbers is: "+sum);
    }    
    }
         
