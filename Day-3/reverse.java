//Write a  java program to print reverse alphabets from Z to A
public class reverse {
    public static void main(String[] args) {
        char currentChar = 'Z';
        
        System.out.println("Reverse alphabets from Z to A:");
        while (currentChar >= 'A') {
            System.out.print(currentChar + " ");
            currentChar--;
        }
    }
}
