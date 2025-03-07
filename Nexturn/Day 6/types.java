class car {
    String name;
    int year;
    car(){                  //Default Constructor
       name="Ford";
       year=1969;
    }
    car(String a,int b){          //Parametrized Constructor
        name=a;
        year=b;
    }
    void display1(){
        System.out.println("Default constructor :");
        System.out.println("Car name :" + name );
        System.out.println("Year :" + year);
        System.out.println("-------------------------");
    }
    void display2(){
        System.out.println("Parametrized constructor :");
        System.out.println("Car name :" + name );
        System.out.println("Year :" + year);
    }
}
public class types{
    public static void main(String[] args) {
        car obj1=new car();
        car obj2=new car("Toyoto",1980);
        obj1.display1();
        obj2.display2();
    }
}
