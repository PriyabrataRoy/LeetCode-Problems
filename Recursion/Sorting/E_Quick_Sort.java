package Recursion.Sorting;

import java.util.Arrays;

public class E_Quick_Sort {

   
    static void quickSort(int[] arr, int low, int high) {

        
        // If the subarray has 0 or 1 element, it is already sorted
        if (low >= high) {
            return;
        }

        
        int i = low;        
        int j = high;       

        // Choose pivot as middle element
        int pivot = arr[low + (high - low) / 2];

        // Partition the array around the pivot
        while (i <= j) {

            // Move i forward until an element >= pivot is found
            while (arr[i] < pivot) {
                i++;
            }

            // Move j backward until an element <= pivot is found
            while (arr[j] > pivot) {
                j--;
            }

            
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move both pointers to avoid infinite loop
                i++;
                j--;
            }
        }

        // Recursively sort the left part
        quickSort(arr, low, j);

        // Recursively sort the right part
        quickSort(arr, i, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4,3, 2, 1};

        quickSort(arr, 0, arr.length - 1);

       
        System.out.println(Arrays.toString(arr));
    }
}
