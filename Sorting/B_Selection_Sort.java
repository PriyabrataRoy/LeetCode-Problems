package Sorting;
import java.util.Arrays;

public class B_Selection_Sort {

    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int max = arraymax(arr,last);
            swap(arr,last,max);
        }
    }

    static int arraymax(int[] arr, int last){
        int max = 0;

        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int last,int max){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;

    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,1,-1,0};
        // What happens:
        // arr is created in memory.
        // SelectionSort(arr) is called → it receives the reference of the same array.
        // Inside SelectionSort, it calls swap(arr, last, max) which modifies the original array.
        // Since it’s the same array object, all changes remain even after the function ends.
        // When you print arr in main, you see the sorted version, not the old one.
        ////In Java, if you pass an array to a function, the changes made inside that function affect the original array because both refer to the same memory location.That's why although the function is void stil we get the modify array
        
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
