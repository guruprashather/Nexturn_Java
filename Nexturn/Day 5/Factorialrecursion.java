import java.util.Scanner;
/*public class Factorialrecursion {
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number for which factorail should be calculated :");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}*/

//Without Recurssion

public class Factorialrecursion {
    public static  int Facto(int n){
        int fact=1;
        if(n==0 || n==1){
            fact=1;
        }
      
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number for which factorail should be calculated :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of "+ num + "is : " + Facto(num));
    }
}