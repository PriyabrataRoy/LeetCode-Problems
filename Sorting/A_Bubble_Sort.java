package Sorting;

import java.util.Arrays;

public class A_Bubble_Sort {
    static int[] sort (int[] arr){
       
        for (int i=0;i<arr.length-1;i++){
             boolean sorted = true;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    sorted = false;
                }
            }

            if(sorted){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        System.out.println(Arrays.toString(sort(arr)));
    }


}
