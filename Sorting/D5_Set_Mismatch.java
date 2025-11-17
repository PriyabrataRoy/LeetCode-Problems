import java.util.Arrays;

class D5_Set_Mismatch{
     public int[] findErrorNums(int[] nums) {
        int i = 0;

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

        // Find the mismatch (duplicate and missing)
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1}; // [duplicate, missing]
            }
        }

        return new int[]{}; // default return (should not happen)
    }

    public static void main(String[] args) {
        D5_Set_Mismatch obj = new D5_Set_Mismatch();

        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {3, 2, 2};
        int[] nums3 = {2, 3, 3, 4, 5};

        System.out.println("Result (nums1): " + Arrays.toString(obj.findErrorNums(nums1))); // [2, 3]
        System.out.println("Result (nums2): " + Arrays.toString(obj.findErrorNums(nums2))); // [2, 1]
        System.out.println("Result (nums3): " + Arrays.toString(obj.findErrorNums(nums3))); // [3, 1]
    }
}