public class reverseastring{
    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello"; // Change this for different inputs
        System.out.println("Reversed String: " + reverse(input));
    }
}
