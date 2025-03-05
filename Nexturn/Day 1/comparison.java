import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

   
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2)); // Equal to
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2)); // Not equal to
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));   // Greater than
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));   // Less than
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2)); // Greater than or equal to
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
        System.out.println("Enter boolean 1");
        boolean b1=scanner.nextBoolean();
        System.out.println("Enter boolean 2");
        boolean b2=scanner.nextBoolean();
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);
        System.out.println(!b2);
         // Less than or equal to

        scanner.close();
    }
}
