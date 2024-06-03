import java.util.Scanner;
public class Eligible {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter Your Age");
        double age=x.nextDouble();
        System.out.print("Enter Your income");
        double income=x.nextDouble();
        if(age<18)
        {System.out.println("not eligible");}
        else if(age>=18 && age<=25 && income >= 2500)
        {System.out.println("Eligible for small loan");}
        else if(age>=26 && age<=35 && income >= 50000)
        {System.out.println("Eligible for medium loan");}
        else if(age>35 && income >= 75000)
        {System.out.println("Eligible for large loan");}
        else
        {System.out.println("invalid ");}
    }
}