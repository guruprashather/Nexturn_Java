

import java.io.Console;

public class consolee {
    public static void main(String[] args) {
        Console console = System.console();
        
         if (console == null) {
            System.out.println("No console available.");
            return;
        }
       // System.out.println("Enter username");
        String username=console.readLine("ENter username");
       // System.out.println("usrname"+username);
        char[] passwordArray = console.readPassword("Enter your secret: ");
        String secret = new String(passwordArray); // Convert char array to String
        System.out.println("usrname"+username);

        System.out.println("Your secret is: " + secret); // Display the secret
    }
}
