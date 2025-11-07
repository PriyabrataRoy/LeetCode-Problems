
package Sorting;
import java.util.ArrayList;
import java.util.List;

public class D2_Find_Disappeared_Numbers {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        // Place each number at its correct index (Cyclic Sort)
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        // Collect missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        D2_Find_Disappeared_Numbers obj = new D2_Find_Disappeared_Numbers();

        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr2 = {1, 1};
        int[] arr3 = {2, 2};

        System.out.println("Missing numbers (arr1): " + obj.findDisappearedNumbers(arr1));
        System.out.println("Missing numbers (arr2): " + obj.findDisappearedNumbers(arr2));
        System.out.println("Missing numbers (arr3): " + obj.findDisappearedNumbers(arr3));
    }
}
