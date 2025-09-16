//https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/#expected-approach-olog-n-time-and-o1-space
public class Rotation_Count_in_a_Rotated_Sorted_Array {
    public int findKRotation(int arr[]) {
        return findSmallestElement(arr);
    }

    public int findSmallestElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else { 
                end = mid -1;
            }
        }
        return 0;
    }

  
    public static void main(String[] args) {
        Rotation_Count_in_a_Rotated_Sorted_Array solution = new Rotation_Count_in_a_Rotated_Sorted_Array();
        
        int[] arr1 = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("Rotations: " + solution.findKRotation(arr1)); // 3

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Rotations: " + solution.findKRotation(arr2)); // 0

        int[] arr3 = {3, 4, 5, 1, 2};
        System.out.println("Rotations: " + solution.findKRotation(arr3)); // 3
    }
}
