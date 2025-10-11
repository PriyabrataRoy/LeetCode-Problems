public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) { // min is in right half
                start = mid + 1;
            } else {                     // min is in left half (including mid)
                end = mid;
            }
        }
        return nums[end]; // or nums[start]
    }

    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array obj = new Find_Minimum_in_Rotated_Sorted_Array();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println("Min of nums1: " + obj.findMin(nums1));
        System.out.println("Min of nums2: " + obj.findMin(nums2));
        System.out.println("Min of nums3: " + obj.findMin(nums3));
    }
}
