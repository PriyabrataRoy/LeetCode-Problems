package Sorting;

import java.util.ArrayList;
import java.util.List;

public class D4_Find_All_Duplicates_in_an_Array {
     public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();

        // Place each number at its correct index (Cyclic Sort)
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        // Collect duplicates (numbers not in correct position)
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        D4_Find_All_Duplicates_in_an_Array obj = new D4_Find_All_Duplicates_in_an_Array();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1, 2};
        int[] nums3 = {1};

        System.out.println("Duplicates in nums1: " + obj.findDuplicates(nums1)); // [2, 3]
        System.out.println("Duplicates in nums2: " + obj.findDuplicates(nums2)); // [1]
        System.out.println("Duplicates in nums3: " + obj.findDuplicates(nums3)); // []
    }
}
