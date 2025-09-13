
// Question: Search in Rotated Sorted Array

public class Search_In_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int pivot = searchPivot(nums);

        // if array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if target is pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // if target is in left side
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);
        }

        // else target is in right side
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int searchPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // array not rotated
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

   
    public static void main(String[] args) {
        Search_In_Rotated_Sorted_Array sol = new Search_In_Rotated_Sorted_Array();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = sol.search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}
