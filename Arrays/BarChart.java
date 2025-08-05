import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
   
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter The Array Range = ");
        int n = ob.nextInt();
        int [] arr = new int[n];

        //input
        for(int i=0;i<n;i++){
            System.out.print("Enter The No. = ");
            arr[i] = ob.nextInt();
        }

        //Finding Max Element
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        //Solution
        for (int i=max;i>0;i--){
           for(int j=0;j<arr.length;j++){
            if(arr[j]>=i){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
           }
           System.out.println();
          
        }

        //Printing the Array 
        System.out.print("Elements In Array = "+Arrays.toString(arr));
    }
}
