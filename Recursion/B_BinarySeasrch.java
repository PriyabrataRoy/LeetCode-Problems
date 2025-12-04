package Recursion;

public class B_BinarySeasrch {
    static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target > arr[mid]){
            binarySearch(arr, target, mid+1, end);
        }
        return binarySearch(arr,target,start,mid-1);
    }

    public static void main(String as[]){
        int[] arr = {1,2,3,56,78,90};
        int target = 1;

        int ans = binarySearch(arr, target, 0, arr.length-1);

        System.out.println(ans);
    }
}
