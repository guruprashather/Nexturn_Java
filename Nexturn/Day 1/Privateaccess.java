 class privateEx {
    private int num=123;
    void showcase(){
        System.out.println(num);
    }
    
}
public class Privateaccess{
    public static void main(String[] args) {
        privateEx obj=new privateEx();
        obj.showcase();
 
    }
}
