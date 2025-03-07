class constru 
{
    String carname;
    int year;
    constru(String a,int b){
       carname=a;
       year=b;
    }
    void display(){
        System.out.println("CAr: "+carname+" Year "+year);
    }

}
public class Main
{
    public static void main(String[] args) {
        String name="Ford";
        int year=1969;
        constru obj=new constru(name,year);
        obj.display();
    }
}
