public class Split_Array_Largest_Sum {

    public int splitArray(int[] nums, int k) {
        int start = 0; // max element
        int end = 0;   // sum of all elements

        for (int item : nums) {
            start = Math.max(start, item); // largest single element
            end += item;                  // total sum
        }

        // binary search between max element and total sum
        while (start < end) {
            int mid = start + (end - start) / 2;

            int part = 1; // number of subarrays
            int sum = 0;  // current subarray sum

            for (int i : nums) {
                sum += i;
                if (sum > mid) { // need new subarray
                    sum = i;
                    part++;
                }
            }

            if (part <= k) {
                end = mid; // try smaller max sum
            } else {
                start = mid + 1; // try larger max sum
            }
        }

        return end; // or start (both same here)
    }

    // main method for testing
    public static void main(String[] args) {
        Split_Array_Largest_Sum obj = new Split_Array_Largest_Sum();

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int result = obj.splitArray(nums, k);
        System.out.println("Minimum largest subarray sum: " + result);
    }
}
