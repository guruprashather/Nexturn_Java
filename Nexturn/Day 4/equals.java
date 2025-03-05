import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,4,3};
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        
    }
}
