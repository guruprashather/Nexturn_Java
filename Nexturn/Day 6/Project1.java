import java.util.Scanner;
class  details{
    String name;
    int number;
    float amt;
    details(String a, int b,float c){
        name=a;
        number=b;
        amt=c;
       
       
    }
    void deposit(float depos){
        amt=amt+depos;
        

        System.out.println("Depositing amount " + depos );
        System.out.println("Current amount : $" + amt);
    }
    void withdraw(float withd){
       
        if(withd>amt){
              System.out.println("Insufficiet Balance");
        }
        else{
            amt=amt-withd;
            System.out.println("Current amount : $"+amt);
        }
    }
    void display(){
        System.out.println("-----------------");        
        System.out.println("Account deatils ");
        System.out.println("Account holder :" + name);
        System.out.println("Account name :" + number);
        System.out.println("Balance :$" + amt);
    } 
}
public class Project1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Acoount name : ");
        String name=sc.nextLine();
        System.out.print("Enter the Account number : " );
        int number=sc.nextInt();
        System.out.print("Enter the Cuurent Ammount: $");
        float amt=sc.nextFloat();

        details obj= new details(name,number,amt);
        obj.display();

        System.out.println("-----------------");
        System.out.print("Enter the depositing amount : $");
        float deposi=sc.nextFloat();
        obj.deposit(deposi);
        
        System.out.println("-----------------");

        System.out.print("Enter the withdrawing amount : $");
        float withdr=sc.nextFloat();
        obj.withdraw(withdr);
        obj.display();
       

    }
}
