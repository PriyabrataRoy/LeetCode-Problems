//Span Of Array Means Maximuum Element - Minimum Element if an array
import java.util.*;
public class SpanOfArray {
    public static int ArraySpan(int arr[]) {
       int max= arr[0];
       int min = arr[0];

       //output
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return max-min;
    }
    public static void main(String as[]){
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter The Length Of The Array = ");
        int n=ob.nextInt();
        int arr[] = new int[n];
        //input 
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter The No. = ");
            arr[i] = ob.nextInt();
        }

        System.out.print("Your Array Of Span Is = "+ArraySpan(arr));
        
    }
}