import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
       
        int[] nums = {1, 1, 2};

        RemoveDuplicatesfromSortedArray sol = new RemoveDuplicatesfromSortedArray();
        int k = sol.removeDuplicates(nums);

        System.out.println("Output k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        
    }
}
