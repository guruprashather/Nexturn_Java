import java.util.Scanner;

public class Fitness{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter activity: ");
        String activity = scanner.nextLine();
        System.out.print("Enter duration in minutes: ");
        double duration = scanner.nextDouble();
        scanner.close();

        // Calorie burn rates
        double calorieRate = 0;
        if (activity.equalsIgnoreCase("Running")) {
            calorieRate = 10.0;
        } else if (activity.equalsIgnoreCase("Cycling")) {
            calorieRate = 8.0;
        } else if (activity.equalsIgnoreCase("Swimming")) {
            calorieRate = 12.0;
        } else if (activity.equalsIgnoreCase("Walking")) {
            calorieRate = 4.0;
        } else if (activity.equalsIgnoreCase("Jumping Rope")) {
            calorieRate = 14.0;
        } else {
            System.out.println("Activity not found.");
            return;
        }

        
        System.out.println("Calories Burned: " + (calorieRate * duration));
    }
}
