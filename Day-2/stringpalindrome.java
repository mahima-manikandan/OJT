public class stringpalindrome{
public static void main(String[] args) {
    String s = "madam"; 
    String rev = new StringBuilder(s).reverse().toString();
    if (s.equals(rev)){

    
    System.out.println("Yes");
    }
    else{
    System.out.println("No");
    }

}
}