public class largestno {
    public static void main(String[] args) {
        int[] arr={1,6,3,9,3};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
            
        }
        System.out.println("Largest element: "+max);
    }
}
