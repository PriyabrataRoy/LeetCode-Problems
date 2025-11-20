package Sorting;

public class D6_First_Missing_Positive {
     public int firstMissingPositive(int[] nums) {
        int i = 0;

        // Place each positive number at its correct index
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        // Find the first index where index+1 doesn't match the value
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // If all numbers are placed correctly, missing number is n+1
        return nums.length + 1;
    }

    public static void main(String[] args) {
       D6_First_Missing_Positive obj = new D6_First_Missing_Positive ();

        int[] nums1 = {1, 2, 0};
        int[] nums2 = {3, 4, -1, 1};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("First missing positive (nums1): " + obj.firstMissingPositive(nums1)); // 3
        System.out.println("First missing positive (nums2): " + obj.firstMissingPositive(nums2)); // 2
        System.out.println("First missing positive (nums3): " + obj.firstMissingPositive(nums3)); // 1
    }
}
