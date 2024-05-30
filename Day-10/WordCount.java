//write a program that uses the scanner class to read line of text and then count the number of words in a line.Assume words are seperated by spaces
import java.util.Scanner;
public class WordCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line=sc.nextLine();
        String[] words=line.split(" ");
        System.out.println("Number of words in the line:"+words.length);
     }
            
    }
    
