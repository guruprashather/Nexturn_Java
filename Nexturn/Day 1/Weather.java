import java.util.Scanner;

public class Weather{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        double temp = scanner.nextDouble();
        if (temp>30){
            System.out.println("Weather:Hot");
        }else if(temp>=20){
            System.out.println("Weather:Warm");
        }else if (temp >= 10) {
            System.out.println("Weather: Moderate");
        } else {
            System.out.println("Weather: Cold");
        }
            scanner.close();
    }
}