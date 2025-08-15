import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String as[]){
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter The Range For 1st Array = ");
        int n1=ob.nextInt();
        System.out.print("Enter The Range For 2nd Array And It Must Be Greater Than the 1st Array Range = ");
         int n2=ob.nextInt();

         int arr1[] = new int[n1];
         int arr2[] = new int[n2];

        //Input For 1st Array
        for(int i=0;i<n1;i++){
            System.out.print("Enter The No. For 1st Array = ");
            arr1[i] = ob.nextInt();
        }

        //Input For 2nd Array
        for(int i=0;i<n2;i++){
            System.out.print("Enter The No. For 2nd Array = ");
            arr2[i] = ob.nextInt();
        }

      //Output
      int diff[] = new int[n2];
      int i = arr1.length-1;
      int j = arr2.length-1;
      int k =diff.length-1; 
      int c=0;
      
      while(k>=0){
        int d=0;
        int arr1v = i>=0 ? arr1[i] : 0;
        if(arr2[j]+c >= arr1v){
            d= arr2[j] + c - arr1v;
            c=0;
        }
        else{
            d = arr2[j] + c + 10 - arr1v;
            c=-1;
        }
        diff[k] = d;
        i--;
        j--;
        k--;
      }
      //Print The Result
      System.out.println(Arrays.toString(arr2));
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(diff));
      System.out.print("Ans = ");
      int idx = 0;
      while(idx<diff.length){
        if(diff[idx]!= 0){
            System.out.print(diff[idx]);
        }
        idx++;
      }
        }
    
        }

