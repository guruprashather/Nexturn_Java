class calc {
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}
public class construcadd{
        public static void main(String[] args) {
            int num1=9;
            int num2=3;
            calc obj=new calc();
            int result=obj.add(num1,num2);
            System.out.println(result);
        }
}