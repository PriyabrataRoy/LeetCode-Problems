// Cyclic Sort:
// - Works only for numbers 1 to n
// - While index i has wrong element:
//       swap arr[i] with arr[arr[i] - 1]
// - Else move i++
// - Time: O(n)
// - Space: O(1)

package Sorting;

import java.util.Arrays;

public class D_Cyclic_Sort {
    static void CyclicSort(int[] arr){
        int i=0;
         while (i < arr.length) {
        int correctIndex = arr[i] - 1;
        if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
            int temp = arr[correctIndex];
            arr[correctIndex] = arr[i];
            arr[i] = temp;
        } else {
            i++;
        }
    }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,9,3,2,1,};
        CyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
