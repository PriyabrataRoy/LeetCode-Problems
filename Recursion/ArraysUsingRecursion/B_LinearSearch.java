package Recursion.ArraysUsingRecursion;

public class B_LinearSearch {
    static int searchingIndex(int[] arr,int target,int i){
        if( i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return searchingIndex(arr, target, i+1);
    }

    static boolean searching(int[] arr , int target , int i){
        if(i == arr.length){
            return false;
        }
        return arr[i]==target || searching(arr, target, i+1); // || this means once 1st condition is true it directly return where its calls 
    }

    public static void main(String as[]){
        int[] arr = {1,3,4,5,65,7,8};
        int ans = searchingIndex(arr, 66, 0);
        System.out.println(ans);

        boolean ans2 = searching(arr, 66, 0);
        System.out.println(ans2);
    }
}
