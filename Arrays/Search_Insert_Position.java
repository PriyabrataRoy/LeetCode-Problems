public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

   
    public static void main(String[] args) {
        Search_Insert_Position obj = new Search_Insert_Position();
        int[] nums = {1, 3, 5, 6};
        int target = 4;

        int result = obj.searchInsert(nums, target);
        System.out.println("Target position: " + result);
    }
}
