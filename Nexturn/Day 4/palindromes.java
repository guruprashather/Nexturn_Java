
public class palindromes {
    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    
    public static void main(String[] args) {
        String input = "121"; // Change this for testing
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not a Palindrome");
    }
}
