package Recursion.Sorting;

import java.util.Arrays;

public class D_Merge_Sort {
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));//here it tooks before mid element 
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int[] mix = new int[left.length + right.length];

        int i=0,j=0,k=0;

        while (i < left.length && j < right.length) {
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }

            k++;
        }

        //if any one array is not completed on that time rest of the element must be go on the last 

        while (i< left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,9,19,32,4,6,8};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));;
    }
}
