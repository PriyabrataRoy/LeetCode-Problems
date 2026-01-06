package Recursion.Sorting;

import java.util.Arrays;

public class E_Quick_Sort {

    static void quickSort(int[] arr,int low,int high){
        if(low >= high){
            return ;
        }
        int i =low;
        int j = high;
        int pivot = arr[low + (high-low)/2];

        while(i<=j){
            while(arr[i]< pivot) {
                i++;
            }
            while(arr[j]>pivot){
               j--; 
            } 

            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, low, j);
        quickSort(arr, i,high);


    }

    public static void main(String[] args) {
        int[] arr = {5,4,20,2,1};
        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}