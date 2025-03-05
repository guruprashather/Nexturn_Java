public class largestfunx {
    public static int findMax(int a,int b)
    {
         if(a>b){
            return a;
         }  
         else{
            return b;
         }
    }
    public static void main(String[] args) {
        int a=7,b=6;
        int max=findMax(a, b);
        System.out.println(max);
    }
}
