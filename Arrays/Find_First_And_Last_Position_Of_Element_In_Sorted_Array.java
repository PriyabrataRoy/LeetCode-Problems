public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);
        int[] ans = { startIndex, endIndex };
        return ans;
    }

    int search(int[] nums, int target, boolean searchIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (searchIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Find_First_And_Last_Position_Of_Element_In_Sorted_Array sol = new Find_First_And_Last_Position_Of_Element_In_Sorted_Array();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = sol.searchRange(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
