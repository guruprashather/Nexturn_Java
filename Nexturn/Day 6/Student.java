class details {
    String name;
    int rollno;
    char grade;
    details(String a,int b,char c){
        name = a;
        rollno=b;
        grade=c;

    }
    void display(){
        System.out.println("Student deatils");
        System.out.println("Name:" + name);
        System.out.println("Roll number:" + rollno);
        System.out.println("Grade" + grade);
    }
}
public class Student{
    public static void main(String[] args) {
        details obj=new details("Ramya", 265, 'A');
        obj.display();
    }
}
