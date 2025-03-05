/*public class Fibanoccii {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Change for different lengths
        System.out.print("Fibonacci Series: ");
     for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}*/

//Without recursion
public class Fibanoccii {
    public static void main(String[] args) {
        int terms = 20; // Change for different lengths
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        
        for (int i = 2; i < terms; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
