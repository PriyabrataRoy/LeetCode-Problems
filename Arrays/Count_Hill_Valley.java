public class Count_Hill_Valley {
    public int countHillValley(int[] nums) {
        int j = 0; // track last distinct element
        int count = 0;
        int n = nums.length - 1;

        for (int i = 1; i < n; i++) {
            // check if current element is hill or valley
            if ((nums[i] > nums[j] && nums[i] > nums[i + 1]) ||
                (nums[i] < nums[j] && nums[i] < nums[i + 1])) {
                count++;
                j = i; // update last distinct index
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Count_Hill_Valley obj = new Count_Hill_Valley();

        int[] nums1 = {2, 4, 1, 1, 6, 5};
        int[] nums2 = {6, 6, 5, 5, 4, 1};
        int[] nums3 = {1, 2, 3, 4, 5};

        System.out.println("Count (nums1): " + obj.countHillValley(nums1));
        System.out.println("Count (nums2): " + obj.countHillValley(nums2));
        System.out.println("Count (nums3): " + obj.countHillValley(nums3));
    }
}
