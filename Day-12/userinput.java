import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your name");
    String myname=scanner.nextLine();
    System.out.println("myname is"+myname);
    }
}
