public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) { // if there is only 1 element
            return 0;
        }

        // if 1st element is peak
        if (nums[0] > nums[1]) {
            return 0;
        }

        // if last element is peak
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1; // skip first and last (already checked)
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) { // ascending part
                start = mid + 1;
            } else { // descending part
                end = mid - 1;
            }
        }

        return -1; 
    }

    
    public static void main(String[] args) {
        Find_Peak_Element obj = new Find_Peak_Element();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak index in nums1: " + obj.findPeakElement(nums1));
        System.out.println("Peak index in nums2: " + obj.findPeakElement(nums2));
    }
}
