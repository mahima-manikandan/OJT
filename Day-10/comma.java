
import java.util.Arrays;
import java.util.Scanner;
public class comma {
    public static void main(String[] args) {
      String c=" ";
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the the number");
      String n=sc.nextLine();      
      char[] ch=n.toCharArray();
      System.out.println(Arrays.toString(ch));
   } 
}