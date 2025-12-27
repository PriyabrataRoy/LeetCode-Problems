package Recursion.ArraysUsingRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class A_ArraySortedOrNot {
    
    static boolean sortedOrNot(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sortedOrNot(arr, i+1);

    }

   
    public static void main(String[] args) {

        // Scanner ob = new Scanner(System.in);
        // int[] arr = new int[5];
        // System.out.println("Enter The Numbers = ");
        // for(int i=0;i<=arr.length-1;i++){
        //     arr[i] = ob.nextInt();
        // }
        int[] arr = {1,2,3,41,5};
        System.out.println(Arrays.toString(arr));

        boolean ans = sortedOrNot(arr,0);
        System.out.println(ans);
    }
}
