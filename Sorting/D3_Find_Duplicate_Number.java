package Sorting;

public class D3_Find_Duplicate_Number {

     public int findDuplicate(int[] nums) {
        int i = 0;

        // Place each number at its correct index using Cyclic Sort
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

        // After sorting, the duplicate number will not be at its correct index
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i]; // duplicate found
            }
        }

        return -1; // fallback (shouldn't happen)
    }

    public static void main(String[] args) {
       D3_Find_Duplicate_Number obj = new D3_Find_Duplicate_Number();

        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] nums3 = {2, 2, 2, 2, 2};

        System.out.println("Duplicate in nums1: " + obj.findDuplicate(nums1)); // 2
        System.out.println("Duplicate in nums2: " + obj.findDuplicate(nums2)); // 3
        System.out.println("Duplicate in nums3: " + obj.findDuplicate(nums3)); // 2
    }
    
}
