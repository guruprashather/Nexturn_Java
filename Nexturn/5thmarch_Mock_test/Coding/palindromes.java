package Coding;

import java.util.Scanner;

public class palindromes {
    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); 
        if(isPalindrome(input)){
            System.out.println( "Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
