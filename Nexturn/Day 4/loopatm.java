import java.util.Scanner;

public class loopatm {
    public static void main(String[] args) {
        int current = 1234;
        int maxattempts = 3;
        int i=0 ;
        Scanner scanner = new Scanner(System.in);

        while (i <=maxattempts) {
            System.out.print("Enter PIN: ");
            int inputPin = scanner.nextInt();
            
            if (inputPin == current) {
                System.out.println("Access Granted!");
               // scanner.close();
            } else {
                i++;
                System.out.println("Incorrect PIN and attempts left : "+(maxattempts-i+1));
            }
        }
        
        System.out.println("Account Locked.");
        //scanner.close();
    }
}
