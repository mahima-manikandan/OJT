public class StringToInteger {
    public static int convert(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0; // return 0 if the string is not a valid integer
        }
    }

    public static void main(String[] args) {
        System.out.println(convert("123")); // 123
        System.out.println(convert("abc")); // 0
    }
}