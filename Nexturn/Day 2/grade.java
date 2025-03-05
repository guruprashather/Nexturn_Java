import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter student marks (0-100): ");
        int marks = scanner.nextInt();
        scanner.close();

        String grade;
        switch (marks / 10) {
            case 10: 
            case 9:  
                grade = "Grade A";
                break;
            case 8:  
                grade = "Grade B";
                break;
            case 7:  
                grade = "Grade C";
                break;
            case 6:  
                grade = "Grade D";
                break;
            default: 
                grade = "Fail";
        }

        
        System.out.println("Result: " + grade);
    }
}
